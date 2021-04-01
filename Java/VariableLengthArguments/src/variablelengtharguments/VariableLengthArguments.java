
package variablelengtharguments;

public class VariableLengthArguments {

    public static void main(String[] args) {
        VarArgs ob = new VarArgs();
        ob.add(10);
        ob.add(10,20);
        ob.add(10,20,30);
        ob.add(10,20,30,40);
        ob.add(10,20,30,40,50);
    }
    
}
