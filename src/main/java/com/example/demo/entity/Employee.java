package com.example.demo.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "Employee_TBL")
public class Employee {
    @Id
    @GeneratedValue
    private  int id;
    private String name;
    private String LastName;
    private String address;
    private String phone;
    private String emailId;
}
