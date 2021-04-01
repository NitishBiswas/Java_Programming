
package constractorvsmethod;
public class Method {
    String name;
    int age;

    void setInfo(String n,int a) {
        name = n;
        age = a;
    }
    
    void displayInfo(){
       System.out.println("Name : "+name+"\nAge : "+age);
    }
}
