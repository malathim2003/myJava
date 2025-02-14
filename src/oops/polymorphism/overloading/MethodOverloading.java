package oops.polymorphism.overloading;

import java.util.Scanner;

public class MethodOverloading {
    //same method name with different parameters is called method overloading
    int rollNo;
   public void student(int rollNo){
      this.rollNo = rollNo;
      System.out.println("student method with single rollNo argument : "+rollNo);
   }
   public void student(String Name){
    System.out.println("student method with single Name argument : "+Name);
   }
   public void student(int rollNo, String Name){
    System.out.println("student method with rollNo and Name arguments : "+ rollNo + Name);
   }
   public void student(int rollNo, String Name, int rank){
    System.out.println("student method with rollNo, Name and rank arguments : "+ rollNo + Name + rank);
   }
}
class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        MethodOverloading mo = new MethodOverloading();
        int rn = sc.nextInt();
        int r = sc.nextInt();
        String n = sc.next();
        mo.student(rn);
        mo.student(n);
        mo.student(rn, n);
        mo.student(rn, n, r);
        sc.close();
    }
}
