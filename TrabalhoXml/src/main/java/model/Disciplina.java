package model;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Disciplina {

	@XmlAttribute
	private String nome;

	public Disciplina() {
	}

	public Disciplina(String nome) {
		super();
		this.nome = nome;
	}

	public String getNome() {
		return nome;
	}

}
