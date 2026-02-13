package Method_Overriding;

public class CourseMainMethod {

	public static void main(String[] args) {
		
		OfflineCourse off=new OfflineCourse();
		off.duration();
		
		System.err.println("----------------------------------------");
		
		OnlineCourse on=new OnlineCourse();
		on.duration();
	}
	
}
