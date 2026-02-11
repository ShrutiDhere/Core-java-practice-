package Method_Overriding;

public class Car extends Vehicle {

	@Override 
	public void start() {
		System.out.println("The Car is Started with key ");
	}
}
