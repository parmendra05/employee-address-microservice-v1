package com.pack.VO;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;





@Data
@AllArgsConstructor
@NoArgsConstructor
public class Address {

    private Integer addressId;
    private String city;
    private String state;
    private Integer zipcode;

}
