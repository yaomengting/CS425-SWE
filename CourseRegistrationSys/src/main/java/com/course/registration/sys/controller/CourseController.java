package com.course.registration.sys.controller;

import com.course.registration.sys.appservice.ICourseAppService;
import com.course.registration.sys.model.Course;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/course")
public class CourseController {
    /**
     * Injecting courseService
     */
    @Autowired
    private ICourseAppService courseAppService;

    /**
     * retreive all the courses from database
     * @return
     */
    @GetMapping
    public ResponseEntity<List<Course>> getCourses(){
        return ResponseEntity.ok(courseAppService.getCourses());
    }

    /**
     * retrieve vechile by id
     * @param id
     * @return
     */
    @GetMapping("/{id}")
    public ResponseEntity<Course> getCourseById(@PathVariable Long id){
        return ResponseEntity.ok(courseAppService.getCourseById(id));
    }

    /**
     * save course to db
     * @param courseDTO
     * @return
     */
    @PostMapping
    public ResponseEntity<Object> createCourse(@Valid @RequestBody Course courseDTO){
        Course courseDTOToSave = courseAppService.createCourse(courseDTO);
        return new ResponseEntity<>("Course saved successfully", HttpStatus.OK);
    }

    /**
     * update course of particular id
     * @param id
     * @param courseDTO
     * @return
     */
    @PutMapping("/{id}")
    public ResponseEntity<Object> updateCourse(@PathVariable Long id,
                                               @Valid @RequestBody Course courseDTO){
        Course courseDTOToUpdate = courseAppService.updateCourse(id, courseDTO);
        return new ResponseEntity<>("Course updated Successfully", HttpStatus.OK);
    }

    /**
     * delete course by id
     * @param id
     */
    @DeleteMapping("/{id}")
    public void deleteCourse(@PathVariable Long id){
        courseAppService.deleteCourse(id);
    }


}
