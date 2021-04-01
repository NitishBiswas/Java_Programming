
package positivenegative;

import java.util.Scanner;

public class PositiveNegative {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num;
        System.out.print("Enter A Number : ");
        num = input.nextInt();
        if(num>0){
            System.out.println("\n"+num+" is Positive Number\n");
        }else if(num<0){
            System.out.println("\n"+num+" is Negative Number\n");
        }else{
            System.out.println("\n"+num+" is Zero\n");
        }
    }
    
}
