package SingleInheritance;

import java.util.Scanner;

public class CarMainMethod {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Car Colour is :- ");
		String color=sc.next();
		
		Scanner sc1=new Scanner(System.in);
		System.out.println("Car Model  is :- ");
		int Model =sc1.nextInt();
		
		Scanner sc2=new Scanner(System.in);
		System.out.println("Car price is :- ");
		double price =sc2.nextDouble();
		
		Scanner sc3=new Scanner(System.in);
		System.out.println(" The MaxSpeed Of BMW  is :- ");
		int maxSpeed=sc3.nextInt();
		
		
		
		
		BMW B=new BMW();

		B.color=color;
		B.Model=Model;
		B.Price=price;
		B.maxSpeed=maxSpeed;
		
		B.Engine();
		B.Sterring();
		B.display();
		B.autoPark();
		
		
		
		
		
		
	}
}
