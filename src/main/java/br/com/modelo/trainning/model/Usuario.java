package br.com.modelo.trainning.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "USUARIO")
public class Usuario {
	

	@Id
	@GeneratedValue( strategy = GenerationType.AUTO)
	private Long id;

	private String nome;

	private String sobrenome;

	private String password; 
	
	public Usuario() {
		super();
	}

	public Usuario(String nome, String sobrenome, String password) {
		super();
		this.nome = nome;
		this.sobrenome = sobrenome;
		this.password = password;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getSobrenome() {
		return sobrenome;
	}

	public void setSobrenome(String sobrenome) {
		this.sobrenome = sobrenome;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

}
