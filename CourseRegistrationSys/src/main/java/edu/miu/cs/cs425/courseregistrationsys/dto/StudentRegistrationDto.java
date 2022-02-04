package edu.miu.cs.cs425.courseregistrationsys.dto;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.time.LocalDate;
import java.time.LocalDateTime;
@Data
@AllArgsConstructor
public class StudentRegistrationDto {
    private String blockName;
    private String courseCode;
    private String courseName;
    private String facultyName;
    private LocalDate startDate;
}
