package com.example.punionice.api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/punionice")
public class FillerController {

	@Autowired
	private FillerService fillerService;
	
	public FillerController(FillerService fillerService) {
		this.fillerService=fillerService;
	}
	
	@GetMapping("/list")
	public Iterable<Punionica> list(){
		return fillerService.list();
	}
	
	@RequestMapping(method = RequestMethod.GET, value="/getSpecific/{id}/{yesno}")
	public Iterable<Punionica> list_specific(Long ID){
		return (Iterable<Punionica>) fillerService.list_specific(ID);/*složi SQL ili Lambdu za ciljani dohvat*/
	}
	
	@RequestMapping(method = RequestMethod.DELETE, value="/delete/{id}")
	public void deleteTopic(@PathVariable Long ID) {
			fillerService.deletePunionica(ID);
		}
}
