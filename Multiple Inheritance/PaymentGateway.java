package Multiple_Inheritance;

public class PaymentGateway implements UpiPayment, CardPayment {

	@Override
	public void payUsingUPI() {
		System.out.println(" You can pay using UPI Also.......... ! ");
	}
	@Override
	public void PayUsingCard() {
		System.out.println(" You can Pay USing Card Also..........!");
	}
	
}
