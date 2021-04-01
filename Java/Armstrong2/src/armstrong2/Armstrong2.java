
package armstrong2;

import java.util.Scanner;

public class Armstrong2 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int m,n,r;
        System.out.print("Enter initial number : ");
        m=input.nextInt();
        
        System.out.print("Enter final number : ");
        n=input.nextInt();
        
        for (int i = m; i <= n; i++) {
            int sum = 0,temp;
            temp = i;
            while(temp!=0){
                r = temp%10;
                sum = sum+r*r*r;
                temp=temp/10;
            }
            if(i==sum){
                System.out.println(i);
            }
        }
        
    }
    
}
