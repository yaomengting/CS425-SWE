package edu.miu.cs.cs425.courseregistrationsys.repository;

import edu.miu.cs.cs425.courseregistrationsys.model.AcademicBlock;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AcademicBlockRepository extends JpaRepository<AcademicBlock, Integer> {
}
