package edu.mum.cs.cs425.eregistrawebapi.controller;

import edu.mum.cs.cs425.eregistrawebapi.model.Student;
import edu.mum.cs.cs425.eregistrawebapi.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@CrossOrigin(allowedHeaders = "*")
@RequestMapping(value = "/eregistar/api/student", produces = MediaType.APPLICATION_JSON_VALUE)
public class StudentRestController {
    @Autowired
    private StudentService studentService;

    @GetMapping(value = "/list")
    public List<Student> list() {
        return studentService.getAllStudents();
    }

    @PostMapping(value = "/add")
    public Student addNewStudent( @RequestBody Student student) {
        return studentService.addNewStudent(student);
    }

    @GetMapping(value = "/get/{studentId}")
    public Student getStudentById(@PathVariable Integer studentId) {
        return studentService.getStudentById(studentId);
    }

    @PutMapping(value = "/update/{studentId}")
    public Student updateStudent( @RequestBody Student editedStudent, @PathVariable Integer studentId) {
        return studentService.updateStudentById(editedStudent, studentId);
    }

    @DeleteMapping(value = "/delete/{studentId}")
    public void deleteStudent(@PathVariable Integer studentId) {
        studentService.deleteStudentById(studentId);
    }

}