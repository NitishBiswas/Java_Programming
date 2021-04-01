
package call_by_value;

public class Call_By_Value {

    public static void main(String[] args) {
        CallByValue ob1 = new CallByValue();
        int x = 10;//Original Value
        System.out.println("Before Calling "+x);
        ob1.add(x);
        System.out.println("After Calling "+x);//No change in Original value
    }
    
}
