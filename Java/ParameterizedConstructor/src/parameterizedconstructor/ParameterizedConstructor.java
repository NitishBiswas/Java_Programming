
package parameterizedconstructor;

public class ParameterizedConstructor {

    public static void main(String[] args) {
        AddClass ob1 = new AddClass(10,20);
        AddClass ob2 = new AddClass(30,40);
        AddClass ob3 = new AddClass(50,60);
        ob1.result();
        ob2.result();
        ob3.result();
    }
    
}
