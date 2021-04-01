
package sumoddeven;

import java.util.Scanner;


public class SumOddEven {

    
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        int sum1=0,sum2=0,m,n;
        System.out.print("Enter starting number : ");
        m = input.nextInt();
        
        System.out.print("Enter ending number : ");
        n = input.nextInt();
        
        System.out.println("Even :"+"\t"+"Odd : ");
        System.out.println("-----"+"\t"+"-----");
        for (int i = m; i <= n; i++) {
            if(i%2==0){
                sum1 = sum1+i;
                System.out.println("  "+i);
            }else{
                sum2 = sum2+i;
                System.out.println("\t"+"  "+i);
            }
        }
        System.out.println("-----"+"\t"+"-----");
        System.out.println("  "+sum1+"\t"+"  "+sum2);
        
    }
    
}
