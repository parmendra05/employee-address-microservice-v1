package com.pack.controller;

import com.pack.VO.ResponseTemplateEmpAdd;
import com.pack.entity.Employee;
import com.pack.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/employee")
public class EmployeeController {

    @Autowired
    private EmployeeService service;
    @PostMapping("/saveEmployee")
    public Employee saveEmployee(@RequestBody Employee employee){
        return service.saveEmployee(employee);
    }

    /*@GetMapping("/get/{id}")
    public Employee getEmployee(@PathVariable ("id") Integer integer){
        return service.getEmployee(integer);
    }
*/
    @GetMapping("/get/{id}")
    public ResponseTemplateEmpAdd getEmployeeWthAddress(@PathVariable ("id") Integer integer){
        return service.getEmployeeWthAddress(integer);
    }

}
