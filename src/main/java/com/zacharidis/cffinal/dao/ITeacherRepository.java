package com.zacharidis.cffinal.dao;

import com.zacharidis.cffinal.entities.Subject;
import com.zacharidis.cffinal.entities.Teacher;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface ITeacherRepository extends CrudRepository<Teacher , Long> {
    @Override
    List<Teacher> findAll();
}
