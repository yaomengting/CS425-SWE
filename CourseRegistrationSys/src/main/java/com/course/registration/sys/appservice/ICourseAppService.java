package com.course.registration.sys.appservice;


import com.course.registration.sys.model.Course;

import java.util.Date;
import java.util.List;

public interface ICourseAppService {
    List<Course> getCourses();
    Course getCourseById(Long id);
    Course createCourse(Course vehicleDTO);
    Course updateCourse(Long id, Course vehicleDTO);
    void deleteCourse(Long id);

}
