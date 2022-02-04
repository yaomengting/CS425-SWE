package com.course.registration.sys.domainservice;

import com.course.registration.sys.appservice.ICourseRegistrationAppService;
import com.course.registration.sys.model.Course;
import com.course.registration.sys.model.CourseRegistration;
import com.course.registration.sys.model.Status;
import com.course.registration.sys.model.Student;
import com.course.registration.sys.repository.CourseRegistrationRepository;
import com.course.registration.sys.repository.CourseRepository;
import com.course.registration.sys.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;
import java.util.Optional;

@Service
@Transactional
public class CourseRegistrationDomainService implements ICourseRegistrationAppService {

    @Autowired
    private CourseRegistrationRepository courseRegistrationRepository;


    @Autowired
    private StudentRepository studentRepository;

    @Autowired
    private CourseRepository courseRepository;

    public List<CourseRegistration> getCourseRegistrations(){
        return courseRegistrationRepository.findAll();
    }

    public CourseRegistration getCourseRegistrationById(Long id){
        Optional<CourseRegistration> courseRegistration = courseRegistrationRepository.findById(id);
        return courseRegistration.get();
    }

    public CourseRegistration createCourseRegistration(CourseRegistration courseRegistration) {

        Optional<Student> optional = studentRepository.findById(courseRegistration.getStudent().getId());
        Student student = optional.get();
        Optional<Course> optCOurse = courseRepository.findById(courseRegistration.getCourse().getId());
        Course course = optCOurse.get();
        courseRegistration.setStudent(student);
        courseRegistration.setCourse(course);
        courseRegistration.setStatus(Status.PENDING);
        return courseRegistrationRepository.save(courseRegistration);
    }

    public CourseRegistration updateCourseRegistration(Long id, CourseRegistration courseRegistration){
        Optional<CourseRegistration> vehicleToUpdate = courseRegistrationRepository.findById(id);
        courseRegistration.setId(id);
        Optional<Student> optional = studentRepository.findById(courseRegistration.getStudent().getId());
        Student student = optional.get();
        Optional<Course> optCOurse = courseRepository.findById(courseRegistration.getCourse().getId());
        Course course = optCOurse.get();
        courseRegistration.setStudent(student);
        courseRegistration.setCourse(course);
        courseRegistrationRepository.save(courseRegistration);
        return courseRegistration;
    }

    public List<CourseRegistration> getCourseRegistrationByStudentIdCourseId(Long studentId, Long courseId){
        return courseRegistrationRepository.getCourseRegistration(studentId,courseId);
    }
    public void deleteCourseRegistration(Long id){
        Optional<CourseRegistration> vehicleToDelete = courseRegistrationRepository.findById(id);
        if(vehicleToDelete.isPresent()){
            courseRegistrationRepository.delete(vehicleToDelete.get());
        }

    }


}
