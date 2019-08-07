package com.example.punionice.api;

import javax.persistence.*;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
@Embeddable
public class Address {
    private String Title;
    private String AddressLine1;
    private String AddressLine2;
    private String Town;
    private String StateOrProvince;
    private String Postcode;
    
    public Address() {}
}