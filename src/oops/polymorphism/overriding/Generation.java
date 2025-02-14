package oops.polymorphism.overriding;

class Mother{
    String name = "Radha";
   public void angry(){
    System.out.println("Mother has the caharacter of getting angry easily");
   }
}

class Daughter extends Mother{
    String name = "Malathi";
    public void angry(){
        System.out.println("Daughter also have the caharacter of getting angry easily");
    }
    public void eat(){
        System.out.println("The character of living to eat");
    }
}
public class Generation {
  public static void main(String[] args) {
    Daughter d = new Daughter();
    System.out.println(d.name);
    d.angry();
    d.eat();
  }
}

// The Daughter class contains the Mother class methods and also the Daughter class methods like below :
// class Daughter extends Mother{
//     String name = "Radha";
//     public void angry(){
//      System.out.println("Mother has the caharacter of getting angry easily");
//     }
//     String name = "Malathi";
//     public void angry(){
//         System.out.println("Daughter also have the caharacter of getting angry easily");
//     }
//     public void eat(){
//         System.out.println("The character of living to eat");
//     }
// }
// but while accessing the method/variable which is present in both the parent and child class, gives the result of child class only. This is called as Method overriding