package Interface;

public class NotificationMainMethod {

	public static void main(String[] args) {
		
		System.out.println("                      * Notifications are :- * ");
		
		EmailNotification email=new EmailNotification();
		email.sendMessage("1 new notification from Gmail ");
		
		System.err.println("---------------------------------------------------");
		
		WhatsupNotification wp=new WhatsupNotification();
		wp.sendMessage("1 new Notication from whatsup");
	}
}
