
package relationaloperator;

import java.util.Scanner;

public class RelationalOperator{
    
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        int num;
        System.out.print("Enter Number : ");
        num = input.nextInt();
        
        if(num>0){
            System.out.println("Possitive");
        }
        else if(num<0){
            System.out.println("Negative");
        }
        else{
            System.out.println("Zero");
        }
    }
}