package com.pack.service;

import com.pack.entity.Address;
import com.pack.repo.AddressRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AddressService {

    @Autowired
    private AddressRepository repo;

    public Address saveAddress(Address address) {
        return repo.save(address);
    }

    public Address getAddress(Integer integer) {
        return repo.findByAddressId(integer);
    }
}
