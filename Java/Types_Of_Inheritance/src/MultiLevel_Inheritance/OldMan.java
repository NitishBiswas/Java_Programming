
package MultiLevel_Inheritance;

public class OldMan extends Man {
    int age;
    void setInfo(int a){
        age = a;
    }
    void displayInfo(){
        System.out.println("Name : "+name);
        System.out.println("Gender : "+gender);
        System.out.println("Age : "+age);
        System.out.println("Height : "+height);
        System.out.println("Weight : "+weight);
    }
}
