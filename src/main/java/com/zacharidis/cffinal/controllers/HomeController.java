package com.zacharidis.cffinal.controllers;

import com.zacharidis.cffinal.dao.ISubjectRepository;
import com.zacharidis.cffinal.dao.ITeacherRepository;
import com.zacharidis.cffinal.entities.Subject;
import com.zacharidis.cffinal.entities.Teacher;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class HomeController {

        @Autowired
        ISubjectRepository subRepo;
        @Autowired
        ITeacherRepository teacherRepo;


        @GetMapping("/")
        public  String displayHome(Model model){

            List<Teacher> teachers = teacherRepo.findAll();
            model.addAttribute("teachers",teachers);

            List<Subject> subjects = subRepo.findAll();
            model.addAttribute("subjects",subjects);
            return ("main/home");

        }
}
