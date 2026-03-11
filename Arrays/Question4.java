// Question 4 :- Write a program to find the sum of all elements in a 1D array.


package One_D_Array;

public class Question4 {

	public static void main(String[] args) {
		
		int num[]= {3,7,8,2,9,6};
		int sum=0;
	
		
		for(int i=0;i<num.length;i++) {
			sum=sum+i;
			System.out.println(num[i]);
		}
		
        System.out.println("The Sum Of All Elements is :- " + sum);
	}
}
