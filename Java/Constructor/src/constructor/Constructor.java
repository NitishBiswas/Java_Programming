
package constructor;

public class Constructor {

    public static void main(String[] args) {
        Add ob = new Add();
        int a = ob.increase();
        int b = ob.decrease();
        if(a>b)
            ob.increase();
        else
            ob.decrease();
        System.out.println(ob.i);
    }
    
}
