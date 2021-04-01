
package fibonacci;

import java.util.Scanner;


public class Fibonacci {

    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a=0,b=1,c,n;
        System.out.print("Enter a number : ");
        n=input.nextInt();
        System.out.print(a+" "+b+" ");
        c=a+b;
        while(c<=n){
            System.out.print(c+" ");
            a=b;
            b=c;
            c=a+b;
        }
        System.out.println();
        
        int d=0,e=1,f,m;
        System.out.print("Enter how many number : ");
        m=input.nextInt();
        System.out.print(d+" "+e+" ");
        for (int i = 3; i <=m; i++) {
            f=d+e;
            System.out.print(f+" ");
            d=e;
            e=f;
            
        }
        System.out.println();
        
    }
    
}
