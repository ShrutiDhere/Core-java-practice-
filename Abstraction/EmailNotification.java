package Interface;

public class EmailNotification implements Notification  {

	@Override
	public void sendMessage(String msg) {
		System.out.println("Email :- " + msg );
		System.out.println( " Check your Inbox , You have got new mail");
		
		
	}
}
