/**
 * This class contains all of the fields necessary to define a circle and many helpful computational/formatting methods
 * @author Drew Beckmen
 * @version 0.1
 */
public class Circle
{
	//Instance fields - unique to each circle. Since private, must also make accessor methods
	private Point center; 
	private double radius; 
	
	//Constructors 
	public Circle() //Default 
	{
		this.center = new Point(); //Calling default Point constructor
		this.radius = 0; 
	}
	
	public Circle(Point center)
	{
		this.center = center; //Use this keyword to distinguish between formal parameter and instance field
		this.radius = 0; 
	}
	
	public Circle(Point center, double radius)
	{
		this.center = center; 
		this.radius = radius; 
	}
	
	public Circle(double radius)
	{
		this.center = new Point(); 
		this.radius = radius; 
	}
	
	public Circle(Point center, Point onCircle) //Use distance between center and onCircle to calculate radius
	{
		this.center = center; 
		//Going to use distanceTo from Point class
		this.radius = center.distanceTo(onCircle); 
	}
	
	
	//Accessors (Not really going to use them because can just use overriden toString method
	
	/**
	 * Accessor method (non-static) that returns the centerpoint of Circle. Must use since Point center is private field
	 * @return the center of data type Point
	 */
	public Point getCenter()
	{
		return center; 
	}
	
	/**
	 * Accessor method (non-static) that returns the radius of Circle. Must use since radius is private field
	 * @return the length of the radius of the Circle
	 */
	public double getRadius()
	{
		return radius; 
	}
	
	
	
	//Helpful Methods
	
	/**
	 * Non-static method that calculates the diameter of a circle according to the radius (multiplied by 2)
	 * @return the diameter of circle (a double)
	 */ 
	public double diameter()
	{
		return radius * 2; 
	}
	
	/**
	 * Non-static method that calculates the circumference of a circle according to the radius (2 * PI * radius)
	 * @return the radius of the circle (a double)
	 */
	public double circumference()
	{
		return 2 * radius * Math.PI; 
	}
	
	/**
	 * Non-static method that calculates the area of a circle according to radius ((PI * radius)^2)
	 * @return the area of Circle (a double)
	 */
	public double area()
	{
		return Math.pow((Math.PI * radius), 2); 
	}	
	
	/**
	 * Overriding the toString method from parent class Object.
	 * "Magic" method - automatically called when a Runner file prints the instance of the circle
	 * @return The string that contains the name, center point, and radius of the Circle instance
	 */
	public String toString()
	{
		return center.name + " has a center (" + center.getX() + ", " + center.getY() + ") and a radius of length " + radius + "."; 
	}
}