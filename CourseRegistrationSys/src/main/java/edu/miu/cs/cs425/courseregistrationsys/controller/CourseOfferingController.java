package edu.miu.cs.cs425.courseregistrationsys.controller;

import edu.miu.cs.cs425.courseregistrationsys.model.CourseOffering;
import edu.miu.cs.cs425.courseregistrationsys.model.Student;
import edu.miu.cs.cs425.courseregistrationsys.service.CourseOfferingService;
import edu.miu.cs.cs425.courseregistrationsys.service.StudentService;
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
@RequestMapping(value = "/courseOffering")
public class CourseOfferingController {
    private CourseOfferingService courseOfferingService;
    @Autowired
    public CourseOfferingController(CourseOfferingService courseOfferingService) {
        this.courseOfferingService = courseOfferingService;
    }

    @GetMapping(value={"/list"})
    public ModelAndView listCourseOfferings(){
        ModelAndView modelAndView = new ModelAndView();
        List<CourseOffering> courseOfferings = courseOfferingService.getAllCourseOffering();
        modelAndView.addObject("courseOfferings", courseOfferings);
        modelAndView.setViewName("courseOffering/list");
        return modelAndView;
    }

    @GetMapping(value = {"/add"})
    public String displayNewCourseOfferingForm(Model model) {
        model.addAttribute("courseOffering", new CourseOffering());
        return "courseOffering/new";
    }

    @PostMapping(value = {"/add"})
    public String addNewCourseOffering(@Valid @ModelAttribute("courseOffering") CourseOffering courseOffering,
                                BindingResult bindingResult, Model model){
        if(bindingResult.hasErrors()){
            model.addAttribute("errors",bindingResult.getAllErrors());
            return "courseOffering/new";
        }
        courseOffering = courseOfferingService.addNewCourseOffering(courseOffering);
        return "redirect:/courseOffering/list";
    }
}
