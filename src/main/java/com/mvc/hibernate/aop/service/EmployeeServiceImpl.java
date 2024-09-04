package com.mvc.hibernate.aop.service;

import com.mvc.hibernate.aop.dao.EmployeeDao;
import com.mvc.hibernate.aop.entity.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class EmployeeServiceImpl implements EmployeeService {

    @Autowired
    private EmployeeDao employeeDao;

    @Override
    public List<Employee> getAllEmployees() {
        return employeeDao.getAllEmployees();
    }
    @Override
    public void saveEmployee(Employee employee){
        employeeDao.saveEmployee(employee);
    }
}

