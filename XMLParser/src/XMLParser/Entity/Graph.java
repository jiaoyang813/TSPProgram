package XMLParser.Entity;

import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name="graph")
public class Graph {
	
	Vertex[] vertex;
	
	public void setVertex(Vertex[] vertex)
	{
		this.vertex = vertex;
	}
	
	public Vertex[] getVertex()
	{
		return vertex;
	}
 }
