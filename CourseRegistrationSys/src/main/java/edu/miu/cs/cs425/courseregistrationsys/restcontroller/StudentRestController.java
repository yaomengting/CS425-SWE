//package edu.miu.cs.cs425.courseregistrationsys.restcontroller;
//
//import edu.miu.cs.cs425.courseregistrationsys.model.Student;
//import edu.miu.cs.cs425.courseregistrationsys.service.StudentService;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.web.bind.annotation.*;
//
//import java.util.List;
//
//@RestController
//@RequestMapping("/api/student")
//public class StudentRestController {
//    private StudentService studentService;
//    @Autowired
//    public StudentRestController(StudentService studentService) {
//        this.studentService = studentService;
//    }
//    @GetMapping(value = "/{id}")
//    public Student getStudentById(@PathVariable Integer id){
//        return studentService.getStudentById(id);
//    }
//
//    @GetMapping(value = "/list")
//    public List<Student> list() {
//        return studentService.getAllStudents();
//    }
//
//    @PostMapping(value = "/add")
//    public Student addNewStudent( @RequestBody Student student) {
//        return studentService.addNewStudent(student);
//    }
//}
