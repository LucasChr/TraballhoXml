package model;

import java.util.List;

import javax.xml.bind.annotation.XmlAnyElement;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Disciplina {

	@XmlAttribute
	private String nome;

	@XmlElementWrapper(name = "notas") // cria a lista <disciplinas>
	@XmlAnyElement(lax = true) // identifica o elemento
	private List<Nota> notas;

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
