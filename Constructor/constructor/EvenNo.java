// program 4 :- Print Even Number using Constructor & Method

package constructor;

public class EvenNo {
      EvenNo(){
    	  System.out.println("First 5 Even Numbers are : ");
      }
      public int Even() {
    	  for(int i=1;i<=10;i++) {
    		  if(i%2==0) {
    			  System.out.println(i);
    		  }
    	  }
		return 0;
    	  
      }
      
      
      public static void main(String[]args) {
    	  EvenNo e = new EvenNo();
    	  e.Even();
      }
}
