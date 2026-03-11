//Question 6 :- Write a program to find the maximum element in a 1D array.

package One_D_Array;

public class Question6 {

	public static void main(String[] args) {
		
		int arr[] = { 20, 10, 40, 60, 20, 30, 60 };
		
				int max = arr[0];
				for (int i = 0; i < arr.length; i++) {
					if (arr[i] > arr[0]) {
						max = arr[i];
					}
				}
		 
				System.out.println(max);
		
	}
}
