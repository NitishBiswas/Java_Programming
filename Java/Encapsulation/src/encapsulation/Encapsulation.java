
package encapsulation;

public class Encapsulation {

    public static void main(String[] args) {
        NewClass ob = new NewClass();
        ob.setName("Nitish");
        ob.setAge(20);
        System.out.println("Name : "+ob.getName());
        System.out.println("Age : "+ob.getAge());
    }
    
}
