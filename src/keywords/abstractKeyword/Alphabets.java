package keywords.abstractKeyword;

abstract class Letters{
   abstract void write();
   public void read(){
    System.out.println("Reading of Letters");
   }
}
class Numbers extends Letters{
    public void write(){
        System.out.println("Writing Letters and Numbers");
    }
    public void read(){
        System.out.println("Reading of Letters");
       }
}
public class Alphabets {
    public static void main(String[] args) {
        Numbers n = new Numbers();
        System.out.println("Inside Numbers class");
        n.write();
        n.read();
        System.out.println("Inside Letters class");
        Letters l = new Letters() {
            void write(){
               System.out.println("Writing");
            }
        };
        l.write();
        l.read();
    }
}
