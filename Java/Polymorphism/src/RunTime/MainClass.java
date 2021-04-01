
package RunTime;

public class MainClass {
    public static void main(String[] args) {
        Person p = new Person();
        p.display();
        p = new Teacher();
        p.display();
        p = new Students();
        p.display();
    }
}
