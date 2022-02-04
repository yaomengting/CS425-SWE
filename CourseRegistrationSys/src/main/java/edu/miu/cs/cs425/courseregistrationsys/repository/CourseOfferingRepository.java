package edu.miu.cs.cs425.courseregistrationsys.repository;

import edu.miu.cs.cs425.courseregistrationsys.model.CourseOffering;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CourseOfferingRepository extends JpaRepository<CourseOffering, Integer> {
}
