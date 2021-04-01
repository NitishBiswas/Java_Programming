
package UnaryOperator;

public class UnaryOperator{
    
    public static void main(String[] args) {
        int x = 10,y,result;
        y = +x;// 10
        System.out.println("Y = "+y);
        
        y = -x;//-10
        System.out.println("Y = "+y);
        
        y = -y;//10
        System.out.println("Y = "+y);
        
        y = ++x;//11
        System.out.println("Y = "+y);
        
        y = x++;//11
        System.out.println("Y = "+y);
        
        y = --x;//11
        System.out.println("Y = "+y);
        
        y = x--;//11
        System.out.println("Y = "+y);
        
        y = x;//10
        System.out.println("Y = "+y);
        
    }
}