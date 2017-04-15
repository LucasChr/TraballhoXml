package trabalhoXml;

import static org.junit.Assert.assertTrue;

import java.io.File;
import java.net.URISyntaxException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

import converter.AlunoXmlConverter;
import converter.PessoaXmlConverter;
import converter.TurmaXmlConverter;
import model.Aluno;
import model.Disciplina;
import model.Nota;
import model.Pessoa;
import model.Turma;

public class AlunoConverterTest {

	List<Aluno> alunos;
	
	
	@Test
	public void deveConverterParaFileXML() throws URISyntaxException {
		TurmaXmlConverter converter = new TurmaXmlConverter();
		Turma turma = new Turma();
		String xml = converter.toXML(turma);
		File file = new File("novaAluno.xml");
		converter.toXML(turma, file);
		assertTrue(Files.exists(Paths.get("novoAluno.xml")));
		System.out.println(xml);
		
		
		PessoaXmlConverter converter = new PessoaXmlConverter();
		Pessoa pessoa = new Pessoa("Lucas", "123546");
		String xml = converter.toXML(pessoa);
		File file = new File("novaPessoa.xml");
		converter.toXML(pessoa, file);
		assertTrue(Files.exists(Paths.get("novaPessoa.xml")));
		System.out.println(xml);
	}
}
