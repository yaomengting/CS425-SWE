//package edu.miu.cs.cs425.courseregistrationsys.restcontroller;
//
//import edu.miu.cs.cs425.courseregistrationsys.model.AcademicBlock;
//import edu.miu.cs.cs425.courseregistrationsys.service.AcademicBlockService;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.web.bind.annotation.*;
//
//@RestController
//@RequestMapping("/api/block")
//public class AcademicBlockRestController {
//    private AcademicBlockService academicBlockService;
//    @Autowired
//    public AcademicBlockRestController(AcademicBlockService academicBlockService) {
//        this.academicBlockService = academicBlockService;
//    }
//
//    @GetMapping(value = "/{id}")
//    public AcademicBlock getAcademicBlockById(@PathVariable Integer id){
//        return academicBlockService.getAcademicBlockById(id);
//    }
//
//    @PostMapping(value = "/add")
//    public AcademicBlock addNewAcademicBlock(@RequestBody AcademicBlock academicBlock) {
//        return academicBlockService.addNewAcademicBlock(academicBlock);
//    }
//}
//
