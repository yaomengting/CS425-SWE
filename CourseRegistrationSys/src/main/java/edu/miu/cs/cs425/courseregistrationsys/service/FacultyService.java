package edu.miu.cs.cs425.courseregistrationsys.service;

import edu.miu.cs.cs425.courseregistrationsys.model.Faculty;
import edu.miu.cs.cs425.courseregistrationsys.model.Student;

import java.util.List;

public interface FacultyService {
    Faculty getFacultyById(Integer id);
    List<Faculty> getAllFaculty();
    Faculty addNewFaculty(Faculty newFaculty);

}
