package com.projet.location.repositories;

import java.util.List;

import org.springframework.data.mongodb.core.query.Query;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.projet.location.model.Client;
import com.projet.location.model.Vihicule;

@Repository("VihiculeRepository")
public interface VihiculeRepository extends MongoRepository<Vihicule, String>  {

	

}
