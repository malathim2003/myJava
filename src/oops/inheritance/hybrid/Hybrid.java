package oops.inheritance.hybrid;
//College, Branches, Lab classes are in Hierarchical Inheritance and College, Branches, Professor are in Multilevel Inheritance Hence combination of one or more inheritance is called as Hybrid Inheritance.
class College{
    public void management(){
        System.out.println("College have to take care of all the events");
    }
}
class Branches extends College{
    public void branch(){
        System.out.println("Some of the branches are : IT, CSE, ECE, EEE, etc..");
    }
}
class Proffessor extends Branches{
    public void staff(){
        System.out.println("Each branch contains separate staff details");
    }
}
class Lab extends College{
    public void lab(){
        System.out.println("All the branches have separate labs");
    }
}
public class Hybrid {
  public static void main(String[] args) {
    Proffessor p = new Proffessor();
    Branches b = new Branches();
    Lab l = new Lab();
    System.out.println("From Professor child classs");
    p.staff();
    p.branch();
    p.management();
    System.out.println("From Branches child class");
    b.branch();
    b.management();
    System.out.println("From Lab child class");
    l.lab();
    l.management();
  }
}
