package Class7;

public class GeometricObject {

	private String color = "white";
	private boolean isFilled = false;
	private int numberOfEdges = 4;
	
	public GeometricObject() {
		
	}
	public GeometricObject(String color, boolean isFilled, int numberOfEdges) {
		this.color = color;
		this.isFilled = isFilled;
		this.numberOfEdges = numberOfEdges;
	}
	
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public boolean isFilled() {
		return isFilled;
	}
	public void setFilled(boolean isFilled) {
		this.isFilled = isFilled;
	}
	public int getNumberOfEdges() {
		return numberOfEdges;
	}
	public void setNumberOfEdges(int numberOfEdges) {
		this.numberOfEdges = numberOfEdges;
	}

}
