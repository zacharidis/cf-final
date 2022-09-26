package com.zacharidis.cffinal.entities;

import javax.persistence.*;
import java.util.List;

@Entity
public class Subject {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long subjectId;
    private String name;
    private String stage; // finished , hasn't started , ongoing
    private String Description;

    @ManyToMany(cascade = {CascadeType.DETACH , CascadeType.MERGE ,CascadeType.REFRESH,CascadeType.PERSIST} ,
                fetch = FetchType.LAZY)
    @JoinTable(name="subject_teacher",
            joinColumns = @JoinColumn(name="subject_id")
            ,inverseJoinColumns = @JoinColumn(name="teacher_id"))

    private List<Teacher> teachers;

    // Constructors

    public Subject() {}

    public Subject(String name, String stage, String description) {
        this.name = name;
        this.stage = stage;
        Description = description;
    }


    // Getters and Setters


    public List<Teacher> getTeachers() {
        return teachers;
    }

    public void setTeachers(List<Teacher> teachers) {
        this.teachers = teachers;
    }

    public long getSubjectId() {
        return subjectId;
    }

    public void setSubjectId(long subjectId) {
        this.subjectId = subjectId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getStage() {
        return stage;
    }

    public void setStage(String stage) {
        this.stage = stage;
    }

    public String getDescription() {
        return Description;
    }

    public void setDescription(String description) {
        Description = description;
    }
}
