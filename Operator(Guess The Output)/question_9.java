//9. int a = 10, b = 5, c; c = a++ + --b + a * b; System.out.println(c);

package Guess_The_Output;

public class question_9 {
     public static void main(String[] args) {
    	 int a = 10;
    	 int b = 5;
    	 int c; 
    	 c = (a++ + --b) + (a * b); 
    	 System.out.println(c);           // 58
	}
}
