package com.example.punionice.api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class FillerService {
	
	@Autowired
	private FillerRepository fillerRepository;
	
    public FillerService(FillerRepository fillerRepository) {
        this.fillerRepository = fillerRepository;
    }

    public Iterable<Punionica> list() {
        return fillerRepository.findAll();
    }

    public Punionica save(Punionica punionica) {
        return fillerRepository.save(punionica);
    }
    
    public void save(Iterable<Punionica> punionice) {
    	fillerRepository.saveAll(punionice);
    }

	public Iterable<Punionica> list_specific() {
		
		return fillerRepository.findAll();
	}
	
	public String deletePunionica(Long ID) {
		if (fillerRepository.existsById(ID)) {
			fillerRepository.deleteById(ID);
			return "Obrisana punionica broj "+ID+"!";
		}
		else
		{
			return "Ne mogu obrisati punionicu broj"+ID+"!";
		}
	}	
}