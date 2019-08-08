package com.example.punionice.api;

import javax.persistence.*;

import com.fasterxml.jackson.databind.annotation.JsonSerialize;

import lombok.*;


@Data
@AllArgsConstructor
@Entity
@JsonSerialize
public class Punionica {
	@GeneratedValue( strategy = GenerationType.AUTO )
	@Id private Long pk_id;

private int ID;
private String UUID;
//Array//private String[] AddressInfo = new String[] {"Title","AddressLine1","AddressLine2","Town","StateOrProvince","Postcode","CountryID"};
//List//private ArrayList<String> AddressInfo = new ArrayList<String>() {{
    //add("Title"); add("AddressLine1"); add("AddressLine2"); add("Town"); add("StateOrProvince"); add("Postcode"); add("CountryID");}};
//private Map<String, String> AddressInfo;

@Embedded
private AddressInfo AddressInfo;

@Embedded
private Connection Connections;

public Punionica() {
	}
}
