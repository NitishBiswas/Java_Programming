
package constructorcopy;

public class CopyClass {
    int roll;
    String name;

    public CopyClass(String n,int r) {
        name = n;
        roll = r;
    }

    public CopyClass(CopyClass s) {
        name = s.name;
        roll = s.roll;
    }
    void displayInfo(){
        System.out.println("Name : "+name);
        System.out.println("Roll : "+roll);
    }
    
    
}
