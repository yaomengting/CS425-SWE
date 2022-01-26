package com.miu.lab9.service.impl;

import com.miu.lab9.domain.Student;
import com.miu.lab9.dto.ResponseMessage;
import com.miu.lab9.repository.StudentRepository;
import com.miu.lab9.service.IStudentService;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.StreamSupport;

@Service
public class StudentService implements IStudentService {
    private StudentRepository studentRepository;

    public StudentService(StudentRepository studentRepository){
        this.studentRepository = studentRepository;
    }

    @Override
    public ResponseMessage save(Student student) {
        studentRepository.save(student);
        return new ResponseMessage("Saved.", HttpStatus.CREATED);
    }

    @Override
    public ResponseMessage update(Student student) {
        Optional<Student> studentOpt = findById(student.getId());
        if(studentOpt.isPresent()){
            studentRepository.save(student);
            return new ResponseMessage("Updated.", HttpStatus.OK);
        }
        return new ResponseMessage("Not Found.", HttpStatus.NOT_FOUND);
    }

    @Override
    public List<Student> findAll() {
        return StreamSupport.stream(studentRepository.findAll().spliterator(), false)
                .collect(Collectors.toList());
    }

    @Override
    public Optional<Student> findById(int id) {
        return studentRepository.findById(id);
    }

    @Override
    public ResponseMessage deleteById(int id) {
        Optional<Student> studentOpt = findById(id);
        if(studentOpt.isPresent()){
            studentRepository.deleteById(id);
            return new ResponseMessage("Deleted.", HttpStatus.OK);
        }
        return new ResponseMessage("Not Found.", HttpStatus.NOT_FOUND);
    }
}
