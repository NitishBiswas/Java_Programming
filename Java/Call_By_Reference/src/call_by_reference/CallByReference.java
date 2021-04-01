
package call_by_reference;

public class CallByReference {
    String name;
    void add(CallByReference r2){
        r2.name = "Nitish";//Formal value
    }
}
