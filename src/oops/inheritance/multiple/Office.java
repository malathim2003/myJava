package oops.inheritance.multiple;
//more parent and single child is called as Multiple Inheritance
interface Tl{
   abstract void separatesWork(); // abstract can have only declaration, not accepts definition
}
class Manager{
   public void assignWork(){
    System.out.println("Manager assigns works to both the team leader and the employee");
   }
}
class Employee extends Manager implements Tl{
    public void separatesWork(){
        System.out.println("Teamleader separates the assigned work to employees");
    }
    public void work(){
        System.out.println("Employee have to finish the work within deadline");
    }
}
public class Office {
  public static void main(String[] args) {
    Employee emp = new Employee();
    emp.assignWork();
    emp.separatesWork();
    emp.work();
  }
}
