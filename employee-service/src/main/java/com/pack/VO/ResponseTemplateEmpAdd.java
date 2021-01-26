package com.pack.VO;

import com.pack.entity.Employee;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;


@Data
@NoArgsConstructor
@AllArgsConstructor
public class ResponseTemplateEmpAdd {

    private Employee employee;
    private Address address;

}
