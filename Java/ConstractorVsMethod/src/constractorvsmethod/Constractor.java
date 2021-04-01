
package constractorvsmethod;
public class Constractor {
    String name;
    int age;

    Constractor(String n,int a) {
        name = n;
        age = a;
    }
    
    void displayInfo(){
        System.out.println("Name : "+name+"\nAge : "+age);
    }
    
    
}
