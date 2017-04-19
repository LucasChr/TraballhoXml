package model;

import java.util.List;

import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Turma {

	@XmlElementWrapper
	private List<Aluno> alunos;

	public List<Aluno> getAlunos() {
		return alunos;
	}
}
