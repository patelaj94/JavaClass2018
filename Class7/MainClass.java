package Class7;

public class MainClass {

	public static void main(String[] args) {
		
		// Let's now create some instances of our geometric object. 
		
		// 1. I want to make a circle by defining all of it's parameter
		// I defined the color, isFilled, the number of edges (of course its 0), and the radius.
		CircleFromGeometricObject circle1 = new CircleFromGeometricObject("yellow", true, 0, 5.0);
		// Now ill do some actions on the circle. 
		System.out.println("The color of my circle is " + circle1.getColor());
		System.out.println("The edges on my circle are " + circle1.getNumberOfEdges());
		System.out.println("The area of my circle is " + circle1.getArea());
		System.out.println("The perimeter of my circle is " + circle1.getPerimeter());
		
		// 2. This time, I only want to define the radius.
		// Can you guess where the rest of the values will come from? That's right the super class (GeometricObject)
		CircleFromGeometricObject circle2 = new CircleFromGeometricObject(5.0);
		// Ill do the same actions before. Notice anything odd about this circle? Why is that?
		System.out.println("The color of my circle is " + circle2.getColor());
		System.out.println("The edges on my circle are " + circle2.getNumberOfEdges());
		System.out.println("The area of my circle is " + circle2.getArea());
		System.out.println("The perimeter of my circle is " + circle2.getPerimeter());
		
		
		
		// Now you try it, create two instances of a rectangle. One where you define everything
		// another where you define only the length and width, the rest will be picked up from the superclass
		
		
		
		
		
		
		
		
		
		// 3. Rectangle with color blue, not filled, edges 4, length 5, width 5
		RectangleFromGeometricObject rectangle1 = new RectangleFromGeometricObject("Blue", false, 
				4, 5, 5);
		System.out.println("The color of my rectangle is " + rectangle1.getColor());
		System.out.println("The edges on my rectangle are " + rectangle1.getNumberOfEdges());
		System.out.println("The area of my rectangle is " + rectangle1.getArea());
		System.out.println("The perimeter of my rectangle is " + rectangle1.getPerimeter());
		// 4. Rectangle with length 5, width 6 - the rest will be default
		RectangleFromGeometricObject rectangle2 = new RectangleFromGeometricObject(5, 6);
		System.out.println("The color of my rectangle is " + rectangle2.getColor());
		System.out.println("The edges on my rectangle are " + rectangle2.getNumberOfEdges());
		System.out.println("The area of my rectangle is " + rectangle2.getArea());
		System.out.println("The perimeter of my rectangle is " + rectangle2.getPerimeter());
	}

}
