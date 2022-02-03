package edu.miu.cs.cs425.courseregistrationsys.controller;

import edu.miu.cs.cs425.courseregistrationsys.model.Course;
import edu.miu.cs.cs425.courseregistrationsys.service.CourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/course")
public class CourseController {

    @Autowired
    private CourseService courseService;

    @GetMapping(value = "/list")
    public List<Course> findAll() {
        return courseService.getCourses();
    }

    @PutMapping(value = "/update/{id}")
    public Course updateCourseById( @RequestBody Course course, @PathVariable Integer id) {
        return courseService.updateCourseById(course,id);
    }

    @PostMapping
    public Course saveCourse(@RequestBody Course course) {
        return courseService.saveCourse(course);
    }

}
