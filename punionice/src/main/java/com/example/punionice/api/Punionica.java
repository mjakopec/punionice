package com.example.punionice.api;
import java.util.List;

import javax.persistence.*;
import lombok.*;

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