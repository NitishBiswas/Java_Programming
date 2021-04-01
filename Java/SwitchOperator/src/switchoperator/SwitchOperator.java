
package switchoperator;

import java.util.Scanner;

public class SwitchOperator{
    
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        int roll;
        System.out.print("Enter your roll : ");
        roll = input.nextInt();
        
        switch(roll){
            case 1:
                System.out.println("Joy");
                break;
            case 2:
                System.out.println("Sultan");
                break;
            case 3:
                System.out.println("Hamza");
                break;
            case 4:
                System.out.println("Nai");
                break;
            case 5:
                System.out.println("Nitish");
                break;
            case 6:
                System.out.println("Rikta");
                break;
            case 7:
                System.out.println("Abdi");
                break;
            case 8:
                System.out.println("Nai");
                break;
            case 9:
                System.out.println("Aoynti");
                break;
            case 10:
                System.out.println("Musha");
                break;
            default:
                System.out.println("Wrong Input!");
        }
        
    }
}