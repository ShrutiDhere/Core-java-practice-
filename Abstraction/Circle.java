package Interface;

public class Circle implements Shape {
	
	double radius;
	double area;
	double perimeter;
	
	public Circle(double radius) {
		this.radius=radius;
	}
	

	@Override
	public double area() {
		 return area=3.14*radius*radius;
	}

	@Override
	public double perimeter() {
		return perimeter=2*3.14*radius;
		
	}

}
