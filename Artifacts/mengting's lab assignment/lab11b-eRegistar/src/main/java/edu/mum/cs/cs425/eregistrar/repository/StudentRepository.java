package edu.mum.cs.cs425.eregistrar.repository;

import edu.mum.cs.cs425.eregistrar.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.time.LocalDate;
import java.util.List;

@Repository
public interface StudentRepository extends JpaRepository<Student, Integer> {
   // @Query("SELECT s From Student s WHERE s.dateOfEnrollment >= : dateOfEnrollment")
    //List<Student> findStudentEnrollmentDateLaterThan(@Param("dateOfEnrollment") LocalDate dateOfEnrollment);
    @Query("SELECT s From Student s WHERE s.cgpa >= 4.0")
    List<Student> findStudentGpaGreaterThan();
}
