
package inheritancewithencap;

public class InheritanceWithEncap {

    public static void main(String[] args) {
        ChildClass ob1 = new ChildClass();
        ob1.setName("Nitish Biswas");
        ob1.setRoll(05);
        ob1.setGmail("nitishbiswas.cse@gmail.com");
        ob1.displayInfo();
        
        ChildClass ob2 = new ChildClass();
        ob2.setName("Md. Musha");
        ob2.setRoll(10);
        ob2.setGmail("abumusa@gmail.com");
        ob2.displayInfo();
    }
    
}
