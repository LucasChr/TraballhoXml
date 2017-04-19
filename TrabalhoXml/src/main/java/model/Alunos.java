package model;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Alunos {

	
	private List<Aluno> alunos;

	public void addAluno(Aluno aluno) {
		if (alunos == null) {
			alunos = new ArrayList<>();
		}
		alunos.add(aluno);
	}

	public List<Aluno> getPessoas() {
		return alunos;
	}
	
}
