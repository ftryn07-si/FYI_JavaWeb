package com.juaracoding.FYI_JavaWeb.repo;/*
Created By IntelliJ IDEA 2022.2.3 (Community Edition)
Build #IU-222.4345.14, built on October 5, 2022
@Author Moh. Ikhsan a.k.a. Fitriyani
Java Developer
Created on 2/27/2023 11:01 PM
@Last Modified 2/27/2023 11:01 PM
Version 1.0
*/

import com.juaracoding.FYI_JavaWeb.model.Employee;

import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepo extends JpaRepository<Employee, Long> {

}