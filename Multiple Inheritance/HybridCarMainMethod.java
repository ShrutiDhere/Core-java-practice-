//Question 3:-   * Vehicle Features *
//Create two interfaces:
//ElectricVehicle â†’ method chargeBattery()
//FuelVehicle â†’ method fillFuel()
//Create a class HybridCar that implements both interfaces.

package Multiple_Inheritance;

public class HybridCarMainMethod {

	public static void main(String[] args) {
		
		System.err.println(" * Information About Vehicles * ");
		
		System.out.println("------------------------------------------");
		
		System.err.println(" * About Electric Vehicle * ");
		ElectricVehicle e;
		e=new HybridCar();
		e.chargeBettery();
		
		System.out.println("------------------------------------------");
		
		System.err.println(" * About Fuel Vehicle * ");
		FuelVehicle f;
		f=new HybridCar();
		f.fillFuel();
	}
}
