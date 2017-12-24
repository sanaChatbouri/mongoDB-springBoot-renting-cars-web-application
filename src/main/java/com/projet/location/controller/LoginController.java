/*package com.projet.location.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.projet.location.model.Compte;
import com.projet.location.model.Vihicule;
import com.projet.location.repositories.ClientRepository;
import com.projet.location.repositories.CompteRepository;
import com.projet.location.repositories.LocaliteRepository;
import com.projet.location.repositories.ReserveRepository;
import com.projet.location.repositories.TypeRepository;
import com.projet.location.repositories.VihiculeRepository;

@Controller
public class LoginController {
	@Autowired
	private ClientRepository clientRepository ;
	@Autowired
	private VihiculeRepository vihiculeRepository ;
	
	@Autowired
	private TypeRepository typeRepository ;
	
	@Autowired
	private LocaliteRepository localRepository ;
	
	
	@Autowired
	private ReserveRepository reserveRepository ;
	
	
	@Autowired
	private CompteRepository compteRepository ;
	
	
	 @RequestMapping(value="/loginsuperviseur", method = RequestMethod.GET)
	    public String showLoginPage(ModelMap model){
		 Compte compte = new Compte();
		 model.addAttribute("compte", compte);
		 model.addAttribute("c", clientRepository.findAll());
		 model.addAttribute("v", vihiculeRepository.findAll());
		 model.addAttribute("r", reserveRepository.findAll());
		 model.addAttribute("t", typeRepository.findAll());
		 model.addAttribute("l", localRepository.findAll());
	        return "loginsuperviseur";
	    }
	 
	@RequestMapping(value="/index", method=RequestMethod.POST)
	    public String access(@ModelAttribute Compte compte, ModelMap model)
	    
	    { 
	    	
	    	if(compte.getLogin().equals("admin") || (compte.getPassword().equals(anObject)))
	    	{  System.out.println("access");
	    		return "index"; }
	    	
	    	else
	    		
	    	
	    	{ model.put("message", "wrong username or password");
    	return "loginsuperviseur";
		}
	    }
			
}
*/
