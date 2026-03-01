package AbstractClass;

public class LoginMainMethod {

	
	public static void main(String[] args) {
		
		Login l;
		
		l=new GoogleLogin();
		l.authenticate();
		
		l=new FacebookLogin();
		l.authenticate();
		
		((Login)l).authenticate();
	}
}
