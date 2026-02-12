// program 2 :- Attendence of Employee
package constructor;

public class Employee {
	  Employee(){
		  System.out.println(" Welcome to the office ");
	  }
	  public void Attendence(int id) {
		  System.out.println("Employee id " + id + " is Present ");
	  }


   public static void main(String[] args) {
	   Employee e = new Employee();
	   e.Attendence(2);
   }
}
