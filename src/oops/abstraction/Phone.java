package oops.abstraction;

abstract class Phone {
    abstract void call(); //the property of call() method is not given in Phone class but the classes which extends Phone class definitely have to give definition for this call() method hence that classes contain property for call() method but not Phone class bcoz it is an abstract method. This property of hiding the internal processing of the calling method in Phone class is called as Abstraction
    abstract void gallery();
    public void email(String from, String to){
        call();
        System.out.println("Sending Email from "+from+" to "+to);
    }
}
class Network extends Phone {
    void call(){
        System.out.println("Calling property comes here");
        gallery();
    }
    void gallery(){
        System.out.println("Gallery property comes here");
    }
    public static void main(String[] args) {
           Network n = new Network();
           n.email("malathi","dhatcha");
    }
}
