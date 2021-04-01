
package constructoroverloading;

public class ConstructorOverloading {

    public static void main(String[] args) {
        AddClass ob1 = new AddClass(1,2);
        AddClass ob2 = new AddClass(1,2,3);
        AddClass ob3 = new AddClass(1,2,3,4);
        ob1.result();
        ob2.result();
        ob3.result();
    }
    
}
