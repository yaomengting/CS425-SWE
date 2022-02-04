//package edu.miu.cs.cs425.courseregistrationsys.restcontroller;
//
//import edu.miu.cs.cs425.courseregistrationsys.model.Faculty;
//import edu.miu.cs.cs425.courseregistrationsys.service.FacultyService;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.web.bind.annotation.*;
//
//import java.util.List;
//
//@RestController
//@RequestMapping("/api/faculty")
//public class FacultyRestController {
//    private FacultyService facultyService;
//    @Autowired
//    public FacultyRestController(FacultyService facultyService) {
//        this.facultyService = facultyService;
//    }
//
//    @GetMapping(value = "/{id}")
//    public Faculty getFacultyById(@PathVariable Integer id){
//        return facultyService.getFacultyById(id);
//    }
//
//    @GetMapping(value = "/list")
//    public List<Faculty> list() {
//        return facultyService.getAllFaculty();
//    }
//
//    @PostMapping(value = "/add")
//    public Faculty addNewFaculty(@RequestBody Faculty faculty) {
//        return facultyService.addNewFaculty(faculty);
//    }
//
//}
