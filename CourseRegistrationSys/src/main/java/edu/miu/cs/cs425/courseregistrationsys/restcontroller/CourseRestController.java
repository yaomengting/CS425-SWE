//package edu.miu.cs.cs425.courseregistrationsys.restcontroller;
//
//import edu.miu.cs.cs425.courseregistrationsys.model.Course;
//import edu.miu.cs.cs425.courseregistrationsys.service.CourseService;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.web.bind.annotation.*;
//
//import java.util.List;
//
//@RestController
//@RequestMapping("/api/course")
//public class CourseRestController {
//
//    private CourseService courseService;
//
//    @Autowired
//    public CourseRestController(CourseService courseService) {
//        this.courseService = courseService;
//    }
//
//    @GetMapping(value = "/list")
//    public List<Course> findAll() {
//        return courseService.getCourses();
//    }
//
//    @PostMapping(value = "/add")
//    public Course addNewCourse(@RequestBody Course course) {
//        return courseService.addNewCourse(course);
//    }
//}
