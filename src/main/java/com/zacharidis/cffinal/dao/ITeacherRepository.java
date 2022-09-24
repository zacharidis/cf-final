package com.zacharidis.cffinal.dao;

import com.zacharidis.cffinal.entities.Teacher;
import org.springframework.data.repository.CrudRepository;

public interface ITeacherRepository extends CrudRepository<Teacher , Long> {

}
