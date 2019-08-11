package com.example.punionice.api;
import javax.persistence.*;

import lombok.*;

import org.apache.commons.lang.builder.ToStringBuilder;

@Data
@NoArgsConstructor
@Entity(name="Connection")
@Table(name="konekcije")
@Embeddable
public class Connection {
	//Connection je JSON Array

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