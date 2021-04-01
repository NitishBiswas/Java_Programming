
package strongnumber;

import java.util.Scanner;

public class StrongNumber {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num,temp,r,sum=0,j;
        System.out.print("Enter a number : ");
        num = input.nextInt();
        temp = num;
        while(temp!=0){
            int k=1;
            r=temp%10;
            for (int i = 1; i <= r; i++) {
                k=k*i;
            }
            sum = sum + k;
            temp = temp / 10;
        }
        if(num==sum){
            System.out.println(num+" is strong number.");
        }else{
            System.out.println(num+" is not strong number.");
        }
        
        
    }
    
}
