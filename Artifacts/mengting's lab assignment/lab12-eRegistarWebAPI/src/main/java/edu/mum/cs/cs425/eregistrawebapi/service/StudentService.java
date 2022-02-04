package edu.mum.cs.cs425.eregistrawebapi.service;

import edu.mum.cs.cs425.eregistrawebapi.model.Student;

import java.util.List;

public interface StudentService {
    List<Student> getAllStudents();
    public abstract Student addNewStudent(Student newStudent);
    public abstract Student getStudentById(Integer studentId);
    public abstract Student updateStudentById(Student editedStudent, Integer studentId);
    public abstract void deleteStudentById(Integer studentId);
}
