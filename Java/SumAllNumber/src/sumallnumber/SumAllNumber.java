
package sumallnumber;

import java.util.Scanner;


public class SumAllNumber {

    
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        int sum=0 , m , n;
        System.out.print("Enter starting number : ");
        m = input.nextInt();
        System.out.print("Enter ending number : ");
        n = input.nextInt();
        for (int i = m; i <=n; i++) {
            sum = sum + i;
            System.out.print(" "+i);
        }
        System.out.println('\n'+" Sum = "+sum);
    }
    
}
