package edu.mum.cs.cs425.studentmgmt.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import edu.mum.cs.cs425.studentmgmt.model.Student;
import edu.mum.cs.cs425.studentmgmt.repository.StudentRepository;
import edu.mum.cs.cs425.studentmgmt.service.StudentService;

@Service
public class StudentServiceImpl implements StudentService{
  @Autowired
  private StudentRepository studentRepository;
  @Override
  public Student save(Student student) {
  
    return studentRepository.save(student);
  }
  
}
