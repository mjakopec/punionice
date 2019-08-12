package com.example.punionice.api;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import lombok.Data;
import lombok.NoArgsConstructor;



@Entity(name = "Punionica")
@Table(name="punionica")
@Data
@NoArgsConstructor
public class Punionica {
@GeneratedValue( strategy = GenerationType.AUTO )
@Id 
private Long pk_id;
private String UUID;
@Embedded
private AddressInfo AddressInfo;

@OneToMany(cascade = CascadeType.ALL, orphanRemoval = true)
@JoinColumn(name = "pk_id")
	private List<Connection> Connections;
}