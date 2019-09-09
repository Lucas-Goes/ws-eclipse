package entities;

public class Rectangle {

	public double height;
	public double width;
	
	public double totalArea() {
		
		return height * width;
	}

	public double totalPerimeter() {
		
		return 2 * (height + width);
	}

	public double totalDiagonal() {
		double x = Math.pow(height, 2) + Math.pow(width, 2);
		return Math.sqrt(x);
	}
	

}
