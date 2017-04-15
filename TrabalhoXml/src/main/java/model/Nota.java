package model;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Nota {

	@XmlAttribute
	private Double valor;

	public Nota(Double valor) {
		super();
		this.valor = valor;
	}

	public Nota() {
		super();
	}

}
