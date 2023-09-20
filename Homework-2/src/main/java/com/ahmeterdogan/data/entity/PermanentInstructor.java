package com.ahmeterdogan.data.entity;

import jakarta.persistence.Entity;

import java.math.BigDecimal;

@Entity
public class PermanentInstructor extends Instructor{
    private BigDecimal fixedSalary;

    public PermanentInstructor() {
    }

    public PermanentInstructor(String name, String address, String phoneNumber) {
        super(name, address, phoneNumber);
    }

    public BigDecimal getFixedSalary() {
        return fixedSalary;
    }

    public void setFixedSalary(BigDecimal fixedSalary) {
        this.fixedSalary = fixedSalary;
    }
}
