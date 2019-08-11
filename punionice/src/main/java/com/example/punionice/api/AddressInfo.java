package com.example.punionice.api;

import javax.persistence.Embeddable;
import javax.persistence.Embedded;
import lombok.*;

@Data
@AllArgsConstructor
@Embeddable
public class AddressInfo {
private String addressLine1;
private String addressLine2;
private String town;
private String stateOrProvince;
private String postcode;
private Integer countryID;
@Embedded
private Country country;

public AddressInfo() {
	
}
}