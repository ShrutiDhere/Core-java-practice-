//Question 1:-WAP to accept name of the user and count the number of characters in it.


package string;
import java.util.Scanner;

public class count_noof_characters {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the user name");
	String username=sc.nextLine();
	System.out.println(username.length());
}
}
