package XMLParser.Entity;

import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name="vertex")
public class Vertex {
	
	Edge[] edge;
	
	public void setEdge(Edge[] edge)
	{
		this.edge = edge;
	}
	
	public Edge[] getEdge()
	{
		return edge;
	}
	
}
