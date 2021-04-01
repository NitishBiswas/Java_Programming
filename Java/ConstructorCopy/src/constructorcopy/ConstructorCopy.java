
package constructorcopy;

public class ConstructorCopy {

    public static void main(String[] args) {
        CopyClass ob1 = new CopyClass("Nitish",05);
        CopyClass ob2 = new CopyClass(ob1);
        ob1.displayInfo();
        ob2.displayInfo();
    }
    
}
