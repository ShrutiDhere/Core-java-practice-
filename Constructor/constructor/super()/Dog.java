package Constructor_Chaining;

	class Dog extends Animal {

	    String breed;

	    // Child constructor
	    Dog(String type, String breed) {
	        super(type);   // Calling Parent constructor
	        this.breed = breed;
	        System.out.println("Dog Breed: " + breed);
	    }
	}

