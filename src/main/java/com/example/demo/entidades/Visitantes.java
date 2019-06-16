package com.example.demo.entidades;

public class Visitantes {
	private String nome;
	private String id;
	private String email;
	
	private String nivelAcesso;
	
	public Visitantes() {
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getNivelAcesso() {
		return nivelAcesso;
	}

	public void setNivelAcesso(String nivelAcesso) {
		this.nivelAcesso = nivelAcesso;
	}

	public Visitantes(String nome, String id, String email, String nivelAcesso) {
		super();
		this.nome = nome;
		this.id = id;
		this.email = email;
		this.nivelAcesso = nivelAcesso;
	}
	
	
	
}
