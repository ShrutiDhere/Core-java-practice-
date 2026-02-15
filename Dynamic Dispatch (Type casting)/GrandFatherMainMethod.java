package Dynamic_dispatchMethod;

public class GrandFatherMainMethod {

	public static void main(String[] args) {
		
		System.out.println(" * About Generation *  ");
		
		System.err.println("---------------------------------------");
		
		GrandFather g;	
		
		System.out.println(" * About Father of Son & Child of Grandfather * ");
		
		g=new Father();
		
		g.property();
		g.House();
		((Father) g).car();           //DownCasting (Typecasting used)
		
		
		System.err.println("-----------------------------------------");
		System.out.println(" * About Child of Father , ie - Son * ");
		
		g=new Son();
		
		g.property();
		g.House();
		((Son)g).Job();
	}
}
