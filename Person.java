//Question 3:- Create a class Person with method displayInfo().
//             Override it in Student class to add roll number.

package Method_Overriding;

public class Person {
      
	String Name;
	int age;
	String city;
	
	public void displayInfo () {
		System.out.println("The Name of a person is :- " + Name );
		System.out.println("The Age of a person is :- " + age );
		System.out.println("The city of a person is :- " + city );
		
	}
	
}
