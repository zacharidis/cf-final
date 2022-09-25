package com.zacharidis.cffinal.controllers;

import com.zacharidis.cffinal.dao.ISubjectRepository;
import com.zacharidis.cffinal.entities.Student;
import com.zacharidis.cffinal.entities.Subject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

/**
 * @author zacharidis
 */

@Controller
@RequestMapping("/subjects")
public class SubjectController {

    @Autowired
    ISubjectRepository subRepo;


    @GetMapping
    public String displaySubjects(Model model){
        List<Subject> subjects = subRepo.findAll();
        model.addAttribute("subjects",subjects);
        return"subjects/list-subjects";
    }
    @GetMapping("/new")
    public String displaySubjectForm(Model model){

        Subject aSubject = new Subject();
        model.addAttribute("subject", aSubject);
        return ("subjects/new-subject");
    }

    @PostMapping("/save")
    public  String createSubject(Subject subject , Model model){
        // save the subject to the db;


        subRepo.save(subject);
        // redirect to the save page again
        return "redirect:/subjects/";
    }


}
