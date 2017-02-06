/**
 * This class uses the Point, LineSegment, and Circle classes to calculate certain properties of these geometric shapes/entities
 * @author Drew Beckmen
 * @version 0.1
 */
public class PointRunner
{
	/**
	 * Creates instances of Point, LineSegment, and Circle classes and uses methods within the classes to perform computations
	 * @param args Command line input
	 */
	public static void main(String[] args)
	{
		//Making two Points 
		Point x = new Point(1, 2); 
		Point y = new Point(5, 3, "Y"); 	
		//Use overridden toString
		System.out.println("Point: " + x); 	
		System.out.println("Point: " + y); 	
		//Calling some Point methods
		System.out.println("Distance between " + x.name + " and " + y.name + ". Static version."); 
		System.out.println(Point.distanceBetween(x, y)); //Static, so call by the class. p and q are type Point. 
		System.out.println("Distance between " + x.name + " and " + y.name + ". Non-static version.");  
		System.out.println(x.distanceTo(y)); 
		System.out.println("Distance from " + x + " to origin is: " + x.distanceFromOrigin()); //Instance method (not static
		
		System.out.println();
		
		
		
		//Making a line segment by constructing two points
		Point p = new Point(3, 4, "P"); //Call constructor to create instance of the Point class
		//p.x = 15;  - Will not work if x is private. If private, must use an accessor method
		Point q = new Point(5, 1, "Q"); 
		LineSegment l = new LineSegment(p, q); //You need two Points in order to create instance of LineSegment class
		System.out.println("Segment " + l.name() + " is from: " + l + ". The length is: " + l.length()); //Automatically calls toString
		System.out.println("Number of segments is: " + LineSegment.getNumSegments()); 
		
		System.out.println(); 
		
		
		
		//Making a circle by creating a point and a radius
		Point o = new Point(); 
		double r = 3.0; 
		Circle a = new Circle(o, 3.0); 
		System.out.println("Circle " + a); 
		System.out.println("The diameter of the circle is: " + a.diameter()); 
		System.out.println("The circumference: " + a.circumference() + ". Area: " + a.area()); 
		
		System.out.println(); 
		
		
		//Making a circle by creating a center and point on outside (radius calculated within Circle class) 
		Point b = new Point(2, 1, "O"); 
		Point c = new Point(3, 3, "C");  
		Circle d = new Circle(b, c); 
		System.out.println("Circle " + d); 
		System.out.println("The diameter of the circle is: " + d.diameter()); 
		System.out.println("The circumference: " + d.circumference() + ". Area: " + d.area()); 
		
		System.out.println(); 
		
		//Make a rectangle
		Rectangle xx = new Rectangle(2.0, 3.0); 
		System.out.println(xx); 
		xx.setWidth(5.0); 
		System.out.println("Length of diagonal is: " + xx.diagonal()); 
		System.out.println("Perimeter: " + xx.perimeter() + ". Area: " + xx.area()); 
		
		System.out.println(); 
		
		Square ss = new Square(5); 
		System.out.println(ss); 
		ss.setSide(2); 
		System.out.println("Perimeter: " + ss.perimeter() + ". Area: " + ss.area()); 

	}
}