package model;

import java.util.List;

import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Disciplinas {

	@XmlElementWrapper(name = "listaDeDisciplinas")
	private List<Disciplina> disciplinas;
}
