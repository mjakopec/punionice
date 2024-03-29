package com.example.punionice.api;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class FillerController {

	@Autowired
	public FillerService fillerService;
	@Autowired
	public CustomQuery customquery;
	
	
	public FillerController(FillerService fillerService) {
		this.fillerService=fillerService;
	}
	
	@GetMapping("/list")
	public Iterable<Punionica> list(){
		return fillerService.list();
	}
	
	@RequestMapping(method = RequestMethod.GET, value="/getSpecific/grad={grad}/power={yesno}")
	public Iterable<Punionica> list_specific(@PathVariable("grad") String grad ,@PathVariable("yesno") Boolean power){
		Integer pwr=1;
		if(power) {pwr=0;}
		return (List<Punionica>) customquery.list_specific(grad,pwr);
	}
	
	@RequestMapping(method = RequestMethod.DELETE, value="/list/{ID}")
	public void deleteTopic(@PathVariable Long ID) {
			fillerService.deletePunionica(ID);
		}
}
