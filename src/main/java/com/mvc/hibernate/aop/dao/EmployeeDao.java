package com.mvc.hibernate.aop.dao;

import com.mvc.hibernate.aop.entity.Employee;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface EmployeeDao {
    List<Employee> getAllEmployees();
    void saveEmployee(Employee employee);
}
