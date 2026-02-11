package Multilevel_Inheritance;

import java.util.Scanner;

public class GrandFatherMainMethod {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Sir Name :- ");
		String Sirname=sc.next();
		
		Scanner sc1=new Scanner(System.in);
		System.out.println("Enter the Village Name :- ");
		String Village=sc1.nextLine();
		
		Son s=new Son();
		s.Sirname=Sirname;
		s.Village=Village;
		
		
		System.out.println("The Sirname is :- " + Sirname);
		
		System.err.println("------------------------------------");
		
		System.out.println("The Village Name  is :- " + Village);
		
		System.err.println("------------------------------------");
		
		s.House();
		s.Flat();
		s.Car();
		
	}
	
	
	
}
