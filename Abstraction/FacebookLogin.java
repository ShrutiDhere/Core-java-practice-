package AbstractClass;

public class FacebookLogin implements Login {

	@Override
	public void authenticate() {
		System.out.println("The Facebook login is Authenticated");

	}
}
