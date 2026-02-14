package Interface;

public class WhatsupNotification implements Notification  {

	@Override
	public void sendMessage(String msg) {
		System.out.println("Whats'up :- " + msg );
		System.out.println("Update your Whatsup Application ");
		
	}
	
}
