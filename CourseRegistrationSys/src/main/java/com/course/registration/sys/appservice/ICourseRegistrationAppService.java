package com.course.registration.sys.appservice;


import com.course.registration.sys.model.Course;
import com.course.registration.sys.model.CourseRegistration;

import java.util.List;

public interface ICourseRegistrationAppService {
    List<CourseRegistration> getCourseRegistrations();
    CourseRegistration getCourseRegistrationById(Long id);
    CourseRegistration createCourseRegistration(CourseRegistration vehicleDTO);
    CourseRegistration updateCourseRegistration(Long id, CourseRegistration vehicleDTO);
    void deleteCourseRegistration(Long id);
    List<CourseRegistration> getCourseRegistrationByStudentIdCourseId(Long studentId, Long courseId);

}
