package com.projet.location.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.projet.location.model.Administrateur;
import com.projet.location.model.Client;
import com.projet.location.model.Localite;
import com.projet.location.model.TypeV;
import com.projet.location.model.Vihicule;
import com.projet.location.repositories.AdminRepository;
import com.projet.location.repositories.ClientRepository;
import com.projet.location.repositories.LocaliteRepository;
import com.projet.location.repositories.TypeRepository;
import com.projet.location.repositories.VihiculeRepository;

@Controller
public class EditController {
	
	@Autowired
	private VihiculeRepository vihiculeRepository ;
	
	@Autowired
	private ClientRepository clientRepository ;
	
	@Autowired
	private TypeRepository typeRepository ;
	
	@Autowired
	private LocaliteRepository localRepository ;
	
	@Autowired
	private AdminRepository adminRepository ;
	
///////////update vihicule
@RequestMapping(value="/update",method=RequestMethod.POST)
public String savevih(@ModelAttribute("vihicule") Vihicule vihicule)
{


	vihiculeRepository.save(vihicule);

//return "success";
return "redirect:/index";
}


///////////update client
@RequestMapping(value="/updateclient",method=RequestMethod.POST)
public String saveclient(@ModelAttribute("client") Client client)
{


	clientRepository.save(client);

//return "success";
return "redirect:/index";
}

///////////update type
@RequestMapping(value="/updatetype",method=RequestMethod.POST)
public String saveclient(@ModelAttribute("type") TypeV type)
{


typeRepository.save(type);

//return "success";
return "redirect:/index";
}


///////////update local
@RequestMapping(value="/updatelocal",method=RequestMethod.POST)
public String savevih(@ModelAttribute("local") Localite local)
{


localRepository.save(local);

//return "success";
return "redirect:/index";
}

///////////update admin
@RequestMapping(value="/updateadmin",method=RequestMethod.POST)
public String saveadmin(@ModelAttribute("administrateur") Administrateur admin)
{


adminRepository.save(admin);

//return "success";
return "redirect:/index";
}
}
