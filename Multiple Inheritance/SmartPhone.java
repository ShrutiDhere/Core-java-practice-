package Multiple_Inheritance;

public class SmartPhone implements Camera,MusicPlayer {

	@Override
	public void playMusic() {
		System.out.println(" Play The Music Please..........! ");
		
	}

	@Override
	public void takephoto() {
		System.out.println(" Now Ready To take photo.........! ");
		
	}

	
}
