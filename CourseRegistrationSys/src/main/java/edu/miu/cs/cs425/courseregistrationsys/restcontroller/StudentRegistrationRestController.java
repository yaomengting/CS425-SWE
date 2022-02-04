//package edu.miu.cs.cs425.courseregistrationsys.restcontroller;
//
//import edu.miu.cs.cs425.courseregistrationsys.dto.StudentRegistrationDto;
//import edu.miu.cs.cs425.courseregistrationsys.service.StudentRegistrationService;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.web.bind.annotation.*;
//
//import java.util.List;
//
//@RestController
//@RequestMapping("/api/student")
//public class StudentRegistrationRestController {
//    private StudentRegistrationService studentRegistrationService;
//
//    @Autowired
//    public StudentRegistrationRestController(StudentRegistrationService registrationService) {
//        this.studentRegistrationService = registrationService;
//    }
//
//    @GetMapping(value = "/list/{id}")
//    public List<StudentRegistrationDto> getRegistrationResultListByStudentId(@PathVariable Integer id){
//        return studentRegistrationService.getRegistrationListByStudentId(id);
//    }
//}
