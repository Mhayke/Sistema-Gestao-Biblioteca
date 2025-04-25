package model;

import java.util.ArrayList;
import java.util.List;

public class Cliente {
	
	/*	- nome (String): Nome do cliente.
		- cpf (String): CPF do cliente (único e validado).
		- endereco (String): Endereço do cliente.*/

	// atributos
	
	private String nome;
	private String cpf;
	private String endereco;
	private String numero;
	
	// construtor
	
	public Cliente(String nome, String cpf, String endereco, String numero) {
		
		this.nome = nome;
		this.cpf = cpf;
		this.endereco = endereco;
		this.numero = numero;
	}
	
	
	// getts e setts
	
	public Cliente() { // metodo vazio
		
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

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}
	
	
		
}
