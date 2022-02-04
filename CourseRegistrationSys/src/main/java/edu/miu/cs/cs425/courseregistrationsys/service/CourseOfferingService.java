package edu.miu.cs.cs425.courseregistrationsys.service;

import edu.miu.cs.cs425.courseregistrationsys.model.AcademicBlock;
import edu.miu.cs.cs425.courseregistrationsys.model.Course;
import edu.miu.cs.cs425.courseregistrationsys.model.CourseOffering;
import edu.miu.cs.cs425.courseregistrationsys.model.CourseOffering;

import java.util.List;

public interface CourseOfferingService {
    CourseOffering getCourseOfferingById(Integer id);
    CourseOffering addNewCourseOffering(CourseOffering newCourseOffering);
    List<CourseOffering> getAllCourseOffering();

}
