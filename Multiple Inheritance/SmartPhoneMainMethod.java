//Question 1 :-     * Smart Phone Example *
//Create two interfaces:
//Camera â†’ method takePhoto()
//MusicPlayer â†’ method playMusic()
//Create a class SmartPhone that implements both interfaces 
//and demonstrate multiple inheritance.


package Multiple_Inheritance;

public class SmartPhoneMainMethod {

	public static void main(String[] args) {
		
		System.err.println(" * About SmartPhone * ");
		
		Camera c;
		c=new SmartPhone();
		c.takephoto();
		
		MusicPlayer m;
		m=new SmartPhone();
		m.playMusic();
	}
}
