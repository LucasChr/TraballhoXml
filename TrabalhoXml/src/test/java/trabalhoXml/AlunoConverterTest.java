package trabalhoXml;

import static org.junit.Assert.assertNotNull;

import java.io.File;
import java.util.List;

import org.junit.Test;

import converter.TurmaXmlConverter;
import model.Aluno;
import model.Turma;

public class AlunoConverterTest {

	List<Aluno> alunos;

	@Test
	public void deveConverterParaFileXML() {
		TurmaXmlConverter converter = new TurmaXmlConverter();
		Turma turma = converter.toObject(new File("/home/lucas/Downloads/boletimTurma.xml"));
		assertNotNull(turma);
		System.out.println("boletimTurma.xml");
	}
}
