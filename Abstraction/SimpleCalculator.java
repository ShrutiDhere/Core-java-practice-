package Interface;

public class SimpleCalculator implements Calculator {

	@Override
	public void add() {
		System.out.println("Addition of " + a + " & " +  b + "=" + (a+b));
	}

	@Override
	public void subtract() {
		System.out.println("Subtraction of " + a + " & " + b + "=" + (a-b));
		
	}

	@Override
	public void multiply() {
		System.out.println("Multiplication of " + a + " & " + b + "=" + (a*b));
		
	}

	@Override
	public void divide() {
		System.out.println("Quotient of " + a + " & " + b + "=" + (a/b));
		
	}

}
