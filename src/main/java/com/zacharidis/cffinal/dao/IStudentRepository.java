package com.zacharidis.cffinal.dao;

import com.zacharidis.cffinal.entities.Student;
import com.zacharidis.cffinal.entities.Subject;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface IStudentRepository extends CrudRepository<Student,Long> {

    @Override
    List<Student> findAll();
}
