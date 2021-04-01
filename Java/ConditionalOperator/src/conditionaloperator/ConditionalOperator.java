
package conditionaloperator;

import java.util.Scanner;

public class ConditionalOperator{
    
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        int num1,num2,large;
        System.out.print("Enter First Number : ");
        num1 = input.nextInt();
        
        System.out.print("Enter Second Number : ");
        num2 = input.nextInt();
        
        large = (num1>num2)?num1:num2;
        System.out.println("Large Number = "+large);
        
    }
}