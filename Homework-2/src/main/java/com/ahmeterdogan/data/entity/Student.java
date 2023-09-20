package com.ahmeterdogan.data.entity;

import jakarta.persistence.*;

import java.time.LocalDate;
import java.util.Set;

@Entity
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String fullName;
    private LocalDate birthdate;
    private String address;
    private String gender;

    @ManyToMany
    private Set<Course> courses;


    public Student() {
    }

    public Student(String fullName, LocalDate birthdate, String address, String gender) {
        this.fullName = fullName;
        this.birthdate = birthdate;
        this.address = address;
        this.gender = gender;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public LocalDate getBirthdate() {
        return birthdate;
    }

    public void setBirthdate(LocalDate birthdate) {
        this.birthdate = birthdate;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }
}
