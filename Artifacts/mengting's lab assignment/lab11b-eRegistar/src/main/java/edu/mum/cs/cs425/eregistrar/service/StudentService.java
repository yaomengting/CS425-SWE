package edu.mum.cs.cs425.eregistrar.service;

import edu.mum.cs.cs425.eregistrar.model.Student;

import java.time.LocalDate;
import java.util.List;

public interface StudentService {

    public abstract List<Student> getAllStudents();
    public abstract Student saveStudent(Student student);
    public abstract Student getStudentById(Integer studentId);
    public abstract Student updateStudentById(Student editedStudent, Integer studentId);
    public abstract void deleteStudentById(Integer studentId);
//    public abstract List<Student> searchStudents(String searchString);
//    public abstract List<Student> findStudentEnrollmentDateLaterThan(LocalDate dateOfEnrollment);
    public abstract List<Student> findStudentGpaGreaterThan();

}
