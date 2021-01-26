package com.pack.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FallbackController {
    @GetMapping("/addressServiceFallBackMethod")
    public String addressServiceFallBackMethod(){
        return "Address Service is down. Please try again later";
    }

    @GetMapping("/employeeServiceFallBackMethod")
    public String studentServiceFallBackMethod(){
        return "Employee Service is down. Please try again later";
    }

}
