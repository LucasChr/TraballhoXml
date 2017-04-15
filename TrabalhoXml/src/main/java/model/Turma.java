package model;

import java.util.List;

import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Turma {

	@XmlElementWrapper(name = "listaDeAlunos")
	private List<Aluno> alunos;
}
