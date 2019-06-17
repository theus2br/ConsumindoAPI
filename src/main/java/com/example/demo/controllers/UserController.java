package com.example.demo.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entidades.User;
import com.example.demo.repositories.UserRepository;
import com.example.demo.service.UserService;

@RestController
@RequestMapping(value="/users")
public class UserController {

	@Autowired
	private UserService service;
	
	@RequestMapping(method=RequestMethod.GET)
	public ResponseEntity<List<User>> findAll(){		
		List<User> list = service.findAll();
		return ResponseEntity.ok().body(list);		
	}
	
	@RequestMapping(method=RequestMethod.POST)
	public ResponseEntity<List<User>> sendOne(){
		List<User> list = service.findAll();
		return ResponseEntity.ok().body(list);
	}
}
