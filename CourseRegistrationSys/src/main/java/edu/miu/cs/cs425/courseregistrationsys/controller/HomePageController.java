package edu.miu.cs.cs425.courseregistrationsys.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomePageController {
    @GetMapping(value = {"/", "/course-registration", "/home"})
    public String displayHomePage(){
        return "home/index";
    }
}
