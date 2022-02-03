package edu.miu.cs.cs425.courseregistrationsys.service.impl;

import edu.miu.cs.cs425.courseregistrationsys.model.Course;
import edu.miu.cs.cs425.courseregistrationsys.repository.CourseRepository;
import edu.miu.cs.cs425.courseregistrationsys.service.CourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import javax.persistence.SecondaryTable;
import java.util.List;

@Service
public class CourseServiceImpl implements CourseService {
    @Autowired
    private CourseRepository courseRepository;

    @Override
    public List<Course> getCourses() {
        return courseRepository.findAll();
    }

    @Override
    public Course getCourseById(Integer id) {
        return courseRepository.getById(id);
    }

    @Override
    public Course updateCourseById(Course editedCourse, Integer id) {
        return courseRepository.findById(id)
        .map(courseToUpdate -> {
            courseToUpdate.setCode(editedCourse.getCode());
            courseToUpdate.setName(editedCourse.getName());
            courseToUpdate.setDescription(editedCourse.getDescription());
            return courseRepository.save(courseToUpdate);
        }).orElseGet(() -> {
                    return courseRepository.save(editedCourse);

        });
    }

    @Override
    public Course saveCourse(Course course) {
        return null;

    }
}
