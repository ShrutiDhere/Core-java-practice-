package ExeHandling;

public class Exception {

	    public static void main(String[] args) {

	        int arr[] = {10,20,30};

	        try {
	            System.out.println(arr[5]);   // risky code
	        }

	        catch(ArrayIndexOutOfBoundsException e) {
	            System.out.println("Array index is invalid");
	        }

	        finally {
	            System.out.println("Finally block always executes");
	        }

	        System.out.println("Program continues");
	    }
	}

