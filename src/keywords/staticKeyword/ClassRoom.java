package keywords.staticKeyword;

//static variables are same for all the objects(it shares the memory)

class Student{
    int rollNo;
    static String branch;
    //Initial assignment to a static variable
    //Always static block executes first
    static{           //Executes when loading the class and the class will be loaded only once in JAVA
        branch = "IT";
    }
    public Student(){ //Executes when creating object for this class Student
        rollNo = 1;
    }
    public void show(){
        System.out.println(rollNo +" in "+branch);
    }
}

public class ClassRoom {
    public static void main(String[] args) {
        Student s1 = new Student();
        Student s2 = new Student();
        // s1.rollNo = 26;
        // s2.rollNo = 24;
        // Student.branch = "IT"; // static variable don't need object to call
        s1.show();
        s2.show();
    }
 

   
}
