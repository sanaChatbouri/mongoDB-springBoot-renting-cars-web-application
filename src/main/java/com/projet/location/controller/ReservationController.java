package com.projet.location.controller;

import org.springframework.stereotype.Controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.projet.location.model.Vihicule;
import com.projet.location.model.Reservation;
import com.projet.location.repositories.ReserveRepository;
import com.projet.location.repositories.VihiculeRepository;


@Controller
public class ReservationController {

	@Autowired
	private VihiculeRepository vihiculeRepository ;
	
	@Autowired
	private ReserveRepository reserveRepository ;
	
	 @RequestMapping(value= "reserver", method = RequestMethod.GET)
	  public String newreserve(Model model) {
		 model.addAttribute("v", vihiculeRepository.findAll());
 	
	      return  ("reserver");
      
}
	 ////go to page reservation
	 @RequestMapping(value= "/form")
	 public String editvih( Model model) {
	 
	/*model.addAttribute("vihicule", vihiculeRepository.findOne(id));*/

	   return  "form";
	 }
     

	 
	  @RequestMapping(value="/reserve",method=RequestMethod.POST)
	  public String saveresv(@ModelAttribute("reservation") Reservation reservation, BindingResult result, ModelMap model)
	  {
	  
		  if (result.hasErrors()) {
				return "form";
			}
		
		  reserveRepository.save(reservation);
	
			//return "success";
			return "redirect:/reserver";
	  }
	  


	
}
