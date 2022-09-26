package com.zacharidis.cffinal;
/**
 *  by GZ
 */


import com.zacharidis.cffinal.dao.IStudentRepository;
import com.zacharidis.cffinal.dao.ISubjectRepository;
import com.zacharidis.cffinal.dao.ITeacherRepository;
import com.zacharidis.cffinal.entities.Subject;
import com.zacharidis.cffinal.entities.Teacher;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.Arrays;

@SpringBootApplication
public class CfFinalApplication {

    @Autowired
    ISubjectRepository subRepo;
    @Autowired
    ITeacherRepository teacherRepo;
    @Autowired
    IStudentRepository studentRepo;


    public static void main(String[] args) {
        SpringApplication.run(CfFinalApplication.class, args);
    }



}
