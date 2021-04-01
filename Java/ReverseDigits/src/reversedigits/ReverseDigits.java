
package reversedigits;

import java.util.Scanner;

public class ReverseDigits {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int sum=0,temp,num,r;
        System.out.print("Enter any number : ");
        num = input.nextInt();
        temp = num;
        
        while(temp!=0){
            r=temp%10;
            sum=sum*10+r;
            temp=temp/10;
        }
        
        System.out.println("Reverse of Digits : "+sum);
        
    }
    
}
