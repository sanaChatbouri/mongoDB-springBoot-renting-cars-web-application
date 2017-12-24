package com.projet.location.controller;

import java.util.ArrayList;
import java.util.List;

import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.projet.location.model.Administrateur;
import com.projet.location.model.Client;
import com.projet.location.model.Localite;
import com.projet.location.model.TypeV;
import com.projet.location.model.Reservation;
import com.projet.location.model.Vihicule;
import com.projet.location.repositories.AdminRepository;
import com.projet.location.repositories.ClientRepository;
import com.projet.location.repositories.LocaliteRepository;
import com.projet.location.repositories.ReserveRepository;
import com.projet.location.repositories.TypeRepository;
import com.projet.location.repositories.VihiculeRepository;



@Controller

public class indexController {
	
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
	private AdminRepository adminRepository ;
	
	
	@RequestMapping(value= "index", method = RequestMethod.GET)
	  public String newindex(Model model) {
		 model.addAttribute("c", clientRepository.findAll());
		 model.addAttribute("v", vihiculeRepository.findAll());
		 model.addAttribute("r", reserveRepository.findAll());
		 model.addAttribute("t", typeRepository.findAll());
		 model.addAttribute("l", localRepository.findAll());
		 model.addAttribute("a", adminRepository.findAll());
	      return  ("index");

}

	
	//deleteeeeeeeeeeeeeeeeeeeeeeeeee client

	 @RequestMapping(value= "/client/delete/{id}", method = RequestMethod.GET)
	  public String deleteclient(@PathVariable("id") String id )
	 
	  {  
		Client c=  clientRepository.findOne(id);
	  clientRepository.delete(c);
			      return  "redirect:/index";
}
	 
	//deleteeeeeeeeeeeeeeeeeeeeeeeeee vihicule

		 @RequestMapping(value= "/vihicule/delete/{id}", method = RequestMethod.GET)
		  public String deletevihicule(@PathVariable("id") String id )
		 
		  {  
			Vihicule v=  vihiculeRepository.findOne(id);
		  vihiculeRepository.delete(v);
				      return  "redirect:/index";
	}
		 
		 
		//deleteeeeeeeeeeeeeeeeeeeeeeeeee admin

		 @RequestMapping(value= "/admin/delete/{id}", method = RequestMethod.GET)
		  public String deleteadmin(@PathVariable("id") String id )
		 
		  {  
			Administrateur a = adminRepository.findOne(id);
		  adminRepository.delete(a);
				      return  "redirect:/index";
	}
	 ////go to edit page vihicule
		 @RequestMapping(value= "/editVihicule/{id}")
		 public String editvih(@PathVariable(value = "id") String id, Model model) {
		 
		model.addAttribute("vihicule", vihiculeRepository.findOne(id));
		vihiculeRepository.delete(id);
		   return  "editVihicule";
		 }
		 
		 ////go to edit page admin
		 @RequestMapping(value= "/editadmin/{id}")
		 public String editadmin(@PathVariable(value = "id") String id, Model model) {
		 
		model.addAttribute("administrateur", adminRepository.findOne(id));
		adminRepository.delete(id);
		   return  "editadmin";
		 }
		 
		 ////go to edit page client
		 @RequestMapping(value= "/editClient/{id}")
		 public String editclient(@PathVariable(value = "id") String id, Model model) {
		 
		model.addAttribute("client", clientRepository.findOne(id));
		clientRepository.delete(id);
		   return  "editClient";
		 }
 
 
		 
		 
///////////ajouttttt vihicule
@RequestMapping(value="ajout", method=RequestMethod.POST)
public String ajout(@ModelAttribute Vihicule vihicule)
{


	vihiculeRepository.save(vihicule);

//return "success";
return "redirect:/index";
}

///////////ajouttttt admin
@RequestMapping(value="ajoutadmin", method=RequestMethod.POST)
public String ajoutadmin(@ModelAttribute Administrateur admin)
{


adminRepository.save(admin);

//return "success";
return "redirect:/index";
}

//deleteeeeeeeeeeeeeeeeeeeeeeeeee reservation

@RequestMapping(value= "/reservation/delete/{id}", method = RequestMethod.GET)
 public String deletereservation(@PathVariable("id") String id )

 {  
	Reservation r=  reserveRepository.findOne(id);
	reserveRepository.delete(r);
		      return  "redirect:/index";
}

//deleteeeeeeeeeeeeeeeeeeeeeeeeee type

@RequestMapping(value= "/type/delete/{id}", method = RequestMethod.GET)
public String deletetype(@PathVariable("id") String id )

{  
	TypeV t =  typeRepository.findOne(id);
	typeRepository.delete(t);
		      return  "redirect:/index";
}

////go to edit page type
@RequestMapping(value= "/edittype/{id}")
public String edittype(@PathVariable(value = "id") String id, Model model) {

model.addAttribute("type", typeRepository.findOne(id));
typeRepository.delete(id);
  return  "edittype";
}


///////////ajouttttt type
@RequestMapping(value="ajouttype", method=RequestMethod.POST)
public String ajouttype(@ModelAttribute TypeV type)
{


typeRepository.save(type);

//return "success";
return "redirect:/index";
}

///////////ajouttttt localllllllllll
@RequestMapping(value="ajoutlocal", method=RequestMethod.POST)
public String ajouttype(@ModelAttribute Localite local)
{


localRepository.save(local);

//return "success";
return "redirect:/index";
}
////go to vehicule list for type
@RequestMapping(value="/liste/{nom_type}")
public String listvih(@PathVariable(value = "nom_type") String nom_type, Model model) {
	 
	List<Vihicule> l =vihiculeRepository.findAll();
	List<Vihicule> l1 = new ArrayList<Vihicule>();
			for(int i=0;i<l.size();i++)
			{
			if(l.get(i).getNom_type().equals(nom_type))
				
			{int j=0;
				l1.add(j, l.get(i));
				j++;
			}
				
			}
	 model.addAttribute("v",l1);
     return  "liste";

	}


//deleteeeeeeeeeeeeeeeeeeeeeeeeee type

@RequestMapping(value= "/local/delete/{id}", method = RequestMethod.GET)
public String deletlocal(@PathVariable("id") String id )

{  
	Localite l =  localRepository.findOne(id);
	localRepository.delete(l);
		      return  "redirect:/index";
}

////go to edit page type
@RequestMapping(value= "/editlocal/{id}")
public String editlocal(@PathVariable(value = "id") String id, Model model) {

model.addAttribute("local", localRepository.findOne(id));
localRepository.delete(id);
return  "editlocal";
}




////go to vehicule list for local
@RequestMapping(value="/local/{nom}")
public String listveh(@PathVariable(value = "nom") String nom, Model model) {
 
List<Vihicule> l =vihiculeRepository.findAll();
List<Vihicule> l1 = new ArrayList<Vihicule>();
		for(int i=0;i<l.size();i++)
		{
		if(l.get(i).getNom_local().equals(nom))
			
		{int j=0;
			l1.add(j, l.get(i));
			j++;
		}
			
		}
 model.addAttribute("v",l1);
 return  "local";

}


}
