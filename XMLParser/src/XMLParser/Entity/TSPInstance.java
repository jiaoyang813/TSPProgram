package XMLParser.Entity;
import javax.xml.bind.annotation.*;


@XmlRootElement(name="travellingSalesmanProblemInstance")
public class TSPInstance {
	
	String name;
	String source;
	String description;
	int doublePrecision;
	int ignoreDigits;
	
	Graph graph;
	
	public void setName(String name)
	{
		this.name = name;
	}
	
	public String getName()
	{
		return name;
	}
	
	public void setSource(String source)
	{
		this.source = source;
	}
	
	public String getSource()
	{
		return source;
	}
	
	public void setDescription(String description)
	{
		this.description = description;
	}
	
	public String getDescription()
	{
		return description;
	}
	
	public void setDoublePrecision(int doublePrecision)
	{	
		this.doublePrecision = doublePrecision;
	}
	
	public int getDoublePrecision()
	{
		return doublePrecision;
	}
	
	public void setIgnoreDigits(int ignoreDigits)
	{
		this.ignoreDigits = ignoreDigits;
	}
	
	public int getIgnoreDigits()
	{
		return ignoreDigits;
	}
	
	public void setGraph(Graph graph)
	{	
		this.graph  = graph;
	}
	
	public Graph getGraph()
	{
		return graph;
	}
	

	
}



