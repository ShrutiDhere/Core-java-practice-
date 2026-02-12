// Program 1 :- Print Student Name on the console 

package constructor;

public class Student {

	Student(){
		System.out.println(" I Am Student Of The Kiran Kiran Academy ");
	}
	public void Name(String name) {
		System.out.println(" My Name Is = " + name);
	}
	
	
	public static void main(String[] args) {
		Student s=new Student();
		s.Name("Shruti");
	}
}

