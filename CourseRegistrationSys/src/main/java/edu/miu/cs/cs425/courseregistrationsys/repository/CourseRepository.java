package edu.miu.cs.cs425.courseregistrationsys.repository;

import edu.miu.cs.cs425.courseregistrationsys.model.Course;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CourseRepository extends JpaRepository<Course, Integer> {

    @Query(value = "Select c from Course c Where c.code = :code")
    List<Course> findByCode(String code);
}
