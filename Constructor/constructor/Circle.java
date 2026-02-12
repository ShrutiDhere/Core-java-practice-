//program 8:- Find Area of circle  

package constructor;

public class Circle {
   Circle(){
	   System.out.println("Area of Circle is :- ");
   }
   public int Area(int radius) {
	   float Area=3.14f*radius*radius;
	   System.out.println("Area = " + Area);
	   return 0;
   }
   public static void main(String[] args) {
   Circle C=new Circle();
   C.Area(5);
   } 
}
