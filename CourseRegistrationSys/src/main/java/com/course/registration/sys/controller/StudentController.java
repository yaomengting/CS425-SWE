package com.course.registration.sys.controller;

import com.course.registration.sys.appservice.IStudentAppService;
import com.course.registration.sys.model.Student;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/student")
public class StudentController {
    /**
     * Injecting studentService
     */
    @Autowired
    private IStudentAppService studentAppService;

    /**
     * retreive all the students from database
     * @return
     */
    @GetMapping
    public ResponseEntity<List<Student>> getStudents(){
        return ResponseEntity.ok(studentAppService.getStudents());
    }

    /**
     * retrieve vechile by id
     * @param id
     * @return
     */
    @GetMapping("/{id}")
    public ResponseEntity<Student> getStudentById(@PathVariable Long id){
        return ResponseEntity.ok(studentAppService.getStudentById(id));
    }

    /**
     * save student to db
     * @param studentDTO
     * @return
     */
    @PostMapping
    public ResponseEntity<Object> createStudent(@Valid @RequestBody Student studentDTO){
        Student studentDTOToSave = studentAppService.createStudent(studentDTO);
        return new ResponseEntity<>("Student saved successfully", HttpStatus.OK);
    }

    /**
     * update student of particular id
     * @param id
     * @param studentDTO
     * @return
     */
    @PutMapping("/{id}")
    public ResponseEntity<Object> updateStudent(@PathVariable Long id,
                                                @Valid @RequestBody Student studentDTO){
        Student studentDTOToUpdate = studentAppService.updateStudent(id, studentDTO);
        return new ResponseEntity<>("Student updated Successfully", HttpStatus.OK);
    }

    /**
     * delete student by id
     * @param id
     */
    @DeleteMapping("/{id}")
    public void deleteStudent(@PathVariable Long id){
        studentAppService.deleteStudent(id);
    }


}
