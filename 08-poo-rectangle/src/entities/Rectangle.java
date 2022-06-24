package entities;

public class Rectangle {
	
	public double height;
	public double base;
	
	
	public double area() {
		return height * base;
	}
	
	public double perimeter() {
		return 2*(height + base);
	}
	
	public double diagonal() {
		return Math.sqrt((Math.pow(base, 2)) + (Math.pow(height, 2)));
	}
	
	public String toString() {
		return "Height: " +
				height +
				"\nBase: " +
				base +
				"\nPerimeter: " +
				String.format("%.2f", perimeter()) +
				"\nArea: " +
				String.format("%.2f", area()) +
				"\nDiagonal: " +
				String.format("%.2f", diagonal());
	}

}
