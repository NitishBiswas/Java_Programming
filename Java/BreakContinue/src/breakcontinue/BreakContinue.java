
package breakcontinue;

public class BreakContinue{
    
    public static void main(String[] args) {
        
        int i;
        for ( i = 1; i < 100; i=i+3) {
            if(i==10)
                continue;
            if(i>13)
                break;
            System.out.println(i);
           
        }
    }
}