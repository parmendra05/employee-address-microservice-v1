package com.pack.controller;

import com.pack.entity.Address;
import com.pack.service.AddressService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/address")
public class AddressController {
    @Autowired
    private AddressService service;

    @PostMapping("/saveAddress")
    public Address saveAddress(@RequestBody Address address){
        return service.saveAddress(address);
    }

    @GetMapping("/get/{id}")
    public Address getAddress(@PathVariable ("id") Integer integer){

        return service.getAddress(integer);
    }

}
