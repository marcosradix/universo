package controller;

import java.io.Serializable;

import javax.annotation.PostConstruct;
import javax.enterprise.context.Dependent;

@Dependent
public class Somador implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String nome;
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int soma(int i){
		
		return i + 1;
	}
	@PostConstruct
	public void iniciar(){
		
		nome = "Marcos";
	}
	
	
}









