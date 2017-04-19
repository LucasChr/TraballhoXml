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

import converter.TurmaXmlConverter;
import model.Aluno;
import model.Disciplina;
import model.Nota;
import model.Turma;

public class TurmaConverterTest {

	File file = new File("/opt/boletimTurma.xml");

	/*@Test
	public void deveConverterParaTurma() {
		TurmaXmlConverter converter = new TurmaXmlConverter();
		Turma turma = converter.toObject(file);
		assertNotNull(turma);
		System.out.println(turma.getAlunos());
	}*/

	@Test
	public void deveConverterParaXML() throws URISyntaxException {
		TurmaXmlConverter converter = new TurmaXmlConverter();
		Turma turma = converter.toObject(file);
		for(int i=0;i<=turma.getAlunos().size();i++){
			Aluno a = turma.getAlunos().get(i);
			String nome = a.getNome();
			
			for(int d=0;d<=a.getDisciplinas().size();d++){
				Disciplina disc = a.getDisciplinas().get(d);
				String materia = disc.getNome();
				Double soma = null;
				Integer numNotas = disc.getNotas().size();
				for(int n=0;n<=disc.getNotas().size();n++){
					Nota not = disc.getNotas().get(n);
					Double nota = not.getValor();
					soma += nota;
				}
				
			}
		}
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
	/*
	 * @Test public void deveConverterAlunosParaXML() throws URISyntaxException
	 * { AlunoXmlConverter converter = new AlunoXmlConverter(); Aluno aluno =
	 * converter.toObject(new File("/home/lucas/Downloads/boletimTurma.xml"));
	 * Alunos alunos = new Alunos(); alunos.addAluno(aluno); String xml =
	 * converter.toXML(alunos); assertFalse(xml.isEmpty());
	 * System.out.println(xml); }
	 */
/*
	@Test
	public void deveConverter() {
		TurmaXmlConverter converter = new TurmaXmlConverter();
		Turma turma = converter.toObject(file);
		assertNotNull(turma);
		System.out.println(turma);
	}
*/
}
