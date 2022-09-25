package com.zacharidis.cffinal.controllers;

import com.zacharidis.cffinal.dao.ITeacherRepository;
import com.zacharidis.cffinal.entities.Teacher;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author zacharidis
 */

@Controller
@RequestMapping("/teachers")
public class TeacherController {


    @Autowired
    ITeacherRepository teacherRepo;
    @GetMapping("/new")
    public String displayTeacherForm(Model model){

        Teacher aTeacher = new Teacher();
        model.addAttribute("teacher",aTeacher);
        return ("teachers/new-teacher");



    }

    @PostMapping("/save")
    public String createTeacher(Model model , Teacher teacher){

        // save the teacher to crud repository

        teacherRepo.save(teacher);

        return "redirect:/teachers/new";


    }


}
