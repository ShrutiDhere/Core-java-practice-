package Dynamic_dispatchMethod;

public class Son implements GrandFather  {

	@Override
	public void property() {
		System.out.println("Total property of Son is 3 crore ");
		
	}

	@Override
	public void House() {
		System.out.println("The son lives in father House ");
		
	}
	
	public void Job() {
		System.out.println("The son works in IT company ");
	}

	
}
