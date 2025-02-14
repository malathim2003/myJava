package keywords.finalKeyword;

class Room{
    final int AptNo = 10; //have to assign value while declaring final variable and that is the final value, JAVA doesn't allow to change the value of final variable AptNo.
    public void noOfRooms(){
        //AptNo = 12;// shows error
       System.out.println("There are 50+ rooms in this "+AptNo+" Apartment");
    }
    // Here AptNo is given as a Final variable, so can't be assigned. this.AptNo = AptNo doesn't work here
    // public void setAptNo(int AptNo){
    //    this.AptNo = AptNo;
    // }
}
class Members{
    public void member(){
        int AptNo = 12;
        System.out.println("There are 500 members in this "+AptNo+" apartment");
    }
}
public class Apartment {
   public static void main(String[] args) {
    Room r = new Room();
    Members m = new Members();
    m.member();
    r.noOfRooms();

   }
}
