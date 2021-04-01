
package superkeyword2;

public class Student extends Person {
    int roll;
    static String institute;
    Student(String n,int r,String i){
        super(n);
        roll = r;
        institute = i;
    }
    @Override
    void displayInfo(){
        super.displayInfo();
        System.out.println("Roll : "+roll);
        System.out.println("Institute : "+institute);
    }
}
