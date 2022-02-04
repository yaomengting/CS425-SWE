package edu.miu.cs.cs425.courseregistrationsys.service.impl;

import edu.miu.cs.cs425.courseregistrationsys.model.Faculty;
import edu.miu.cs.cs425.courseregistrationsys.repository.FacultyRepository;
import edu.miu.cs.cs425.courseregistrationsys.service.FacultyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FacultyServiceImpl implements FacultyService {
    private FacultyRepository facultyRepository;
    @Autowired
    public FacultyServiceImpl(FacultyRepository facultyRepository) {
        this.facultyRepository = facultyRepository;
    }

    @Override
    public Faculty getFacultyById(Integer id) {
        return facultyRepository.findById(id).orElse(null);
    }

    @Override
    public List<Faculty> getAllFaculty() {
        return facultyRepository.findAll();
    }

    @Override
    public Faculty addNewFaculty(Faculty newFaculty) {
        return facultyRepository.save(newFaculty);
    }
}
