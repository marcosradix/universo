package model;

import java.util.List;

import javax.persistence.*;


@Entity
@Table(name="sala")
public class Sala {

	
	@Id
	@GeneratedValue
	private Long id;
	
	private String descricao;
	
	@OneToMany(mappedBy="sala" , cascade=CascadeType.ALL)
	private List<Aluno> alunos;
	
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
	public List<Aluno> getAlunos() {
		return alunos;
	}
	public void setAlunos(List<Aluno> alunos) {
		this.alunos = alunos;
	}
	
	
	
}
