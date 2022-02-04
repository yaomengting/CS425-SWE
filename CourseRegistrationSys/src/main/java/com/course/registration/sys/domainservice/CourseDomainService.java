package com.course.registration.sys.domainservice;

import com.course.registration.sys.appservice.ICourseAppService;
import com.course.registration.sys.model.Course;
import com.course.registration.sys.repository.CourseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.Date;
import java.util.List;
import java.util.Optional;

@Service
@Transactional
public class CourseDomainService implements ICourseAppService {

    @Autowired
    private CourseRepository courseRepository;

    public List<Course> getCourses(){
        return courseRepository.findAll();
    }

    public Course getCourseById(Long id){
        Optional<Course> vehicle = courseRepository.findById(id);
            return vehicle.get();
    }

    public Course createCourse(Course vehicle) {
        return courseRepository.save(vehicle);
    }

    public Course updateCourse(Long id, Course vehicle){
        Optional<Course> vehicleToUpdate = courseRepository.findById(id);
        vehicle.setId(id);
        courseRepository.save(vehicle);
        return vehicle;
    }

    public void deleteCourse(Long id){
        Optional<Course> vehicleToDelete = courseRepository.findById(id);
        if(vehicleToDelete.isPresent()){
            courseRepository.delete(vehicleToDelete.get());
        }

    }


}
