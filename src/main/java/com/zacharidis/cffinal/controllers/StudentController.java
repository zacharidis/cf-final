package com.zacharidis.cffinal.controllers;

import com.zacharidis.cffinal.dao.IStudentRepository;
import com.zacharidis.cffinal.entities.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

/**
 * @author zacharidis
 *
 */

@Controller
@RequestMapping("/students")
public class StudentController {

    @Autowired
    IStudentRepository studentRepo;

    @GetMapping
    public String displayStudents(Model model){
        List<Student> students = studentRepo.findAll();
        model.addAttribute("students",students);
        return"students/list-students";
    }


    @GetMapping("/new")
    public String displayStudentForm(Model model){

        Student aStudent = new Student();
        model.addAttribute("student",aStudent);
        return ("students/new-student");

    }

    @PostMapping("/save")
    public String createStudent(Student student , Model  model) {
        studentRepo.save(student);
        return "redirect:/students/new";
    }


}
