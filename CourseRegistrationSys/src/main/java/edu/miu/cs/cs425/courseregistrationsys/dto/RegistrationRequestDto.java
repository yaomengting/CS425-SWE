package edu.miu.cs.cs425.courseregistrationsys.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class RegistrationRequestDto {
    private Integer studentId;
    private Integer courseOfferingId;
    private Integer priority;
}
