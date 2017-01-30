public class LineSegment
{
	//We are making a new class the will build upon the Point class. In order to use Point class in different class, it must be public and fields must be public. 
	
	//Declare some instance fields (meaning non-static fields)
	private Point start; 
	private Point end; 
	
	
	//Keep track of how many segment instances exist. Good to initialize right away
	private static int numSegments = 0; 
	
	//Data could get inconsistent if you make a field called length; 
	
	//Constructors
	public LineSegment() //The default constructor - has no args. Usually need to override the default constructor 
	{
		//this.start = new Point();  
		//this.end = new Point();  
		//numSegments++; 
		
		//Another way to do it
		this(new Point(), new Point()); //CALLING THE OTHER CONSTRUCTOR
	}
	
	public LineSegment(Point start, Point end)
	{
		this.start = start; //use this because formal parameter start is local and would "take priority" 
		this.end = end; 
		
		//Remember to increment the counter of all line segments
		numSegments++; 
	}
	
	//Accessor methods
	public Point getStart()
	{
		return start; 
	}
	
	public Point getEnd()
	{
		return end;
	}
	
	public static int getNumSegments() //STATIC: If field is static, its accessor should be too. 
	{
		return numSegments; 
	}
	
	public double slope()
	{
		return ((end.getY() - start.getY())/(end.getX() - start.getX())); 
	}
	
	
	public String name()
	{
		return start.name + end.name; 
	}
	
	//Override toString
	public String toString() //Magic method
	{
		return start.toString() + end.toString(); 
	}
	
	public double length()
	{
		//TODO re-write this method to use methods from the point class 
		//double deltaX = start.getX() - end.getX(); //Use accessor method because not in the Point class
		//double deltaY = start.getY() - end.getY(); 
		
		//return Math.sqrt(Math.pow(deltaX, 2) + Math.pow(deltaY, 2)); 
		
		return start.distanceTo(end); 
	}
}