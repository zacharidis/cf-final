package com.zacharidis.cffinal.dao;

import com.zacharidis.cffinal.dto.ITeacherSubject;
import com.zacharidis.cffinal.entities.Subject;
import com.zacharidis.cffinal.entities.Teacher;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface ITeacherRepository extends CrudRepository<Teacher , Long> {
    @Override
    List<Teacher> findAll();

    @Query(nativeQuery = true,value="SELECT e.first_name, e.last_name, COUNT(st.subject_id)" +
            "FROM teacher e left join subject_teacher st on st.teacher_id = e.teacher_id" +
            " GROUP BY e.first_name , e.last_name ORDER BY 1 DESC")

    public List<ITeacherSubject> teacherSubjects();






}
