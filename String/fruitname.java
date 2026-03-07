//question 4:-WAP to accept fruit name from the user and check fruit is valid or not
//Note :-valid fruit is the one who has p or m in its name.

package string;
import java.util.Scanner;
public class fruitname {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter fruit Name");
	String Fruitname=sc.nextLine();
	
    if(Fruitname.contains("p") || Fruitname.contains("m"))
    {
		System.out.println("Valid fruit name");
    }
	 	else 
	 	{
	System.out.println("Not Valid fruit name");
	 	}
}
}

