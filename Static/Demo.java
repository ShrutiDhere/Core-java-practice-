package Static_Keyword;

public class Demo {

	    // Static variable
	    static int a = 10;

	    // Instance variable
	    int b = 20;

	    // Static block
	    static {
	        System.out.println("Static Block");
	    }

	    // Non-static block (Instance block)
	    {
	        System.out.println("Non-Static Block");
	    }

	    // Constructor
	    Demo() {
	        System.out.println("Constructor");
	    }

	    // Static method
	    static void staticMethod() {
	        System.out.println("Static Method");
	    }

	    // Instance method
	    void instanceMethod() {
	        System.out.println("Instance Method");
	    }
	}


	