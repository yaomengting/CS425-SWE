package edu.miu.cs.cs425.courseregistrationsys.service.impl;

import edu.miu.cs.cs425.courseregistrationsys.model.AcademicBlock;
import edu.miu.cs.cs425.courseregistrationsys.repository.AcademicBlockRepository;
import edu.miu.cs.cs425.courseregistrationsys.service.AcademicBlockService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AcademicBlockServiceImpl implements AcademicBlockService {

    private AcademicBlockRepository academicBlockRepository;
    @Autowired
    public AcademicBlockServiceImpl(AcademicBlockRepository academicBlockRepository) {
        this.academicBlockRepository = academicBlockRepository;
    }

    @Override
    public AcademicBlock getAcademicBlockById(Integer id) {
        return academicBlockRepository.findById(id).orElse(null);
    }

    @Override
    public AcademicBlock addNewAcademicBlock(AcademicBlock newAcademicBlock) {
        return academicBlockRepository.save(newAcademicBlock);
    }

    @Override
    public List<AcademicBlock> getAllAcademicBlock() {
        return academicBlockRepository.findAll();
    }
}
