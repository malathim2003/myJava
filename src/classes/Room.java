package classes;
///my java classs
import java.util.Scanner;
class House{
    int No;
    String owner;
    int noOfRooms;
    public void show(int No,String owner, int noOfRooms){
        this.No = No;  //this.No points the int No variable present inside the class House, No represents the given input, both have same variable name(No) thats why this.No is specified to differentiate//
        this.owner = owner;
        this.noOfRooms = noOfRooms;
        System.out.println("House number : "+No+"\n House Owner : "+owner+"\nNo of Rooms : "+noOfRooms);
    }
}

public class Room {
    int roomNo;
    int noOfMembers;
    String owner;
    public void display(){
        System.out.println("roomno" +roomNo + "has" +noOfMembers+ "members and the Owner is :"+owner);
    }
    public static void main(String[] args) {
        Room r = new Room(); //object creation for Room class
        Scanner sc = new Scanner(System.in);
        System.out.println("enter inputs:\n");
        r.roomNo = sc.nextInt();
        r.noOfMembers = sc.nextInt();
        r.owner = sc.next();
        r.display();
        House h = new House();   //object creation for House class
        h.show(1,"Radha",8);
        sc.close();
    }
}
