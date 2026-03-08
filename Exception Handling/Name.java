package ExeHandling;

import java.util.Scanner;

public class Name {

	    public static void main(String[] args) {

	        Scanner sc = new Scanner(System.in);

	        System.out.println("Enter the Name");
	        String name = sc.nextLine();

	        System.out.println("Enter the number");
	        int num = sc.nextInt();

	        try {
	            System.out.println(name.charAt(num));
	        }

	        catch (StringIndexOutOfBoundsException e) {
	            System.out.println("Index out of bound");
	        }

	        finally {
	            System.out.println("Program finished");
	        }

	        sc.close();
	    }
	}

