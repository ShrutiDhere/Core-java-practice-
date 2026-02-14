package Interface;

public class Rectangle implements Shape {
    double area;
    double perimeter;
    
	float Length;
	float Width;
	
	public Rectangle(float Length, float Width ) {
		this.Length=Length;
		this.Width=Width;
		
	}

	@Override
	public double area() {
		return area=Length*Width;
	}

	@Override
	public double perimeter() {
		return perimeter=2*(Length+Width);
		
	}
}
