
package recursion;

public class Recursion {

    public static void main(String[] args) {
        Factorial ob = new Factorial();
        int result = ob.fact(5);
        System.out.println("Factorial of 5 is "+result);
        
        result = ob.fact(4);
        System.out.println("Factorial of 4 is "+result);
        
        result = ob.fact(3);
        System.out.println("Factorial of 3 is "+result);
    }
    
}
