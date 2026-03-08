package ExeHandling;

public class DivideBy0 {

	public static void main(String[] args) {
		
		try {
			System.out.println(4 / 0); // stop
		} catch (ArithmeticException e) {
			System.out.println("Divide by zero Not Allowed ... !");
		} finally {
			System.out.println("i am in finally blocked : always Executable ... !");
		}
	}
}

