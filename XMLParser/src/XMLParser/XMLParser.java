package XMLParser;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;

import XMLParser.Entity.*;


public class XMLParser {
	private static final String xmlFile = "./br17.xml";
	public static void main(String[] args) throws JAXBException, FileNotFoundException {
		// TODO Auto-generated method stub
		 // create JAXB context and instantiate marshaller
	    JAXBContext context = JAXBContext.newInstance(TSPInstance.class);
	    Unmarshaller um = context.createUnmarshaller();
	    TSPInstance tspInstance = (TSPInstance) um.unmarshal(new FileReader(xmlFile));
	    Graph graph = tspInstance.getGraph();
		System.out.println(tspInstance.getDescription());
	}
	
	public TSPInstance getResult() throws JAXBException, FileNotFoundException
	{
		JAXBContext context = JAXBContext.newInstance(TSPInstance.class);
	    Unmarshaller um = context.createUnmarshaller();
	    TSPInstance tspInstance = (TSPInstance) um.unmarshal(new FileReader(xmlFile));
	    
	    return tspInstance;
	}

}
