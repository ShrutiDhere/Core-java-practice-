//program 3 :- AAddition of Two Number 

package constructor;

public class Addition {
   Addition(){
	   System.out.println("Addition of two number " );
   }
   public void Answer(int a,int b) {
	   System.out.println(a + " & " +  b + " = " + (a+b));
	   
   }


 public static void main(String[] args) {
	 Addition A = new Addition();
	 A.Answer(3, 8);
 }
}
