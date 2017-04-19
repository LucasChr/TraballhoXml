package converter;

import java.io.File;

import model.Aluno;
import model.Alunos;

public class AlunoXmlConverter {

	private ConverterXml<Aluno> converterAluno = new ConverterXml<Aluno>(Aluno.class);
	private ConverterXml<Alunos> converterAlunos = new ConverterXml<Alunos>(Aluno.class, Alunos.class);

	public Aluno toObject(File XMLfile) {
		return converterAluno.deXmlParaObject(XMLfile);
	}

	public void toXML(Aluno aluno, File file) {
		converterAluno.toXML(aluno, file);
	}

	public String toXML(Aluno aluno) {
		return converterAluno.deObjectParaXml(aluno);
	}

	public String toXML(Alunos alunos) {
		return converterAlunos.deObjectParaXml(alunos);
	}
}
