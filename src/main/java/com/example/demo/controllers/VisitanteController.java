package com.example.demo.controllers;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entidades.Visitantes;

@RestController
@RequestMapping(value="/visitantes")
public class VisitanteController {
	
	@RequestMapping(method=RequestMethod.GET)
	public ResponseEntity<Visitantes> findVisitante() {		
		Visitantes visitante = new Visitantes("Matheus", "2", "matlivebr@hotmail.com", "visitante");
		return ResponseEntity.ok().body(visitante);
	}
}
