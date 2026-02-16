package Multiple_Inheritance;

public class SocialApp implements ReelsFeature , ChatFeature {

	@Override
	public void sendMessage() {
		System.out.println("In Chat Feature You Can Easily Send Message To Anyone ");
		
	}

	@Override
	public void uploadReel() {
		System.out.println("In Reels Feature You Can Upload Your New Reels ");
	}

}
