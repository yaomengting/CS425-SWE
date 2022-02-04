package com.course.registration.sys.appservice;


import com.course.registration.sys.model.Course;
import com.course.registration.sys.model.Student;

import java.util.List;

public interface IStudentAppService {
    List<Student> getStudents();
    Student getStudentById(Long id);
    Student createStudent(Student student);
    Student updateStudent(Long id, Student student);
    void deleteStudent(Long id);

}
