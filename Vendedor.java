package model;

import java.util.List;
import java.util.ArrayList;

public class Vendedor {

	/*	- nome (String): Nome do vendedor.
		- cpf (String): CPF do vendedor (único e validado).
		- CRB – (Double): Conselho Regional de Biblioteconomia */
	
	
	// atributos

	private String nome;
	private String cpf;
	private String crb;
	
	// contrutor
	
	public Vendedor(String nome, String cpf, String crb) {
		this.nome = nome;
		this.cpf = cpf;
		this.crb = crb;
	}
	
	
	// getts e setts
	
	public Vendedor() { // metodo vazio 
		
	}
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getCrb() {
		return crb;
	}

	public void setCrb(String crb) {
		this.crb = crb;
	}
	
	
}
