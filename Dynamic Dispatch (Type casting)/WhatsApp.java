package Dynamic_dispatchMethod;

public class WhatsApp implements Meta {

	@Override
	public void Register() {
		System.out.println("Register your Account in WhatsApp ");
	}

	@Override
	public void Login() {
		System.out.println("Login your Account in WhatsApp ");
	}

	@Override
	public void Logout() {
		System.out.println("Logout your Account in WhatsApp ");
		
	}
	
	public void profile() {
		System.out.println("Update your Prfile in WhatsApp");
	}

	
}
