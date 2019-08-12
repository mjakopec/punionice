package com.example.punionice.api;

import javax.persistence.Embeddable;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@Embeddable
public class Country {
	@GeneratedValue( strategy = GenerationType.AUTO )

private String title;
}