
package inheritance;

public class ChildClass extends ParentClass {
    String gender;
    void displayInfo2(){
        displayInfo1();
        System.out.println("Gender : "+gender);
    }
}
