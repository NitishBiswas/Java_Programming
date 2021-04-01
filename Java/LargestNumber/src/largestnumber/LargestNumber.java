
package largestnumber;

import java.util.Scanner;

public class LargestNumber {

    static Scanner input = new Scanner(System.in);
    public static void main(String[] args) {
        int a,b,c;
        System.out.print("Enter 1st Number : ");
        a = input.nextInt();
        System.out.print("Enter 2nd Number : ");
        b = input.nextInt();
        System.out.print("Enter 3rd Number : ");
        c = input.nextInt();
        
        if(a>b && a>c){
                System.out.println("\nLargest Number is "+a);                
        }else if(b>c){
                System.out.println("\nLargest Number is "+b);
        }else{
                System.out.println("\nLargest Number is "+c);
        }
        System.out.println("");
    }
    
}
