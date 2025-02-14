package oops.polymorphism.overloading;

public class ConstructorOverloading {
    //same constructor name with different parameters is called constructor overloading
    //constructor name should be same as of the class name
    //constructor doesn't contain any return type
    //constructors can automatically calls internally while creating an object for a class so no need to call the constructor like method calling and also no need to create object for a constructor
   public ConstructorOverloading(){
       System.out.println("Default constructor contains all departments");
   }
   public ConstructorOverloading(String d1){
    System.out.println(d1);
    
   }
   public ConstructorOverloading(String d2, String hod){
    System.out.println("Hod of "+d2+"department is : "+hod);
    
   }
   public ConstructorOverloading(int d){
    System.out.println("Total no of departments : "+d);
    
   }
}
class Departments{
  public static void main(String[] args) {
    ConstructorOverloading co = new ConstructorOverloading();

    ConstructorOverloading co1 = new ConstructorOverloading("Computer science");

    ConstructorOverloading co2 = new ConstructorOverloading("Information technology", "Jhon");

    ConstructorOverloading co3 = new ConstructorOverloading(12);




  }
}
