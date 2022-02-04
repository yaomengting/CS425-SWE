package edu.miu.cs.cs425.courseregistrationsys.service.impl;

import edu.miu.cs.cs425.courseregistrationsys.model.Student;
import edu.miu.cs.cs425.courseregistrationsys.repository.StudentRepository;
import edu.miu.cs.cs425.courseregistrationsys.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentServiceImpl implements StudentService {
    private StudentRepository studentRepository;
    @Autowired
    public StudentServiceImpl(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }

    @Override
    public Student getStudentById(Integer id) {
        return studentRepository.findById(id).orElse(null);
    }

    @Override
    public List<Student> getAllStudents() {
        return studentRepository.findAll();
    }

    @Override
    public Student addNewStudent(Student newStudent) {
        return studentRepository.save(newStudent);
    }

}
