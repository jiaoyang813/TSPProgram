package XMLParser.Entity;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;


@XmlRootElement(name="edge")
public class Edge {
	double cost;
	
	public void setCost(double cost)
	{
		this.cost = cost;
	}
	
	public double getCost()
	{
		return cost;
	}
	
}
