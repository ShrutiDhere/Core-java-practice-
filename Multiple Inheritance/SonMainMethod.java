package Multiple_Inheritance;

public class SonMainMethod {

	public static void main(String[] args) {
		
		Father f;
		f=new Son();
		f.cooking();
		
		Mother m;
		m=new Son();
		m.cooking();
	}
}
