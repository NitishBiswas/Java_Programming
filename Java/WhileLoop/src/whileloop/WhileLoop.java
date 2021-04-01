
package whileloop;

import java.util.Scanner;

public class WhileLoop{
    
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number : ");
 
        int n,i;
        n = input.nextInt();
        i=1;
        while(i<=n){
            System.out.println(i+".DIU");
            i++;
        }
    }
}