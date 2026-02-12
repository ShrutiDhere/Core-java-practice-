//program 5:-print Book Name & Book price  using parameterized constructor

package constructor;

public class Book {

	Book(){
		System.out.println("The Book Detail :- ");
	}
	public void Details(String Name,int price) {
		System.out.println( "Book Name = " + Name + " & Book Price  = " + price );
	}
	
	public static void main(String[] args) {
		Book B =new Book();
		B.Details("Ramayan", 500);
	}
}
