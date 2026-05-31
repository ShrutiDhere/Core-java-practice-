

public class Swapping {

	public static void main(String[] args) {

		int a = 20;
		int b = 50;

		System.out.println("The Number Before the Swapping are :");
		System.out.println("a = " + a);
		System.out.println("b = " + b);

		a = (a + b) - (b = a);

		System.out.println("\n The Number After the  Swapping are :");
		System.out.println("a = " + a);
		System.out.println("b = " + b);
	}
}
