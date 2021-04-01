
package Single_Inheritance;

public class Person {//Super class
    String name;
    int age;
    void setInfo(String name,int age){
        this.name = name;
        this.age = age;
    }
    void displayInfo(){
        System.out.println("Name : "+name);
        System.out.println("Age : "+age);
    }
}
