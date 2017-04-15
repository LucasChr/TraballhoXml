package converter;

import java.io.File;

import model.Aluno;

public class AlunoXmlConverter {

	private ConverterXml<Aluno> converterAluno = new ConverterXml<>(Aluno.class);

	public Aluno toObject(File XMLfile) {
		return converterAluno.deXmlParaObject(XMLfile);
	}

	public void toXML(Aluno aluno, File file) {
		converterAluno.toXML(aluno, file);
	}

	public String toXML(Aluno aluno) {
		return converterAluno.deObjectParaXml(aluno);
	}

}
