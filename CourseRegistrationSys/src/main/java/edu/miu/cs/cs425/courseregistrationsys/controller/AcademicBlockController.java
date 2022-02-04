package edu.miu.cs.cs425.courseregistrationsys.controller;

import edu.miu.cs.cs425.courseregistrationsys.model.AcademicBlock;
import edu.miu.cs.cs425.courseregistrationsys.model.Course;
import edu.miu.cs.cs425.courseregistrationsys.service.AcademicBlockService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.validation.Valid;
import java.util.List;

@Controller
@RequestMapping(value = "/academicBlock")
public class AcademicBlockController {
    private AcademicBlockService academicBlockService;
    @Autowired
    public AcademicBlockController(AcademicBlockService academicBlockService) {
        this.academicBlockService = academicBlockService;
    }

    @GetMapping(value={"/list"})
    public ModelAndView listAcademicBlocks(){
        ModelAndView modelAndView = new ModelAndView();
        List<AcademicBlock> academicBlocks = academicBlockService.getAllAcademicBlock();
        modelAndView.addObject("academicBlocks", academicBlocks);
        modelAndView.setViewName("academicBlock/list");
        return modelAndView;
    }

    @GetMapping(value = {"/add"})
    public String displayNewAcademicBlockForm(Model model) {
        model.addAttribute("academicBlock", new AcademicBlock());
        return "academicBlock/new";
    }

    @PostMapping(value = {"/add"})
    public String addNewAcademicBlock(@Valid @ModelAttribute("academicBlock") AcademicBlock academicBlock,
                               BindingResult bindingResult, Model model){
        if(bindingResult.hasErrors()){
            model.addAttribute("errors",bindingResult.getAllErrors());
            return "academicBlock/new";
        }
        academicBlock = academicBlockService.addNewAcademicBlock(academicBlock);
        return "redirect:/academicBlock/list";
    }
}
