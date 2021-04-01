
package decimal2binary;

import java.util.Scanner;

public class Decimal2Binary {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num,temp,b=0,k = 1;
        System.out.print("Enter A number : ");
        num = input.nextInt();
        temp = num;
        for (int i = num; i > 0; i=i/2) {
            b=b+(num%2)*k;
            k=k*10;
            num=num/2;
            
        }
        System.out.println("Binary = "+b);
    }
    
}
