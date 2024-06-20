package com.cydeo.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Departments {

    private String department;
    private String division;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long departmentsId;
}
