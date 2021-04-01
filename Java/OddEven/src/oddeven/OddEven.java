
package oddeven;

import java.util.Scanner;

public class OddEven {

    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num;
        System.out.print("Enter A Number : ");
        num = input.nextInt();
        if(num%2==0){
            System.out.println("\n"+num+" is a Even Number\n");
        }else{
            System.out.println("\n"+num+" is a Odd Number\n");
        }
    }
    
}
