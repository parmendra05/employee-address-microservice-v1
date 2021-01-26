package com.pack.service;

import com.pack.VO.Address;
import com.pack.VO.ResponseTemplateEmpAdd;
import com.pack.entity.Employee;
import com.pack.repo.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class EmployeeService {
    @Autowired
    private EmployeeRepository repo;

    @Autowired
    private RestTemplate template;

    public Employee saveEmployee(Employee employee) {
        return repo.save(employee);
    }

    /*public Employee getEmployee(Integer integer) {
        return repo.findByEmployeeId(integer);
    }*/

    public ResponseTemplateEmpAdd getEmployeeWthAddress(Integer integer) {
        ResponseTemplateEmpAdd response=new ResponseTemplateEmpAdd();
        Employee employee=repo.findByEmployeeId(integer);
        Address address=template.getForObject("http://ADDRESS-SERVICE/address/get/"+employee.getAddressId(),Address.class);

        response.setEmployee(employee);
        response.setAddress(address);
        return response;
    }
}
