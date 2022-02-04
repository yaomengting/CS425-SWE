package com.course.registration.sys.domainservice;

import com.course.registration.sys.appservice.IStudentAppService;
import com.course.registration.sys.model.Student;
import com.course.registration.sys.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;
import java.util.Optional;

@Service
@Transactional
public class StudentDomainService implements IStudentAppService {

    @Autowired
    private StudentRepository courseRepository;

    public List<Student> getStudents(){
        return courseRepository.findAll();
    }

    public Student getStudentById(Long id){
        Optional<Student> student = courseRepository.findById(id);
        return student.get();
    }

    public Student createStudent(Student student) {
        return courseRepository.save(student);
    }

    public Student updateStudent(Long id, Student student){
        Optional<Student> studentToUpdate = courseRepository.findById(id);
        student.setId(id);
        courseRepository.save(student);
        return student;
    }

    public void deleteStudent(Long id){
        Optional<Student> studentToDelete = courseRepository.findById(id);
        if(studentToDelete.isPresent()){
            courseRepository.delete(studentToDelete.get());
        }

    }


}
