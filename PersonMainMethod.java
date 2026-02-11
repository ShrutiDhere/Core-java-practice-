package Method_Overriding;

import java.util.Scanner;

public class PersonMainMethod {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Name :- ");
		String Name=sc.next();
		
		Scanner sc1=new Scanner(System.in);
		System.out.println("Enter age :- ");
		int age=sc1.nextInt();
		
		Scanner sc2=new Scanner(System.in);
		System.out.println("Enter City :- ");
		String city=sc2.next();
		
		Scanner sc3=new Scanner(System.in);
		System.out.println("Enter RollNumber:- ");
		int rollNo=sc3.nextInt();
		
		Student s=new Student();
		s.Name=Name;
		s.age=age;
		s.city=city;
		s.rollNo=rollNo;
		
		System.err.println("--------------------------------------");
		
		s.displayInfo();
		
		
		
	}
}
