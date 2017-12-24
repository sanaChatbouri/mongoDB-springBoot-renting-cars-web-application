package com.projet.location.repositories;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.projet.location.model.Client;
import com.projet.location.model.Localite;

@Repository("LocaliteRepository")
public interface LocaliteRepository extends MongoRepository<Localite, String>   {

}
