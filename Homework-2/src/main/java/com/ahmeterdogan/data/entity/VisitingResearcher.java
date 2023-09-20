package com.ahmeterdogan.data.entity;

import jakarta.persistence.Entity;

import java.math.BigDecimal;

@Entity
public class VisitingResearcher extends Instructor{
    private BigDecimal salaryPerHour;

    public VisitingResearcher(String name, String address, String phoneNumber, BigDecimal salaryPerHour) {
        super(name, address, phoneNumber);
        this.salaryPerHour = salaryPerHour;
    }

    public VisitingResearcher() {

    }

    public BigDecimal getSalaryPerHour() {
        return salaryPerHour;
    }

    public void setSalaryPerHour(BigDecimal salaryPerHour) {
        this.salaryPerHour = salaryPerHour;
    }
}
