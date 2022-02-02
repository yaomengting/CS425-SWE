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

    private CourseRepository courseRepository;
    @Autowired
    public CourseServiceImpl(CourseRepository courseRepository) {
        this.courseRepository = courseRepository;
    }

    @Override
    public List<Course> getCourses() {
        return courseRepository.findAll();
    }
}
