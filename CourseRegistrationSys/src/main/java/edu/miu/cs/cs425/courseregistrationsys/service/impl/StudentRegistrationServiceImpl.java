package edu.miu.cs.cs425.courseregistrationsys.service.impl;


import edu.miu.cs.cs425.courseregistrationsys.dto.StudentRegistrationDto;
import edu.miu.cs.cs425.courseregistrationsys.model.*;
import edu.miu.cs.cs425.courseregistrationsys.repository.StudentRegistrationRepository;
import edu.miu.cs.cs425.courseregistrationsys.service.AcademicBlockService;
import edu.miu.cs.cs425.courseregistrationsys.service.CourseService;
import edu.miu.cs.cs425.courseregistrationsys.service.FacultyService;
import edu.miu.cs.cs425.courseregistrationsys.service.StudentRegistrationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
@Service
public class StudentRegistrationServiceImpl implements StudentRegistrationService {
    @Autowired
    private StudentRegistrationRepository studentRegistrationRepository;
    @Autowired
    private FacultyService facultyService;
    @Autowired
    private CourseService courseService;
    @Autowired
    private AcademicBlockService academicBlockService;


    @Override
    public List<StudentRegistrationDto> getRegistrationListByStudentId(Integer id) {
        List<StudentRegistrationDto> dtos = new ArrayList<>();
        Student student = studentRegistrationRepository.getById(id);
        List<CourseOffering> offerings = student.getCourseOfferings().stream().toList();
        for(CourseOffering offering: offerings){
            Faculty faculty = facultyService.getFacultyById(offering.getFaculty().getId());
            Course course = courseService.getCourseById(offering.getCourse().getId());
            AcademicBlock block = academicBlockService.getAcademicBlockById(offering.getAcademicBlock().getId());
            StudentRegistrationDto dto = new StudentRegistrationDto(block.getName(),course.getCode(), course.getName(),
                    faculty.getName(),block.getStartDate());
            dtos.add(dto);
        }

        return dtos;
    }

//    @Override
//    public List<Registration> getRegistrationResultListByStudentId(int id) {
//        return registrationRepository.getRegistrationResultListByStudentId(id);
//    }


}
