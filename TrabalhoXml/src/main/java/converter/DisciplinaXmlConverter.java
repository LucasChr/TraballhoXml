package converter;

import java.io.File;

import model.Disciplina;
import model.Disciplinas;

public class DisciplinaXmlConverter {

	private ConverterXml<Disciplina> converterDisciplina = new ConverterXml<>(Disciplina.class);
	private ConverterXml<Disciplinas> converterDisciplinas = new ConverterXml<>(Disciplina.class, Disciplinas.class);

	public Disciplina toObject(File XMLfile) {
		return converterDisciplina.deXmlParaObject(XMLfile);
	}

	public void toXML(Disciplina disciplina, File file) {
		converterDisciplina.toXML(disciplina, file);
	}

	public String toXML(Disciplina disciplina) {
		return converterDisciplina.deObjectParaXml(disciplina);
	}

	public String toXML(Disciplinas disciplinas) {
		return converterDisciplinas.deObjectParaXml(disciplinas);
	}
}
