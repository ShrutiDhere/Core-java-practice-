//program 1:- 1. Create a class with private variables
//        Create a class Person with private variables name and age.
//        Add setter and getter methods.
//        Create an object and print the name and age.

package Encapsulation;

public class Person {
      private String name;
      private int age;
      
          public String getName() {
        	  return name;
          }
          public void setName(String name) {
        	  this.name=name;
          }
          public int getAge() {
        	   return age;
          }
          public void setAge(int age) {
        	  this.age=age;
          }
}
