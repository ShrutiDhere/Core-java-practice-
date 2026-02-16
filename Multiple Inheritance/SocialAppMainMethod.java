// Question 5:-   * Social Media Application *
//Create two interfaces:
//ReelsFeature â†’ method uploadReel()
//ChatFeature â†’ method sendMessage()
//Create a class SocialApp that implements both interfaces.


package Multiple_Inheritance;

public class SocialAppMainMethod {
	
    public static void main(String[] args) {
		
    	System.err.println(" * Social Media Application Started * ");
    	
    	System.out.println("--------------------------------------------");
    	
    	System.err.println(" * About Reels Feature * ");
    	
    	ReelsFeature reel;
    	reel=new SocialApp();
    	reel.uploadReel();
    	
    	System.out.println("-------------------------------------------");
    	
    	System.err.println(" * About Chat Feature * ");
    	
    	ChatFeature chat;
    	chat=new SocialApp();
    	chat.sendMessage();
    	
    	
    	
	}
}
