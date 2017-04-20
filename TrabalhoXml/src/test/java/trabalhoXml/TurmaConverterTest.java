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
		String materia = null;
		Double soma = 0.0;
		String auxMateria = null;
		Double media = 0.0;
		Double mediaGeral = 0.0;
		Double auxMedia = 0.0;
		int num2 = t.size();
		for (int i = 0; i <= num2; i++) {
			nome = t.get(i).getNome();
			List<Disciplina> d = t.get(i).getDisciplinas();
			Integer num1 = d.size();
			for (int m = 0; m < num1; m++) {
				materia = d.get(m).getNome();
				List<Nota> n = d.get(m).getNotas();
				Integer num = n.size();
				for (int a = 0; a < num; a++) {
					Double aux = n.get(a).getValor();
					soma = soma + aux;
				}
				if (m <= 0) {
					auxMateria = materia;
					auxMedia = soma / num1;
				}
				media = soma / num1;
				soma = 0.0;
			}
			mediaGeral = (auxMedia + media) / num2;
			System.out.println(nome + " - " + auxMateria + " - " + auxMedia + " - " + materia + " - " + media
					+ " - Média geral: " + mediaGeral);
		}

	}
}