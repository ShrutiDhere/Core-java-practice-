package Method_Overriding;

public class Student extends Person {

	int rollNo;
	
	@Override
	public void displayInfo() {
		System.out.println("The Name of a Student is :- " + Name );
		System.out.println("The Age of a Student is :- " + age );
		System.out.println("The city of a Student is :- " + city );
		System.out.println("The RollNumber of a Student is :- " + rollNo );
		
		
	}
}
