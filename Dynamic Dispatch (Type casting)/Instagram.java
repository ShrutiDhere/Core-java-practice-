package Dynamic_dispatchMethod;

public class Instagram implements Meta {

	@Override
	public void Register() {
		System.out.println("Register your new Account in Instagram");
	}
	
	@Override
	public void Login() {
		System.out.println("Log in to your old Account in Instagram ");
	}
	
	@Override
	public void Logout() {
		System.out.println("Logout your Account in Instagram ");
	}
	
	public void uploadReels() {
		System.out.println("upload Your Reels on instagram");
	}
	
	public void story() {
		System.out.println("Sent a new story in Instagram");
	}
}
