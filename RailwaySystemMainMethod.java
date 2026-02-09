package Hierarchical_Inheritance;

public class RailwaySystemMainMethod {

	public static void main(String[] args ) {
		Passanger P = new Passanger();
		P.Stairs();
		P.seat();
		
	System.err.println("-----------------------------------");
		
		Ticket T = new Ticket();
		T.Stairs();
		T.Paid();
		
		System.err.println("--------------------------------");
		
		Train T1 = new Train();
		T1.Stairs();
		T1.Timing();
		
		System.err.println("----------------------------------");
		
		
		
	}
}

