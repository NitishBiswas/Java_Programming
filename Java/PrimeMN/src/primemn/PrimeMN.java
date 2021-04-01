
package primemn;

import java.util.Scanner;

public class PrimeMN {

    
    public static void main(String[] args) {
       Scanner input = new Scanner(System.in);
       int m,n,count,a=0,b=0;
       System.out.print("Enter intial number : ");
       m = input.nextInt();
       
       System.out.print("Enter final number : ");
       n = input.nextInt();
        System.out.println("Prime:"+"\t"+"Non Prime:");
        for (int i = m; i <= n; i++) {
            count=0;
            for (int j = 2; j <i; j++) {
                if(i%j==0){
                    count++;
                    break;
                }
            }
            if(count==0){
                System.out.println("  "+i);
                a++;
            }else{
                System.out.println("\t"+"  "+i);
                b++;
            }
        }
        System.out.println("Total Prime Number = "+a);
        System.out.println("Total Non Prime Number = "+b);
    }
    
}
