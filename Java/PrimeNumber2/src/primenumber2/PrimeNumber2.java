
package primenumber2;

import java.util.Scanner;
public class PrimeNumber2 {

    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int count=0;
        System.out.print("Enter a Number: ");
        int num = input.nextInt();
        for (int i = 2; i <= num; i++) {
            if(num%i==0){
                count++;
                break;
            }
        }
        if(count==0){
            System.out.println("Prime");
        }else{
            System.out.println("Not Prime");
        }
        
    }
    
}
