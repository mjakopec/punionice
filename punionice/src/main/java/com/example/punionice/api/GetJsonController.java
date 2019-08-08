package com.example.punionice.api;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

public class GetJsonController {
	@RestController
	@RequestMapping("/myservice")
	public class BaseService {  

	    @RequestMapping(value="/process", method = RequestMethod.POST)
	    public void process(@RequestBody String payload) throws Exception {
	        System.out.println(payload);
	    }
	}
}
