
package odd_even_loop;

import java.util.Scanner;

public class Odd_Even_Loop{
    
    public static void main(String[] args) {
        
        int n,j;
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter a number : 0 - ");
        n = input.nextInt();
        
        System.out.println("Odd:\tEven:\n");
        for(int i=1;i <= n;i+=2){
            
            System.out.print( i);
            
            j=i+1;
            if(j<=n){
                System.out.print("\t"+j+"\n");
            }
        }
        
        System.out.println("\n");
             
    }
}