package com.zacharidis.cffinal.entities;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Teacher {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long teacherId;

    private String firstName;
    private String lastName;
    private String email;

    private String telephone;


    //---------- one to many => subjects

    @ManyToMany(cascade = {CascadeType.DETACH , CascadeType.MERGE ,CascadeType.REFRESH,CascadeType.PERSIST} ,
            fetch = FetchType.LAZY)

    @JoinTable(name="subject_teacher",
    joinColumns = @JoinColumn(name="teacher_id")
    ,inverseJoinColumns = @JoinColumn(name="subject_id"))
    private List<Subject> subjects;




    // constructors

    public  Teacher(){}

    public Teacher(String firstName, String lastName, String email , String telephone) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.telephone= telephone;
    }


    // getters and setters


    public List<Subject> getSubjects() {
        return subjects;
    }

    public void setSubjects(List<Subject> subjects) {
        this.subjects = subjects;
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    public long getTeacherId() {
        return teacherId;
    }

    public void setTeacherId(long teacherId) {
        this.teacherId = teacherId;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    // helper to add subjects

    public  void addSubject(Subject subject){
        if (subjects == null ){
            subjects = new ArrayList<>();
        }
        subjects.add(subject);
    }

}
