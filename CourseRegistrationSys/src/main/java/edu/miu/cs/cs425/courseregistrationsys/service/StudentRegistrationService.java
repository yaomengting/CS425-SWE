package edu.miu.cs.cs425.courseregistrationsys.service;

import edu.miu.cs.cs425.courseregistrationsys.dto.RegistrationRequestDto;
import edu.miu.cs.cs425.courseregistrationsys.dto.StudentRegistrationDto;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;


public interface StudentRegistrationService {
//    List<Registration> getRegistrationResultListByStudentId(int id);
List<StudentRegistrationDto> getRegistrationListByStudentId(Integer id);
    //ResponseEntity<String> saveRegistrationRequest(List<RegistrationRequestDto> requestDtos);
}
