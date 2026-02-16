package Multiple_Inheritance;

public class HybridCar implements ElectricVehicle,FuelVehicle {

	@Override
	public void fillFuel() {
		System.out.println(" Fuel is less in FuelVehicle , please fill the fuel....!");
	}

	@Override
	public void chargeBettery() {
		System.out.println("Battery is low in ElectricVehicle , please charge the Battery ....!");
	}

}
