// program 7 :-  Find Area of Rectangle  

package constructor;

public class Rectangle {
  Rectangle(){
	  System.out.println("Area of Rectangle is = ");
  }
  public int Area (int Length , int Width) {
	  int Area = Length * Width;
	  System.out.println("Length = " + Length + " &  Width = " + Width + " , Then Area = " + Area );
	  return 0;
  }
  
  public static void main(String[] args) {
	Rectangle R = new Rectangle();
	R.Area(17, 5);
}
}
