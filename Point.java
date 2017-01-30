public class Point
{
	/*Declare some static fields (same for all instances - use static keyword)
	public static int x; */
	
	//Declare some instance fields (every point has its own copy of these fields)
	private double x; //cannot modify these fields outside of the class if private
	private double y; 
	public String name; 
	
	//Declare a constructor to make a new instance of the class
		//Constructors always have the same name as the class. 
	public Point()
	{
		x = 0; 
		y = 0;
		name = "O"; 
	}
	
	//Overloaded constructors 
	public Point(double x, double y)
	{
		/*if (a < 0){
			//throw new IllegalArgumentException("x value cannot be negative"); 
			x = 0; 
		}
		else*/
		this.x = x; 
			
		/*if (b < 0){
			//throw new IllegalArgumentException("x value cannot be negative"); 
			y = 0; 
		}
		else*/
		this.y = y; 
		//x = a; Scope of a and b are local (formal parameters). x and y are instance fields
		//y = b; 
		name = "A"; 
	}
	
	//Another constructor
	public Point(double x, double y, String n)
	{
		/*if (a < 0){
			//throw new IllegalArgumentException("x value cannot be negative"); 
			x = 0; 
		}
		else*/
		this.x = x; 
			
		/*if (b < 0){
			//throw new IllegalArgumentException("x value cannot be negative"); 
			x = 0; 
		}
		else*/
		this.y = y; 
 
		name = n; 
	}
	
	//ACCESSOR METHODS ALLOW US TO READ PRIVATE FIELDS OUTSIDE OF CLASS THAT THEY ARE DEFINED IN. 
	public double getX(){
		return x; 
	}
	public double getY(){
		return y; 
	}
	//Modifier methods
	public void setX(double newX) 
	{
		this.x = newX; 
	}
	
	public void setY(double newY){
		this.y = newY;  
	}

	//Declare some useful method(s)	
	
	/**
	 * Calculates and returns this point's distance from the origin (0, 0)
	 * @return The distance from (0, 0) as a real number
	 */
	 public double distanceFromOrigin()
	 {
	 	return Math.sqrt((x * x) + (y * y)); 
	 }
	 
	 //STATIC METHOD
	 public static double distanceBetween(Point a, Point b)
	 {
	 	double n = (Math.pow(a.x - b.x, 2.0));
	 	double d = (Math.pow((a.y - b.y), 2.0));
	 	return Math.sqrt( n + d ); 
	 }
	 
	 //NON-STATIC METHOD
	 // Use X and and Y because those are the instance fields that the non-static method would be called on. 
	 public double distanceTo(Point a)
	 {
	 	return Math.sqrt((Math.pow((a.x - x), 2.0)) + (Math.pow((a.y - y), 2.0))); 
	 }
	 
	 //Overriding the toString method from parent class Object. Non-static because called with information from an instance
	 public String toString() {
	 	//Not necessary to use the keyword this but you still can. 
	 	return name + ": (" + x + ", " + y + ")"; 
	 }
}