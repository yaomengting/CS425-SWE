package com.course.registration.sys.repository;

import com.course.registration.sys.model.Course;
import com.course.registration.sys.model.CourseRegistration;
import com.grabRental.cs544.model.Vehicle;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.jpa.repository.Temporal;
import org.springframework.stereotype.Repository;

import java.util.Date;
import java.util.List;

@Repository
public interface CourseRegistrationRepository extends JpaRepository<CourseRegistration, Long> {

    @Query("SELECT cr FROM CourseRegistration cr WHERE cr.student.id = ?1 AND cr.course.id = ?2")
    List<CourseRegistration> getCourseRegistration(Long studentId, Long courseId);

}
