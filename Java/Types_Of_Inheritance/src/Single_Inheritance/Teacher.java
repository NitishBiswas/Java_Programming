
package Single_Inheritance;

public class Teacher extends Person {//SubClass
    String qualification;
    
    @Override
    void displayInfo(){
        super.displayInfo();
        System.out.println("Qualification : "+qualification);
        
    }
}
