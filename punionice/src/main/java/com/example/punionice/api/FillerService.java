package com.example.punionice.api;

import java.util.List;
import org.springframework.stereotype.Service;


@Service
public class FillerService {
	
	public FillerRepository fillerRepository; //bio private i nije išlo??

    public FillerService(FillerRepository fillerRepository) {
        this.fillerRepository = fillerRepository;
    }

    public Iterable<Punionica> list() {
        return fillerRepository.findAll();
    }

    public Punionica save(Punionica punionica) {
        return fillerRepository.save(punionica);
    }
    
    public void save(List<Punionica> punionice) {
    	fillerRepository.saveAll(punionice);
    }

	public Iterable<Punionica> list_specific(Long ID) {
		return fillerRepository.findAll();
	}
	
	public String deletePunionica(Long ID) {
		if (fillerRepository.findById(ID) != null) {
			fillerRepository.deleteById(ID);
			return "Obrisana punionica broj "+ID+"!";
		}
		else
		{
			return "Ne mogu obrisati punionicu broj"+ID+"!";
		}
	}
}