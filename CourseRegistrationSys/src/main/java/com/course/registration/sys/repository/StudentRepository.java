package com.course.registration.sys.repository;

import com.course.registration.sys.model.Course;
import com.course.registration.sys.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentRepository extends JpaRepository<Student, Long> {


}
