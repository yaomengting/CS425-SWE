//package edu.miu.cs.cs425.courseregistrationsys.restcontroller;
//
//import edu.miu.cs.cs425.courseregistrationsys.model.CourseOffering;
//import edu.miu.cs.cs425.courseregistrationsys.service.CourseOfferingService;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.PathVariable;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RestController;
//
//@RestController
//@RequestMapping("/api/course-offering")
//public class CourseOfferingRestController {
//    private CourseOfferingService courseOfferingService;
//    @Autowired
//    public CourseOfferingRestController(CourseOfferingService courseOfferingService) {
//        this.courseOfferingService = courseOfferingService;
//    }
//    @GetMapping(value = "/{id}")
//    public CourseOffering getCourseOfferingById(@PathVariable Integer id){
//        return courseOfferingService.getCourseOfferingById(id);
//    }
//}
