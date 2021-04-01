
package objectOrientedProgramming;

//This is called class
public class Students {
    //Three variables
    String name;
    int roll;
    int phone;
    
    //Two methods
    void setInfo(String n,int r,int p){
        name=n;
        roll=r;
        phone=p;
    }
    void getInfo(){
        System.out.println("Name : "+name);
        System.out.println("Roll : "+roll);
        System.out.println("Phone : "+phone);
        System.out.println("\n");
    }
}
 