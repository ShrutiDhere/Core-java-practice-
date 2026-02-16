package Multiple_Inheritance;

public class TechLead implements Trainer,Developer {

	@Override
	public void developProject() {
		System.out.println("The Employess Are Develop A project on Real Time Data.....!");
		
	}

	@Override
	public void teach() {
		System.out.println("The trainer Always Guide the Employees & teach new Things.....!");
	}

	
	
}
