
	package Multilevel_Inheritance;

	import java.util.Scanner;

	public class ProductMainMethod {

		public static void main(String[] args) {

			Scanner sc = new Scanner(System.in);

			System.out.println("Enter Product Name :- ");
			String product_Name = sc.nextLine();

			Scanner sc1 = new Scanner(System.in);
			System.out.println("Enter Price :- ");
			int Price = sc1.nextInt();

			Scanner sc2 = new Scanner(System.in);
			System.out.println("Enter Phone Model :- ");
			int PhoneModel = sc2.nextInt();

			// Parent class object
			ElectronicProduct EC = new ElectronicProduct();

			EC.product_Name = product_Name;
			EC.Price = Price;
			EC.PhoneModel = PhoneModel;

			EC.phone();
			EC.battery();

			System.out.println("---------------");

			// Child class object
			Mobile M = new Mobile();

			M.product_Name = product_Name;
			M.Price = Price;
			M.PhoneModel = PhoneModel;
			M.SIM = "Jio";   // example value

			M.phone();
			M.battery();
			M.videoCall();

			sc.close();
		}
		
	}
	
