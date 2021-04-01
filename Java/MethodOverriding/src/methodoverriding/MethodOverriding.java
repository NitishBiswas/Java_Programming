
package methodoverriding;

public class MethodOverriding {

    public static void main(String[] args) {
        Teacher t1 = new Teacher();
        t1.name = "Anis";
        t1.age = 27;
        t1.qualification = "BSc in CSE";
        t1.displayInfo();
        Person p1 = new Person();
        p1.name = "Nitish";
        p1.age = 22;
        p1.displayInfo();
    }
    
}
