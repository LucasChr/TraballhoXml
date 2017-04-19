package model;

import java.util.List;
import javax.xml.bind.annotation.XmlElementWrapper;

public class Notas {

	@XmlElementWrapper(name = "notas")
	private List<Nota> notas;

}
