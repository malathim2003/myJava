package keywords.thisKeyword;

class Subject{
    private String favSubject; //here the variable favSubject is private so not accessible in other classes. To access value to this favSubject, getters and setters are used and to assign value to this private variable, this keyword is used.
    public String getfavSubject(){
        return favSubject;
    }
    public void setfavSubject(String favSubject){
        this.favSubject = favSubject;
    }
}
public class Example1 {
public static void main(String[] args) {
    Subject s = new Subject();
    s.setfavSubject("Tamil");
    System.out.println("My favourite subject is:"+ s.getfavSubject());
}
}
