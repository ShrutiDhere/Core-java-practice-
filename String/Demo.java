package string;
	
	public class Demo {

		public static void main(String[] args) {

		String str1 = new String("Hello");
		String str2 = new String("Hello");
	
		System.out.println("The Hashcode of " +  str1 + " is = " +  str1.hashCode());
			System.out.println("The Hashcode of " +  str2 + " is = " + str2.hashCode());
			
			System.err.println("--------------------------------------------");
	
			System.out.println("When Check Memory Adress of "+ str1 +" & "+ str2+ " will be = "+ str1 == str2);
			
			System.err.println("--------------------------------------------");
			
			System.out.println("When Check Content of " + str1 + " & "+  str2 + " will be = " + str1.equals(str2));
			System.err.println("--------------------------------------------");

			String str11 = "Ram";
			String s =str11.concat("yadav");
	
			System.out.println("When Check Memory Adress of "+ str1 + " & "+ str2+ " will be = "+ str11 == str2);
			System.err.println("--------------------------------------------");
			
			
			System.out.println("When Check Content of " + str11 +" & "+ str2 + " will be = "+ str11.equals(str2));
			System.err.println("--------------------------------------------");
	
			System.out.println(s);

			String str111 = new String("Hello");
			String str21 = new String("Hello");
			
			System.err.println("--------------------------------------------");
	
			System.out.println(System.identityHashCode(str111));
			System.out.println(System.identityHashCode(str21));
			System.err.println("--------------------------------------------");
	
			System.out.println(str111 == str21);
	

		}
	}

	