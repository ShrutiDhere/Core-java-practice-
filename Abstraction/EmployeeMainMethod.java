package Interface;

public class EmployeeMainMethod {

	public static void main(String[] args) {
		
		System.err.println(" Employee Details about salary ");
		
		PartTimeEmployee Part=new PartTimeEmployee();
		Part.calculateSalary();
		
		System.err.println("-----------------------------------------");
		
		FullTimeEmployee full=new FullTimeEmployee();
		full.calculateSalary();
		
	}
}
