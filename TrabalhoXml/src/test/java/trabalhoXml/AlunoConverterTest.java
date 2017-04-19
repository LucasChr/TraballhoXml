package trabalhoXml;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import java.io.File;
import java.net.URISyntaxException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

import org.junit.Test;

import converter.AlunoXmlConverter;
import converter.TurmaXmlConverter;
import model.Aluno;
import model.Alunos;
import model.Turma;

public class AlunoConverterTest {

	List<Aluno> alunos;

	/*
	 * @Test public void deveConverterParaFileXML() { TurmaXmlConverter
	 * converter = new TurmaXmlConverter(); Turma turma = converter.toObject(new
	 * File("/home/lucas/Downloads/boletimTurma.xml")); assertNotNull(turma);
	 * System.out.println(turma); }
	 * 
	 * @Test public void deveGerarXml() { TurmaXmlConverter converter = new
	 * TurmaXmlConverter(); Turma turma = converter.toObject(new
	 * File("/home/lucas/Downloads/boletimTurma.xml")); String xml =
	 * converter.toXML(turma); assertFalse(xml.isEmpty());
	 * System.out.println(xml); }
	 */

	@Test
	public void deveConverterParaTurma() {
		TurmaXmlConverter converter = new TurmaXmlConverter();
		Turma turma = converter.toObject(new File("/home/lucas/Downloads/boletimTurma.xml"));
		assertNotNull(turma);
		System.out.println(turma.getAlunos());
	}

	@Test
	public void deveConverterParaXML() throws URISyntaxException {
		TurmaXmlConverter converter = new TurmaXmlConverter();
		Turma turma = converter.toObject(new File("/home/lucas/Downloads/boletimTurma.xml"));
		String xml = converter.toXML(turma);
		assertFalse(xml.isEmpty());
		System.out.println(xml);
	}

	/*
	 * @Test public void deveConverterParaFileXML() throws URISyntaxException {
	 * TurmaXmlConverter converter = new TurmaXmlConverter(); Turma turma =
	 * converter.toObject(new File("/home/lucas/Downloads/boletimTurma.xml"));
	 * String xml = converter.toXML(turma); File file = new
	 * File("novaTurma.xml"); converter.toXML(turma, file);
	 * assertTrue(Files.exists(Paths.get("novaTurma.xml")));
	 * System.out.println(xml); }
	 * 
	 */
	/*@Test
	public void deveConverterAlunosParaXML() throws URISyntaxException {
		AlunoXmlConverter converter = new AlunoXmlConverter();
		Aluno aluno = converter.toObject(new File("/home/lucas/Downloads/boletimTurma.xml"));
		Alunos alunos = new Alunos();
		alunos.addAluno(aluno);
		String xml = converter.toXML(alunos);
		assertFalse(xml.isEmpty());
		System.out.println(xml);
	}*/
}
