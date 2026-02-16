//Question 4 :- * Employee Roles *
//Create two interfaces:
//Trainer â†’ method teach()
//Developer â†’ method developProject()
//Create a class TechLead that implements both interfaces.

package Multiple_Inheritance;

public class TechLeadMainMethod {
	
 public static void main(String[] args) {
	 
	 System.err.println("* Information About Employee * ");
	 
	 System.out.println("--------------------------------------------");
	 
	 System.err.println(" * About The Trainer * ");
	 
	 Trainer t;
	 t=new TechLead();
	 t.teach();
	 
	 System.out.println("----------------------------------------------");
	
	 System.err.println(" * About The Developer * ");
	 
	Developer d;
	d=new TechLead();
	d.developProject();
	
}
}
