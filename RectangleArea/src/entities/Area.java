package entities;

public class Area {
	public double Width;
	public double Height;
	
	public double totalArea() {
		return Width * Height;
	}
	
	public double Perimeter() {
		return (Width * 2) + (Height * 2);
	}
	
	public double Diagonal() {
		return Math.sqrt((Width * Width) + (Height * Height));
	}
	
	public String toString () {
		return "Area: " + String.format("%.2f%n", totalArea()) 
			+ "Perimeter: " + String.format("%.2f%n", Perimeter()) 
			+ "Diagonal: " + String.format("%.2f%n", Diagonal());
	}
}
