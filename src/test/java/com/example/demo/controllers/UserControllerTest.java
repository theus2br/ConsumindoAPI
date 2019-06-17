package com.example.demo.controllers;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.mock;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.example.demo.entidades.User;
import com.example.demo.repositories.UserRepository;
import com.example.demo.service.UserService;

public class UserControllerTest {
	 private final UserController controller = new UserController();	
	 private final UserRepository fake = mock(UserRepository.class);
	
	@Autowired
	private UserService service;
	 
	
	// findAll não funcionou, tentar encontrar o motivo pra trazer os dados do Mongodb
	
	@Test
	public void deveBuscarUsuario() {
	User maria = new User("5d0690b0ff9121185c8e47f6", "Maria", "maria@gmail.com");
	List<User> usu = Arrays.asList(maria);
//	System.out.println(maria.getId() + "5d0690b0ff9121185c8e47f6");
	List<User> usu2 = (List<User>) fake;
	System.out.println(usu2);
		
		assertEquals(usu, usu2);
	}

}
