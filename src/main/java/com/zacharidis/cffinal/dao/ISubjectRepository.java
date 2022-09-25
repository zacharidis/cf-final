package com.zacharidis.cffinal.dao;

import com.zacharidis.cffinal.entities.Subject;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface ISubjectRepository extends CrudRepository<Subject ,Long> {

    @Override
    List<Subject> findAll();


}
