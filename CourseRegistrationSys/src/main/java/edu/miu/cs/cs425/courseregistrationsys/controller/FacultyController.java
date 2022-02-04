package edu.miu.cs.cs425.courseregistrationsys.controller;

import edu.miu.cs.cs425.courseregistrationsys.model.Course;
import edu.miu.cs.cs425.courseregistrationsys.model.Faculty;
import edu.miu.cs.cs425.courseregistrationsys.service.FacultyService;
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
@RequestMapping(value = "/faculty")
public class FacultyController {
    private FacultyService facultyService;
    @Autowired
    public FacultyController(FacultyService facultyService) {
        this.facultyService = facultyService;
    }
    @GetMapping(value={"/list"})
    public ModelAndView listFaculties(){
        ModelAndView modelAndView = new ModelAndView();
        List<Faculty> faculties = facultyService.getAllFaculty();
        modelAndView.addObject("faculties", faculties);
        modelAndView.setViewName("faculty/list");
        return modelAndView;
    }

    @GetMapping(value = {"/add"})
    public String displayNewFacultyForm(Model model) {
        model.addAttribute("faculty", new Faculty());
        return "faculty/new";
    }

    @PostMapping(value = {"/add"})
    public String addNewFaculty(@Valid @ModelAttribute("faculty") Faculty faculty,
                               BindingResult bindingResult, Model model){
        if(bindingResult.hasErrors()){
            model.addAttribute("errors",bindingResult.getAllErrors());
            return "faculty/new";
        }
        faculty = facultyService.addNewFaculty(faculty);
        return "redirect:/faculty/list";
    }
}
