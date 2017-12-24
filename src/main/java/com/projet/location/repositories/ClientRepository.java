package com.projet.location.repositories;


import org.springframework.stereotype.Repository;
import com.projet.location.model.Client;
import org.springframework.data.mongodb.repository.MongoRepository;


@Repository("ClientRepository")
public interface ClientRepository extends MongoRepository<Client, String> {

}
