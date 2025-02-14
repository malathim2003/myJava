package keywords.thisKeyword;

class Laptop{
    public Laptop(){
        System.out.println("Constructor inside Laptop class");
    }
    public Laptop(int no){
        // this(); // calls the constructor of the same class Laptop without parameter
        this(12,5);  // calls the constructor of the same class Laptop with 2 parameters.
        System.out.println("Single Parameterized constructor in Laptop class");
    }
    public Laptop(int n1,int n2){
        //this(10) //calls the constructor of the same class Laptop with 1 parameters.
        this(); // calls the constructor of the same class Laptop without parameter
        System.out.println("Double Parameterized constructor in Laptop class");
    }
    public void memory(){
        System.out.println("Laptop contains Memory");
    }
}

public class Example2 {
public static void main(String[] args) {
    Laptop lp = new Laptop(6);
    lp.memory();
}
}
