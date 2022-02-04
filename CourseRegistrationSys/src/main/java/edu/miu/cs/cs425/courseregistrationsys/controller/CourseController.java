package edu.miu.cs.cs425.courseregistrationsys.controller;

import edu.miu.cs.cs425.courseregistrationsys.model.Course;
import edu.miu.cs.cs425.courseregistrationsys.service.CourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.validation.Valid;
import java.util.List;

@Controller
@RequestMapping(value = "/course")
public class CourseController {
    private CourseService courseService;

    @Autowired
    public CourseController(CourseService courseService) {
        this.courseService = courseService;
    }
    @GetMapping(value={"/list"})
    public ModelAndView listCourses(){
        ModelAndView modelAndView = new ModelAndView();
        List<Course> courses = courseService.getCourses();
        modelAndView.addObject("courses", courses);
        modelAndView.setViewName("course/list");
        return modelAndView;
    }

    @GetMapping(value = {"/add"})
    public String displayNewCourseForm(Model model) {
        model.addAttribute("course", new Course());
        return "course/new";
    }

    @PostMapping(value = {"/add"})
    public String addNewCourse(@Valid @ModelAttribute("course") Course course,
                                BindingResult bindingResult, Model model){
        if(bindingResult.hasErrors()){
            model.addAttribute("errors",bindingResult.getAllErrors());
            return "course/new";
        }
        course = courseService.addNewCourse(course);
        return "redirect:/course/list";
    }

}
