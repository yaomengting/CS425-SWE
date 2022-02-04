package edu.miu.cs.cs425.courseregistrationsys.service;

import edu.miu.cs.cs425.courseregistrationsys.model.AcademicBlock;
import edu.miu.cs.cs425.courseregistrationsys.model.Faculty;
import edu.miu.cs.cs425.courseregistrationsys.model.Student;

import java.util.List;

public interface AcademicBlockService {
    AcademicBlock getAcademicBlockById(Integer id);
    AcademicBlock addNewAcademicBlock(AcademicBlock newAcademicBlock);

    List<AcademicBlock> getAllAcademicBlock();

}
