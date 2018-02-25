package Class7;

public class RectangleFromGeometricObject extends GeometricObject {

	private double width;
	private double height;
	
	// I've created a constructor to make a rectangle by definig all the values for each parameter
	public RectangleFromGeometricObject(String color, boolean isFilled, int numberOfEdges, double width,
			double height) {
		super(color, isFilled, numberOfEdges);
		this.width = width;
		this.height = height;
	}
	
	// I've created a constructor, which says just let me define the height and width. Take the rest from superclass
	public RectangleFromGeometricObject(double height, double width) {
		this.height = height;
		this.width = width;
	}
	
	/** Return width */
	public double getWidth() {
		return width;
	}
	/** Set a new width */
	public void setWidth(double width) { 
		this.width = width;
	}

	/** Return height */
	public double getHeight() { 
		return height;
	}
	
	/** Set a new height */
	public void setHeight(double height) { 
		this.height = height;
	}
	/** Return area */
	public double getArea() { 
		return width * height;
	}
	/** Return perimeter */
	public double getPerimeter() { 
		return 2 * (width + height);
	}
	
	

}
