
package call_by_reference;

public class Call_By_Reference {

    public static void main(String[] args) {
        CallByReference r1 = new CallByReference();
        r1.name = "Biswas";//Original value
        System.out.println("Before Calling "+r1.name);
        r1.add(r1);
        System.out.println("After Calling "+r1.name);//Original value change by formal value
    }
    
}
