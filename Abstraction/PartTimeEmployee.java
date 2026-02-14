package Interface;

public class PartTimeEmployee implements Employee {

	@Override
	public void calculateSalary() {
		System.out.println("The Salary of PartTime Employee is 25,000 Rs Per Month ");
	}
	
}
