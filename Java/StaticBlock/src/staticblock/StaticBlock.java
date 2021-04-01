
package staticblock;

public class StaticBlock {

    static String name;
    static int roll;
    
    static{
        name = "Nitish";
        roll = 05;
    }
    static void display(){
        System.out.println("Name : "+name+"\nRoll : "+roll);
    }
    public static void main(String[] args) {
        StaticBlock.display();
    }
    
}
