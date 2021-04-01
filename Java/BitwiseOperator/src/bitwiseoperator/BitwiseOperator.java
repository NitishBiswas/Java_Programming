
package bitwiseoperator;


public class BitwiseOperator {

    
    public static void main(String[] args) {
        
        int a = 32,b = 12,c,d=-5;
        
        c = a & b;
        System.out.println("a & b = "+c);
        
        c = a | b;
        System.out.println("a | b = "+c);
        
        c = a ^ b;
        System.out.println("a ^ b = "+c);
        
        c = a << 3;
        System.out.println("a << 3 = "+c);
        
        c = a >> 3;
        System.out.println("a >> 3 = "+c);
        
        c = ~d;
        System.out.println("~d = "+c);
    }
    
}
