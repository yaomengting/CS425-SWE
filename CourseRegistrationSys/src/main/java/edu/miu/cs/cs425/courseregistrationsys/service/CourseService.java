package edu.miu.cs.cs425.courseregistrationsys.service;

import edu.miu.cs.cs425.courseregistrationsys.model.Course;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

public interface CourseService {
    List<Course> getCourses();
    public abstract Course getCourseById(Integer id);
    public abstract Course updateCourseById(Course editedCourse,Integer id);
    public abstract Course saveCourse(Course course);

}
