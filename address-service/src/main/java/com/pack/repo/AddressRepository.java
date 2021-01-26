package com.pack.repo;

import com.pack.entity.Address;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AddressRepository extends JpaRepository<Address ,Integer> {
    Address findByAddressId(Integer integer);
}
