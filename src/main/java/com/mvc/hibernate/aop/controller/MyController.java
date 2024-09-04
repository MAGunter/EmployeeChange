package com.mvc.hibernate.aop.controller;

import com.mvc.hibernate.aop.entity.Employee;
import com.mvc.hibernate.aop.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("")
public class MyController {
    @Autowired
    private EmployeeService employeeService;
    @RequestMapping("")
    public String showAllEmployees(Model model){
        List<Employee> allEmployees = employeeService.getAllEmployees();
        model.addAttribute("allEmployees", allEmployees);
        return "showEmployees";
    }
    @RequestMapping("/addNewEmployee")
    public String addNewEmployee(Model model){
        Employee emp = new Employee();
        model.addAttribute("employee", emp);
        return "employeeInfo";
    }

    @RequestMapping("/saveEmployee")
    public String saveEmployee(@ModelAttribute("employee") Employee employee){
        employeeService.saveEmployee(employee);
        return "redirect:/";
    }
}
