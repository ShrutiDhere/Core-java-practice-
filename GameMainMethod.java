package Method_Overriding;

public class GameMainMethod {

	public static void main(String[] args) {
		
		Cricket c=new Cricket();
		c.play();
		
		System.err.println("--------------------------------------");
		
		Football f=new Football();
		f.play();
	}
}
