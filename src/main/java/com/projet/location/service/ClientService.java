package com.projet.location.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.projet.location.repositories.ClientRepository;
import com.projet.location.model.Client;

@Service
public class ClientService {

	@Autowired
	ClientRepository clientRepository;
	
	
}
