package converter;

import java.io.File;

import model.Aluno;
import model.Alunos;
import model.Disciplina;
import model.Nota;
import model.Turma;

public class TurmaXmlConverter {

	private ConverterXml<Turma> converterTurma = new ConverterXml<Turma>(Turma.class, Aluno.class, Disciplina.class,
			Nota.class);
	private ConverterXml<Aluno> converterAluno = new ConverterXml<Aluno>(Aluno.class);
	private ConverterXml<Alunos> converterAlunos = new ConverterXml<Alunos>(Aluno.class, Alunos.class);

	public Turma toObject(File XMLfile) {
		return converterTurma.deXmlParaObject(XMLfile);
	}

	public Alunos toObjectAlunos(File XMLfile) {
		return converterAlunos.deXmlParaObject(XMLfile);
	}

	public void toXML(Turma turma, File file) {
		converterTurma.toXML(turma, file);
	}

	public String toXML(Turma turma) {
		return converterTurma.deObjectParaXml(turma);
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
