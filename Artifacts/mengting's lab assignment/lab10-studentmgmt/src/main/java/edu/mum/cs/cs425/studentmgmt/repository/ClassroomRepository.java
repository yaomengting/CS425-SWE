package edu.mum.cs.cs425.studentmgmt.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import edu.mum.cs.cs425.studentmgmt.model.Classroom;

public interface ClassroomRepository extends JpaRepository<Classroom,String> {
  
}
