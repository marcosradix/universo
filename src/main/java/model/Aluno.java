package model;

import javax.persistence.*;

@Entity
public class Aluno {
	
	@Id
	@GeneratedValue
	private Long id;
	
	private String descricao;
	
	@ManyToOne
	private Sala sala;
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public Sala getSala() {
		return sala;
	}
	public void setSala(Sala sala) {
		this.sala = sala;
	}
	
	
	
	
}
