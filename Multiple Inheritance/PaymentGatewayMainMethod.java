//Question 2 :-  * Online Payment System *
//Create two interfaces:
//UPIPayment â†’ method payUsingUPI()
//CardPayment â†’ method payUsingCard()
//Create a class PaymentGateway that implements both interfaces.

package Multiple_Inheritance;

public class PaymentGatewayMainMethod {

	public static void main(String[] args) {
		
		System.err.println(" * Details About Payment Options *  ");
		
		System.out.println(" * Option 1 * ");
		
		UpiPayment upi;
		upi=new PaymentGateway();
		upi.payUsingUPI();
		
		System.err.println("--------------------------------------------");
		
		System.out.println(" * Option 2 * ");
		CardPayment card;
		card=new PaymentGateway();
		card.PayUsingCard();
		
		
		
	}
}
