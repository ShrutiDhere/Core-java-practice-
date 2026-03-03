package Constructor_Chaining;

public class Student {

	    int id;
	    String name;

	    // Non Parameterized constructor
	    Student() {
	        this(1);  // calling parameterized constructor
	        System.out.println("Default Constructor");
	        System.err.println("---------------------------------------------------");
	    }

	    // One parameter constructor
	    Student(int id) {
	        this(id, "Shruti"); // calling two parameter constructor
	        System.out.println("One Parameter Constructor");
	        System.out.println("ID: " + this.id);
	       System.err.println("--------------------------------------------------");
	    }

	    // Two parameter constructor
	    Student(int id, String name) {
	        this.id = id;
	        this.name = name;
	        System.out.println("Two Parameter Constructor");
	        System.out.println("ID: " + this.id);
	        System.out.println("Name: " + this.name);
	        System.err.println("--------------------------------------------------");
	    }
	    public static void main(String[] args) {
	        Student s = new Student();
	    }
	}

