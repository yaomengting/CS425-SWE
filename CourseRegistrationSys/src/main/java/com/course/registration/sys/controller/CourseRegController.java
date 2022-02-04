package com.course.registration.sys.controller;

import com.course.registration.sys.appservice.ICourseRegistrationAppService;
import com.course.registration.sys.model.CourseRegistration;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/course/registration")
public class CourseRegController {
    /**
     * Injecting courseService
     */
    @Autowired
    private ICourseRegistrationAppService courseAppService;

    /**
     * retreive all the courses from database
     * @return
     */
    @GetMapping
    public ResponseEntity<List<CourseRegistration>> getCourseRegistrations(){
        return ResponseEntity.ok(courseAppService.getCourseRegistrations());
    }

    /**
     * retrieve vechile by id
     * @param id
     * @return
     */
    @GetMapping("/{id}")
    public ResponseEntity<CourseRegistration> getCourseRegistrationById(@PathVariable Long id){
        return ResponseEntity.ok(courseAppService.getCourseRegistrationById(id));
    }

    /**
     * save course to db
     * @param courseList
     * @return
     */
    @PostMapping
    public ResponseEntity<Object> createCourseRegistration(@Valid @RequestBody List<CourseRegistration>  courseList){
        for(CourseRegistration course: courseList) {
            List<CourseRegistration> crList = courseAppService.getCourseRegistrationByStudentIdCourseId(course.getStudent().getId(), course.getCourse().getId());
            if (crList == null || crList.size() <= 0) {
                CourseRegistration courseDTOToSave = courseAppService.createCourseRegistration(course);
            } else {
                courseAppService.updateCourseRegistration(crList.get(0).getId(), course);
            }
        }
        return new ResponseEntity<>("CourseRegistration saved successfully", HttpStatus.OK);
    }

    /**
     * update course of particular id
     * @param id
     * @param courseDTO
     * @return
     */
    @PutMapping("/{id}")
    public ResponseEntity<Object> updateCourseRegistration(@PathVariable Long id,
                                                           @Valid @RequestBody CourseRegistration courseDTO){
        CourseRegistration courseDTOToUpdate = courseAppService.updateCourseRegistration(id, courseDTO);
        return new ResponseEntity<>("CourseRegistration updated Successfully", HttpStatus.OK);
    }

    /**
     * delete course by id
     * @param id
     */
    @DeleteMapping("/{id}")
    public void deleteCourseRegistration(@PathVariable Long id){
        courseAppService.deleteCourseRegistration(id);
    }


}
