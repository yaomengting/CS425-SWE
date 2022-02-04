package edu.miu.cs.cs425.courseregistrationsys.service;

import edu.miu.cs.cs425.courseregistrationsys.model.Student;

import java.util.List;

public interface StudentService {
    Student getStudentById(Integer id);
    List<Student> getAllStudents();
    Student addNewStudent(Student newStudent);

}
