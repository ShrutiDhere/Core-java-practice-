package Dynamic_dispatchMethod;

public class Father implements GrandFather {

	@Override
	public void property() {
		System.out.println("Father total property is 2 crocre");
	}
	
	@Override
	public void House() {
		System.out.println("Father buys the new House");
		
	}
		public void car() {
	        System.out.println("Father buys new car");
	    }
	}

