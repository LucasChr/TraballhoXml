package converter;

import java.io.File;
import java.io.StringWriter;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;

public class ConverterXml<T> {

	private Class<?> clazz[];

	public ConverterXml(Class<?>... clazz) {
		this.clazz = clazz;
	}

	public String deObjectParaXml(T object) {
		try {
			JAXBContext jaxbContext = JAXBContext.newInstance(clazz);
			Marshaller marshaller = jaxbContext.createMarshaller();
			StringWriter stringWriter = new StringWriter();
			marshaller.marshal(object, stringWriter);
			return stringWriter.toString();
		} catch (JAXBException e) {
			throw new RuntimeException("Erro na hora de converter para arquivo", e);
		}
	}

	public void toXML(T objeto, File file) {
		try {
			JAXBContext jaxbContext = JAXBContext.newInstance(clazz);
			Marshaller marshaller = jaxbContext.createMarshaller();
			marshaller.marshal(objeto, file);
		} catch (JAXBException e) {
			throw new RuntimeException("Erro na hora de converter para arquivo", e);
		}
	}

	public T deXmlParaObject(File xmlFile) {
		try {
			JAXBContext jaxbContext = JAXBContext.newInstance(clazz);
			Unmarshaller unmarshaller = jaxbContext.createUnmarshaller();
			T objeto = (T) unmarshaller.unmarshal(xmlFile);
			return objeto;
		} catch (JAXBException e) {
			throw new RuntimeException("Erro na hora de converter", e);
		}
	}
}
