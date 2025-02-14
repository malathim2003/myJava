package oops.inheritance.hierarchical;

public class Body {
    public void body(){
        System.out.println("Human body contains many organs");
    }
}
class Brain extends Body{
    public void brain(){
        System.out.println("Brain gives signals");
    }
}
class Heart extends Body{
    public void heart(){
        System.out.println("Heart pumps blood");
    }
}
class Human{
    public static void main(String[] args) {
        Heart h = new Heart();
        Brain b = new Brain();
        h.body();
        h.heart();
        b.body();
        b.brain();
    }
}
