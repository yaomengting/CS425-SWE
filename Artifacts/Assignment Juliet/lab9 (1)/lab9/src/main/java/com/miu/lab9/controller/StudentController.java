package com.miu.lab9.controller;

import com.miu.lab9.domain.Student;
import com.miu.lab9.dto.ResponseMessage;
import com.miu.lab9.service.IStudentService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/student")
@CrossOrigin
public class StudentController {
    private final IStudentService studentService;

    public StudentController(IStudentService studentService){
        this.studentService = studentService;
    }

    @PostMapping
    public ResponseEntity<ResponseMessage> save(@RequestBody Student student){
        ResponseMessage response = studentService.save(student);
        return new ResponseEntity<>(response, response.getStatus());
    }

    @PutMapping
    public ResponseEntity<ResponseMessage> update(@RequestBody Student student){
        ResponseMessage response = studentService.update(student);
        return new ResponseEntity<>(response, response.getStatus());
    }

    @GetMapping
    public ResponseEntity<List<Student>> findAll(){
        return ResponseEntity.ok(studentService.findAll());
    }

    @GetMapping("/{id}")
    public ResponseEntity<Student> findById(@PathVariable(name = "id") int id){
        Optional<Student> studentOpt = studentService.findById(id);
        return studentOpt.map(ResponseEntity::ok).orElseGet(() -> ResponseEntity.notFound().build());
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<ResponseMessage> deleteById(@PathVariable(name = "id") int id){
        ResponseMessage response = studentService.deleteById(id);
        return new ResponseEntity<>(response, response.getStatus());
    }
}
