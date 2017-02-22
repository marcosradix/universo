package controller;

import javax.enterprise.context.ConversationScoped;

import javax.inject.Inject;
import javax.inject.Named;
import java.io.Serializable;

@Named
@ConversationScoped
public class Soma implements Serializable {

	private static final long serialVersionUID = 1L;

	private Somador somador;
	private int valor;
	private String nome2;

	public String getNome2() {
		return nome2;
	}

	public void setNome2(String nome2) {
		this.nome2 = nome2;
	}

	public int retorna() {
		
		nome2 = somador.getNome();
		return somador.soma(5);
	}

	public Somador getSomador() {
		return somador;
	}

	public void setSomador(Somador somador) {
		this.somador = somador;
	}

	public int getValor() {
		return valor;
	}

	public void setValor(int valor) {
		this.valor = valor;
	}
	@Inject
	public Soma(Somador somador) {
		super();
		this.somador = somador;
		
	}
	
	public Soma() {
		super();
		
	}

	
}
