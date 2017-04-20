package trabalhoXml;

import java.io.File;
import java.net.URISyntaxException;
import java.util.List;

import org.junit.Test;

import converter.TurmaXmlConverter;
import model.Aluno;
import model.Disciplina;
import model.Nota;
import model.Turma;

public class TurmaConverterTest {

	File file = new File("/opt/boletimTurma.xml");

	@Test
	public void deveConverterParaXML() throws URISyntaxException {
		TurmaXmlConverter converter = new TurmaXmlConverter();
		Turma turma = converter.toObject(file);
		List<Aluno> t = turma.getAlunos();
		// System.out.println(t.size());
		String nome = null;
		String materia2 = null;
		Double soma = 0.0;
		String materia1 = null;
		Double mediaMateria2 = 0.0;
		Double mediaGeral = 0.0;
		Double mediaMateria1 = 0.0;
		int count = t.size();
		for (int i = 0; i <= count; i++) {
			nome = t.get(i).getNome();
			List<Disciplina> d = t.get(i).getDisciplinas();
			Integer count2 = d.size();
			for (int m = 0; m < count2; m++) {
				materia2 = d.get(m).getNome();
				List<Nota> n = d.get(m).getNotas();
				Integer count3 = n.size();
				for (int a = 0; a < count3; a++) {
					Double aux = n.get(a).getValor();
					soma = soma + aux;
				}
				if (m <= 0) {
					materia1 = materia2;
					mediaMateria1 = soma / count2;
				}
				mediaMateria2 = soma / count2;
				soma = 0.0;
			}
			mediaGeral = (mediaMateria1 + mediaMateria2) / count;
			System.out.println(nome + " - " + materia1 + " - " + mediaMateria1 + " - " + materia2 + " - "
					+ mediaMateria2 + " - Média geral: " + mediaGeral);
		}
	}
}