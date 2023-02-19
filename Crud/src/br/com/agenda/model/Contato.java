package br.com.agenda.model;

import java.util.Date;

public class Contato {
	
	private String nome;
	private int id;
	private int idade;
	private Date datadecadastro;
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}
	public Date getDatadecadastro() {
		return datadecadastro;
	}
	public void setDatadecadastro(Date datadecadastro) {
		this.datadecadastro = datadecadastro;
	}
	
	
	
	
	


}
