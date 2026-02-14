package Interface;

public class ShapeMainMethod {

	public static void main(String[] args) {
		
		Circle c=new Circle(2);
		System.out.println("Area Of circle is = " + c.area());
		System.out.println("Perimeter Of Rectangle is = " + c.perimeter());
		
		
		Rectangle R=new Rectangle(3,7);
		System.out.println("Area Of Rectangle is = " + R.area());;
		System.out.println("Perimeter Of Rectangle is = " + R.perimeter());
				
	}
	
}
