package com.example.punionice.api;

import javax.persistence.Embeddable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.apache.commons.lang.builder.ToStringBuilder;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@Entity(name="Connection")
@Table(name="konekcije")
@Embeddable
public class Connection {

@Id	
@GeneratedValue( strategy = GenerationType.AUTO )
private Long pk_id_2;
private String Amps;
private String Voltage;
private String PowerKW;

@Override
public String toString() {
return new ToStringBuilder(this)
		.append("amps", Amps)
		.append("voltage", Voltage)
		.append("powerKW", PowerKW).toString();
}
}