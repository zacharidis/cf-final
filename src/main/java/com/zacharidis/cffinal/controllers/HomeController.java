package com.zacharidis.cffinal.controllers;

import com.zacharidis.cffinal.dao.IStudentRepository;
import com.zacharidis.cffinal.dao.ISubjectRepository;
import com.zacharidis.cffinal.dao.ITeacherRepository;
import com.zacharidis.cffinal.dto.ITeacherSubject;
import com.zacharidis.cffinal.entities.Student;
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

        @Autowired
        IStudentRepository studentRepo;



        @GetMapping("/")
        public  String displayHome(Model model){


            List<Student> students = studentRepo.findAll();
            model.addAttribute("students",students);


             List<Teacher> teachers = teacherRepo.findAll();
             model.addAttribute("teachers",teachers);

            List<Subject> subjects = subRepo.findAll();
            model.addAttribute("subjects",subjects);
            return ("main/home");

        }
}
