package model;

import java.util.List;

import javax.xml.bind.annotation.XmlAnyElement;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Turma {

	@XmlAnyElement(lax = true)
	private List<Aluno> alunos;

	public List<Aluno> getAlunos() {
		return alunos;
	}
}
