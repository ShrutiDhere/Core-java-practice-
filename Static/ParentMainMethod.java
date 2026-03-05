package Static_Keyword;

public class ParentMainMethod {


	    public static void main(String[] args) {

	        System.out.println("Main Method Started");

	        // Calling static method
	        Demo.staticMethod();

	        // Creating object
	        Demo obj = new Demo();

	        // Calling instance method
	        obj.instanceMethod();
	        

	        System.out.println("Main Method Ended");
	    }
	}
	
