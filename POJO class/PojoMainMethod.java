
public class PojoMainMethod {

	public static void main(String[] args) {
		
		Employee e=new Employee();
		
		System.err.println("The Employee Details are :- ");
		
		e.setEmpId(1);
		e.setName("Shruti");
		e.setSalary(50000);
		e.setCity("Pune");
		
		System.out.println("The Employee Id is = " + e.getEmpId());
		System.out.println("The Employee Name  is = " + e.getName());
		System.out.println("The Employee Salary is = " + e.getSalary());
		System.out.println("The Employee City is = " + e.getCity());
		
		
		
	}
}
