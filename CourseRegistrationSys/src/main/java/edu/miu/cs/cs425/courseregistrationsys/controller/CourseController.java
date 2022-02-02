package edu.miu.cs.cs425.courseregistrationsys.controller;

import edu.miu.cs.cs425.courseregistrationsys.model.Course;
import edu.miu.cs.cs425.courseregistrationsys.service.CourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/course")
public class CourseController {

    private CourseService courseService;

    @Autowired
    public CourseController(CourseService courseService) {
        this.courseService = courseService;
    }

    @GetMapping(value = "/list")
    public List<Course> findAll() {
        return courseService.getCourses();
    }
}
