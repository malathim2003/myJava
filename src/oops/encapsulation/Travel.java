package oops.encapsulation;

import java.util.Scanner;

public class Travel {
    private int ticket; //to access this private variable ticket we have to call the setTicket() and getTicket() methods bcoz the private variable ticket and the getters,setters are binded. This is called Encapsulation.
    public int getTicket() {
        return ticket;
    }
    public void setTicket(int t) {
        this.ticket = t;
        // checker();
    }
    public void checker(){
        if(ticket!=0){
           System.out.println(ticket +"Can Travel in this Bus");
        }
        else{
           System.out.println(ticket +"Cannot Travel in this Bus");
        }
    }
}
class Bus{
    public static void main(String[] args) {
        Travel tr = new Travel();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter inputs:");
        // System.out.println(tr.ticket);
        int ticket = sc.nextInt();
        tr.setTicket(ticket);
        System.out.println("Value for ticket in getTicket method is : "+tr.getTicket());
        // tr.checker();
        sc.close();
        
    }

}
