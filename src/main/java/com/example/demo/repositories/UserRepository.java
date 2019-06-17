package com.example.demo.repositories;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.entidades.User;

@Repository
public interface UserRepository extends MongoRepository<User, String> {

	void getUsuarios();

	
}
