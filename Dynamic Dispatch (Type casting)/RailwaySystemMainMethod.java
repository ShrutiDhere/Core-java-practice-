package Dynamic_dispatchMethod;

public class RailwaySystemMainMethod {

	public static void main(String[] args) {
		
		System.out.println(" * Information About Railway System * ");
		System.err.println("------------------------------------------");
		
		RailwaySystem r;
		r=new Passanger();
		
		System.out.println(" * About Passanger Information * ");
		
		r.station();
		((Passanger)r).seat();
		
		System.err.println("------------------------------------------");
		
		System.out.println(" * About Ticket Information * ");
		r=new Ticket();
		
		r.station();
		((Ticket)r).money();
		
		System.err.println("------------------------------------------");
		
		System.out.println(" * About Train Information * ");
		r=new Train();
		
         r.station();
         ((Train)r).time();
     	System.err.println("------------------------------------------");
		
		
		
	}
}
