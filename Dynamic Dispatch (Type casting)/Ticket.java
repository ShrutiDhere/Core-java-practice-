package Dynamic_dispatchMethod;

public class Ticket implements RailwaySystem {

	@Override
	public void station() {
		System.out.println(" Welcome to the Pimpri Railway Station ");
	}

	public void money() {
		System.out.println("The Passanger can paid money for Ticket ");
	}
}
