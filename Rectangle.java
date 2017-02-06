public class Rectangle
{
	protected double l; //Protected keyword is one way to fix access issue in square class. Not on AP subset
	protected double w; 
	
	//TODO constructors
	public Rectangle()
	{
		this(1, 1); 
	}
	
	public Rectangle(double w, double l)
	{
		//TODO validate 
		this.w = w; 
		this.l = l; 
	}
	
	//Methods
	public double area()
	{
		return l * w; 
	}
	
	public double diagonal()
	{
		return Math.sqrt(l*l + w*w); 
	}
	
	public double perimeter()
	{
		return (2 * l) + (2 * w); 
	}
	
	
	//Accessors
	public double getWidth()
	{
		return w; 
	}
	
	public double getLength()
	{
		return l; 
	}
	
	//Modifier
	public void setWidth(double w)
	{
		if (w < 0)
			throw new IllegalArgumentException("Width must be >= 0"); 
		else
			this.w = w; 
	}
	
	public void setLength(double l)
	{
		if (l < 0)
			throw new IllegalArgumentException("Length must be >= 0"); 
		else
			this.l = l; 
	}
	
	//Override toString
	public String toString()
	{
		return("Quadrilateral with 4 90 degree methods has a length of " + l + " and a width of " + w + "."); 
	}
	
}