public class Square extends Rectangle
{
	public Square()
	{
		//Let's just directly use the Rectangle default constructor
		super(); 
	}
	
	public Square(double side)
	{
		super(side, side); 
	}
	
	
	//Accessor
	public double getSide()
	{
		return l; 
	}
	
	//Modifier
	public void setSide(double side)
	{
		if (side < 0)
			throw new IllegalArgumentException("Side Length must be non-negative"); 
		else
		{
			this.l = side; 
			this.w = side;
		} 
	}
	
	//Override methods
	public void setLength(double side)
	{
		setSide(side); //Don't rewrite code, just use the other method
	}
	
	public void setWidth(double side)
	{
		setSide(side); 
	}
}