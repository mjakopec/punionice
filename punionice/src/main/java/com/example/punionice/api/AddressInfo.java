package com.example.punionice.api;

import javax.persistence.*;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
@Embeddable
public class AddressInfo {
	@GeneratedValue( strategy = GenerationType.AUTO )
private String Title;
private String AddressLine1;
private String AddressLine2;
private String Town;
private String StateOrProvince;
private String Postcode;
private String CountryID;

public AddressInfo() {}
}