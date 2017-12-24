package com.projet.location.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.projet.location.model.Client;
import com.projet.location.repositories.ClientRepository;



@Controller
public class HomepageController {
	@Autowired
	private ClientRepository clientRepository ;
	
	 @RequestMapping(value= "homepage", method = RequestMethod.GET)
	  public String newhomepage(ModelMap model) {
		
	      return  ("homepage");
     }
	 
	
}
