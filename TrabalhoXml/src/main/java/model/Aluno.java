package model;

import java.util.List;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Aluno {

	@XmlAttribute
	private String nome;

	@XmlElementWrapper(name = "listaDeDisciplinas")
	private List<Disciplina> disciplinas;

	@XmlElementWrapper(name = "listaDeNotas")
	private List<Nota> notas;

	public Aluno() {
	}

	public Aluno(String nome, List<Disciplina> disciplinas, List<Nota> notas) {
		super();
		this.nome = nome;
		this.disciplinas = disciplinas;
		this.notas = notas;
	}

	public String getNome() {
		return nome;
	}

	public List<Disciplina> getDisciplinas() {
		return disciplinas;
	}

	public List<Nota> getNotas() {
		return notas;
	}

}
