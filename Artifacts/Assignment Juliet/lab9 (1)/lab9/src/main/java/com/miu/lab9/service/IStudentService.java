package com.miu.lab9.service;

import com.miu.lab9.domain.Student;
import com.miu.lab9.dto.ResponseMessage;

import java.util.List;
import java.util.Optional;

public interface IStudentService {
    ResponseMessage save(Student student);

    ResponseMessage update(Student student);

    List<Student> findAll();

    Optional<Student> findById(int id);

    ResponseMessage deleteById(int id);
}
