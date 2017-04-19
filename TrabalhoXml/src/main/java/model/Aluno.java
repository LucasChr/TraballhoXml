package model;

import java.util.List;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Aluno {

	@XmlAttribute
	private String nome;

	@XmlElementWrapper(name = "disciplinas")
	private List<Disciplina> disciplinas;

	public Aluno() {
	}

	public Aluno(String nome, List<Disciplina> disciplinas) {
		super();
		this.nome = nome;
		this.disciplinas = disciplinas;
	}

	public String getNome() {
		return nome;
	}

	public List<Disciplina> getDisciplinas() {
		return disciplinas;
	}
}
