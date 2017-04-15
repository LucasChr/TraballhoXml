package converter;

import java.io.File;

import model.Nota;
import model.Notas;

public class NotaXmlConverter {

	private ConverterXml<Nota> converterNota = new ConverterXml<>(Nota.class);
	private ConverterXml<Notas> converterNotas = new ConverterXml<>(Nota.class, Notas.class);

	public Nota toObject(File XMLfile) {
		return converterNota.deXmlParaObject(XMLfile);
	}

	public void toXML(Nota nota, File file) {
		converterNota.toXML(nota, file);
	}

	public String toXML(Nota nota) {
		return converterNota.deObjectParaXml(nota);
	}

	public String toXML(Notas notas) {
		return converterNotas.deObjectParaXml(notas);
	}
}
