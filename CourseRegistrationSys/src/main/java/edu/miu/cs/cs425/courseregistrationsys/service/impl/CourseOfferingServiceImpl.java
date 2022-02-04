package edu.miu.cs.cs425.courseregistrationsys.service.impl;

import edu.miu.cs.cs425.courseregistrationsys.model.CourseOffering;
import edu.miu.cs.cs425.courseregistrationsys.repository.CourseOfferingRepository;
import edu.miu.cs.cs425.courseregistrationsys.service.CourseOfferingService;
import edu.miu.cs.cs425.courseregistrationsys.service.CourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CourseOfferingServiceImpl implements CourseOfferingService {
    private CourseOfferingRepository courseOfferingRepository;
    @Autowired
    public CourseOfferingServiceImpl(CourseOfferingRepository courseOfferingRepository) {
        this.courseOfferingRepository = courseOfferingRepository;
    }

    @Override
    public CourseOffering getCourseOfferingById(Integer id) {
        return courseOfferingRepository.findById(id).orElse(null);
    }

    @Override
    public CourseOffering addNewCourseOffering(CourseOffering newCourseOffering) {
        return courseOfferingRepository.save(newCourseOffering);
    }

    @Override
    public List<CourseOffering> getAllCourseOffering() {
        return courseOfferingRepository.findAll();
    }
}
