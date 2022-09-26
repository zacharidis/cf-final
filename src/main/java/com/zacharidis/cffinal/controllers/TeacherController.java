package com.zacharidis.cffinal.controllers;

import com.zacharidis.cffinal.dao.ISubjectRepository;
import com.zacharidis.cffinal.dao.ITeacherRepository;
import com.zacharidis.cffinal.entities.Student;
import com.zacharidis.cffinal.entities.Subject;
import com.zacharidis.cffinal.entities.Teacher;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

/**
 * @author zacharidis
 */

@Controller
@RequestMapping("/teachers")
public class TeacherController {


    @Autowired
    ITeacherRepository teacherRepo;

    @Autowired
    ISubjectRepository subRepo;



    @GetMapping
    public String displayTeachers(Model model){
        List<Teacher> teachers = teacherRepo.findAll();
        model.addAttribute("teachers",teachers);
        return"teachers/list-teachers";
    }

    @GetMapping("/new")
    public String displayTeacherForm(Model model){




        Teacher aTeacher = new Teacher();
         List<Subject> subjects = subRepo.findAll();



        model.addAttribute("allSubjects",subjects);
        model.addAttribute("teacher",aTeacher);
        return ("teachers/new-teacher");



    }

    @PostMapping("/save")
    public String createTeacher(Teacher teacher ,  Model model){

        // save the teacher to crud repository

        teacherRepo.save(teacher);





        return "redirect:/teachers/";


    }


}
