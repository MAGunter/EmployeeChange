package com.mvc.hibernate.aop.entity;


import lombok.Data;
import lombok.ToString;

import jakarta.persistence.*;


@Entity
@Table(name = "employees")
@Data
@ToString
public class Employee {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;
    @Column(name = "name")
    private String name;
    @Column(name = "surname")
    private String surname;
    @Column(name = "department")
    private String department;
    @Column(name = "salary")
    private int salary;
}
