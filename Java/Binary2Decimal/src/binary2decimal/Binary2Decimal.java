
package binary2decimal;

import java.util.Scanner;

public class Binary2Decimal {

    public static void main(String[] args) {
       Scanner input = new Scanner(System.in);
       
       double k,i=0;
       int num,temp,r,sum=0;
       System.out.print("Enter A binary number : ");
       num = input.nextInt();
       temp = num;
       while(temp!=0){
           r=temp%10;
           k = Math.pow(2, i);
           sum = (int) (sum + r*k);
           i++;
           temp = temp/10;
           
       }
        System.out.println("Decimal = "+sum);
        
    }
    
}
