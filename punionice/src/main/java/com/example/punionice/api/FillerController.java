package com.example.punionice.api;

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
	
	public FillerController(FillerService fillerService) {
		this.fillerService=fillerService;
	}
	
	@GetMapping("/list")
	public Iterable<Punionica> list(){
		return fillerService.list();
	}
	
	@RequestMapping(method = RequestMethod.GET, value="/getSpecific/{id}/{yesno}")
	public Iterable<Punionica> list_specific(@PathVariable("id") String grad ,@PathVariable("yesno") String power){
		boolean pwr=false;
		if(power=="yes") {pwr=true;}
		return fillerService.list_specific(grad,pwr);
	}
	
	@RequestMapping(method = RequestMethod.DELETE, value="/list/{ID}")
	public void deleteTopic(@PathVariable Long ID) {
			fillerService.deletePunionica(ID);
		}
}
