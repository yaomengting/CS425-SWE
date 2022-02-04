package edu.miu.cs.cs425.courseregistrationsys.repository;


import edu.miu.cs.cs425.courseregistrationsys.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface StudentRegistrationRepository extends JpaRepository<Student, Integer> {
//    @Query(value = "select r.courseOffering.id from Registration r where r.student.id = :id")
//    public abstract List<Registration> getRegistrationResultListByStudentId(int id);


}
