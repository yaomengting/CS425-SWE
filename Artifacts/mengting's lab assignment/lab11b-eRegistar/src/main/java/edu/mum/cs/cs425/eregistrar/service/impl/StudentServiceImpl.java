package edu.mum.cs.cs425.eregistrar.service.impl;

import edu.mum.cs.cs425.eregistrar.model.Student;
import edu.mum.cs.cs425.eregistrar.repository.StudentRepository;
import edu.mum.cs.cs425.eregistrar.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class StudentServiceImpl implements StudentService {
    @Autowired
    private StudentRepository studentRepository;

    @Override
    public List<Student> getAllStudents() {
        return studentRepository.findAll();
    }

    @Override
    public Student addNewStudent(Student student) {
        return studentRepository.save(student);
    }

    @Override
    public Student getStudentById(Integer studentId) {
        return studentRepository.findById(studentId).orElse(null);
    }

    @Override
    public Student updateStudentById(Student editedStudent, Integer studentId) {
        return studentRepository.findById(studentId)
                .map(studentToUpdate -> {
                    studentToUpdate.setStudentNumber(editedStudent.getStudentNumber());
                    studentToUpdate.setFirstName(editedStudent.getFirstName());
                    studentToUpdate.setMiddleName(editedStudent.getMiddleName());
                    studentToUpdate.setLastName(editedStudent.getLastName());
                    studentToUpdate.setCgpa(editedStudent.getCgpa());
                    studentToUpdate.setDateOfEnrollment(editedStudent.getDateOfEnrollment());
                    studentToUpdate.setInternational(editedStudent.isInternational());
                    return studentRepository.save(studentToUpdate);
                }).orElseGet(() -> {
                    return studentRepository.save(editedStudent);
                });
    }

    @Override
    public void deleteStudentById(Integer studentId) {
        studentRepository.deleteById(studentId);
    }
}
