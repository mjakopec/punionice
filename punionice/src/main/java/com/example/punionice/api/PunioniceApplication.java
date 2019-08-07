package com.example.punionice.api;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.MapperFeature;
import com.fasterxml.jackson.databind.ObjectMapper;

@SpringBootApplication
public class PunioniceApplication {

	public static void main(String[] args) {
		SpringApplication.run(PunioniceApplication.class, args);
	}

	@Bean 
	CommandLineRunner runner(FillerService fillerService) { 
		 return args ->{
//	read json and write to db 
			 //Spring Batch za periodičko povlačenje
	ObjectMapper mapper = new ObjectMapper();
	mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
	mapper.configure(MapperFeature.ACCEPT_CASE_INSENSITIVE_PROPERTIES, true);
	TypeReference<List<Punionica>> typeReference = new	TypeReference<List<Punionica>>(){}; 
	InputStream inputStream =Punionica.class.getResourceAsStream("/data.json");

	try {
		List<Punionica> punionice = mapper.readValue(inputStream,typeReference);
		fillerService.save(punionice); 
		System.out.println("Punionice Spremljene! ");
		}
	catch (IOException e){
		System.out.println("Ne mogu spremiti punionice: " +	e.getMessage()); 
		}
	};
	}
}