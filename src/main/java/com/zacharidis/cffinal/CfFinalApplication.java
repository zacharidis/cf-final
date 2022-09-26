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

            @Bean
            CommandLineRunner runner() {

            return args -> {

                Teacher teacher1 = new Teacher("Thanasis" ,"Androutsos","androu@mail.gr","695959595");
                Teacher teacher2 = new Teacher("Makis","kapetis","Kapetis@mail.gr","6930523423");
                Teacher teacher3 = new Teacher("Sakis","Papasakis","papasakia@mail.gr","69942342332");

                Subject subject1 = new Subject("Java","ON GOING","JAVA LANGUAGE");
                Subject subject2 = new Subject("SQL","ONGOING","SQL AND DATABASES");
                Subject subject3 = new Subject("Spring","ONGOING","SPRING FRAMEWORKD WEB APPS");
                Subject subject4 = new Subject("Python","COMPLETED","PYTHON LANGUAGE");



                teacher1.addSubject(subject1);
                teacher1.addSubject(subject3);
                teacher2.addSubject(subject2);
                teacher3.addSubject(subject4);


                teacherRepo.save(teacher1);
                teacherRepo.save(teacher2);
                teacherRepo.save(teacher3);

                subRepo.save(subject1);
                subRepo.save(subject2);
                subRepo.save(subject3);
                subRepo.save(subject4);


            };
    }

}
