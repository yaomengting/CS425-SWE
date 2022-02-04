package edu.miu.cs.cs425.courseregistrationsys.controller;

import edu.miu.cs.cs425.courseregistrationsys.model.Faculty;
import edu.miu.cs.cs425.courseregistrationsys.model.Student;
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
@RequestMapping(value = "/student")
public class StudentController {
    private StudentService studentService;
    @Autowired
    public StudentController(StudentService studentService) {
        this.studentService = studentService;
    }

    @GetMapping(value={"/list"})
    public ModelAndView listStudents(){
        ModelAndView modelAndView = new ModelAndView();
        List<Student> students = studentService.getAllStudents();
        modelAndView.addObject("students", students);
        modelAndView.setViewName("student/list");
        return modelAndView;
    }

    @GetMapping(value = {"/add"})
    public String displayNewStudentForm(Model model) {
        model.addAttribute("student", new Student());
        return "student/new";
    }

    @PostMapping(value = {"/add"})
    public String addNewStudent(@Valid @ModelAttribute("student") Student student,
                                BindingResult bindingResult, Model model){
        if(bindingResult.hasErrors()){
            model.addAttribute("errors",bindingResult.getAllErrors());
            return "student/new";
        }
        student = studentService.addNewStudent(student);
        return "redirect:/student/list";
    }
}
