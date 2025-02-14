package oops.inheritance.multilevel;

class GrandFather{
   public void stories(){
    System.out.println("Grand Father tells more historical stories");
   }
}
class Father extends GrandFather{
   public void work(){
    System.out.println("Father works very hard");
   }
}
public class Son extends Father {
   public void play(){
    System.out.println("Son plays all games very well");
   }
   public static void main(String[] args) {
    Son s = new Son();
    s.stories();
    s.work();
    s.play();
   }
}
