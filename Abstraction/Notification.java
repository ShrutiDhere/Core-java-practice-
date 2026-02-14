//                * Notification System *
//             Create interface Notification:
//             sendMessage(String msg)
//             Implement:- 1) EmailNotification
//                         2)SMSNotification
//                         3)WhatsAppNotification


package Interface;

public interface Notification {

	public abstract void sendMessage(String msg);
	
	

}

