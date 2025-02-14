package keywords.superKeyword;

class Ocean{
    public Ocean(){
        System.out.println("Default constructor inside Ocean class");
    }
}
class Sea extends Ocean{
    public Sea(){
        super(); // calls the constructor of parent class Ocean
        System.out.println("default constructor inside Sea class");
    }
}
public class Example1 {
    public static void main(String[] args) {
      Sea s = new Sea();
   }
}
