package com.example.punionice.api;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
@Embeddable
public class Connection {
/*public  int Amps;
private int Voltage;*/
@Column(name="PowerKW")
private double PowerKW;
/*
public int getAmps() {return Amps;}
public void setAmps(int amps) {amps = Amps;}

public int getVoltage() {return Voltage;}
public void setVoltage(int voltage) {voltage = Voltage;}
*/
public Double getPowerKW() {return PowerKW;}
public void setPowerKW(Double powerKW) {PowerKW = powerKW;}

public Connection(){
	}
}