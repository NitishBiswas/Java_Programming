
package palindrome2;

import java.util.Scanner;

public class Palindrome2 {

    
    public static void main(String[] args) {
       Scanner input = new Scanner(System.in);
       int temp,r,m,n;
        System.out.print("Enter intial number : ");
        m=input.nextInt();
        
        System.out.print("Enter final number : ");
        n=input.nextInt();
        System.out.println("Palindrome:");
        for (int i = m; i <= n; i++) {
            temp=i;
            int sum=0;
            while(temp!=0){
                r=temp%10;
                sum=sum*10+r;
                temp=temp/10;
            }
            if(i==sum){
                System.out.println(i);
            }
        }
    }
    
}
