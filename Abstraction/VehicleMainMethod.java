package Interface;

public class VehicleMainMethod {

	public static void main(String[] args) {
		
		System.out.println("About Car Vehicle -> ");
		
		Car c= new Car();
		c.start();
		c.stop();
		
		System.err.println("---------------------------------------");
		
		System.out.println("About Bike Veicle -> ");
		
		Bike b=new Bike();
		b.start();
		b.stop();
	}
}
