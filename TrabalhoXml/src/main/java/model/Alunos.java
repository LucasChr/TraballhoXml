package model;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Alunos {

	@XmlElementWrapper(name = "listaDeAlunos")
	private List<Aluno> alunos;

	public void addAluno(Aluno aluno) {
		if (alunos == null) {
			alunos = new ArrayList<>();
		}
		alunos.add(aluno);
	}

	public List<Aluno> getAlunos() {
		return alunos;
	}

}
