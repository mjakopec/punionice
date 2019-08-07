package com.example.punionice.api;

import javax.persistence.Embeddable;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
@Embeddable
public class Connections {
	private int Amps;
    private int Voltage;
    private double PowerKW;

    public Connections() {}
}
