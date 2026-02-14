package Interface;

public class Car implements Vehicle  {

	@Override
	public void start() {
		System.out.println("Car is Started Now ");
		
	}

	@Override
	public void stop() {
		System.out.println("Car is Stop ");
		
	}

	
}
