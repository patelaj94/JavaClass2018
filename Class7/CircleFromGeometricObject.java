package Class7;

public class CircleFromGeometricObject extends GeometricObject {

	private double radius;
	
	// I've created a constructor to make a circle by defining all the parameters how i want
	public CircleFromGeometricObject(String color, boolean isFilled, int numberOfEdges, double radius) {
		super(color, isFilled, numberOfEdges);
		this.radius = radius;
	}
	
	// This constructor will define only radius, ill let the super class define the rest.
	public CircleFromGeometricObject(double radius) {
		this.radius = radius;
	}

	public double getRadius() {
		return radius;
	}
	
	public void setRadius(double radius) {
		this.radius = radius;
	}
	
	public double getArea() {
		return radius * radius * Math.PI;
	}
	
	public double getPerimeter() { 
		return 2 * radius * Math.PI; 
	}
	
	public void printCircle() {
		System.out.println("The circle is created and the radius is " + radius);
	}
}
