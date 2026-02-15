package Dynamic_dispatchMethod;

public class FaceBook implements Meta {

	@Override
	public void Register() {
		System.out.println("Register your Account in Facebook ");
		
	}

	@Override
	public void Login() {
		System.out.println("Login your Account in Facebook ");
		
	}

	@Override
	public void Logout() {
		System.out.println("Logout your Account in facebook ");
		
	}
	
	public void addPost() {
		System.out.println(" Add Your new Post in Facebook ");
	}

}
