package com.zacharidis.cffinal.controllers;

import com.zacharidis.cffinal.dao.ISubjectRepository;
import com.zacharidis.cffinal.entities.Subject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class HomeController {

        @Autowired
        ISubjectRepository subRepo;


        @GetMapping("/")
        public  String displayHome(Model model){

            List<Subject> subjects = subRepo.findAll();
            model.addAttribute("subjects",subjects);
            return ("home");

        }
}
