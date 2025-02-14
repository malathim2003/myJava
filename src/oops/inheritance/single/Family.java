package oops.inheritance.single;

class ElderSister{
   public void sleep(){
    System.out.println("Elder sister sleeps quickly");
   }
}
class YoungerSister extends ElderSister{
   public void cook(){
    System.out.println("Younger sister cooks delicious foods");
   }
   
}
public class Family {
    public static void main(String[] args) {
       YoungerSister y = new YoungerSister();
       y.sleep();
       y.cook();
    }
}
