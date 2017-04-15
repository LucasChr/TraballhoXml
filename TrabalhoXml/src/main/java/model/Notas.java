package model;

import java.util.List;
import javax.xml.bind.annotation.XmlElementWrapper;

public class Notas {

	@XmlElementWrapper(name = "listaDeNotas")
	private List<Nota> notas;

}
