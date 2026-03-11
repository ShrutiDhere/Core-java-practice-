//Question 5:- Write a program to find the average of elements in a 1D array.

package One_D_Array;

public class Question5 {

	public static void main(String[] args) {
		
		int marks[]= {70,80,90,75,95,85};
		
		int total=0;
		
		System.out.println("Total Subjects are :- " + marks.length);
		
		for(int i=0;i<marks.length;i++) {
			total=total + marks[i];
			
		}
		double Average=total/marks.length;
		System.out.println("The Total Of the All Marks is :- " + total );
		System.out.println("The Average is :- " + Average );
		
		
	}
}
