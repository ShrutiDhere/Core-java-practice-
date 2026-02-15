package Dynamic_dispatchMethod;

public class MetaMainMethod {

	public static void main(String[] args) {
		
		System.err.println("Application is Started ");
		
		System.out.println("************************************************");
		
		Meta m;
		
		m=new Instagram();
		System.err.println(" * Instagram Application is Open * ");
		m.Register();
		m.Login();
		((Instagram) m).story();         //TypeCasting used (DownCasting)
		((Instagram) m).uploadReels();   //Type Casting used(DownCasting)
		m.Logout();
		
		System.out.println("*********************************************");
		
		
		m=new WhatsApp();
		System.err.println(" * WhatsApp Application is Open * ");
		m.Register();
		m.Login();        
		((WhatsApp) m).profile();     //TypeCasting used(DownCasting)
		m.Logout();
		
		System.out.println("*******************************************");
		
		m=new FaceBook();
		System.err.println(" * FaceBook Application is Started * ");
		m.Register();
		m.Login();       
		((FaceBook) m).addPost();        //TypeCasting used(DownCasting)
		m.Logout();
		
		
	}
}
