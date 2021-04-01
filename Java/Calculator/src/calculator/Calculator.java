
package calculator;
import java.util.Scanner;
public class Calculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num1,num2,res,choice;
        System.out.println("Enter 1 for Add(+)");
        System.out.println("Enter 2 for Subtract(-)");
        System.out.println("Enter 3 for Multiplication(x)");
        System.out.println("Enter 4 for Division(/)");
        System.out.println("Enter 5 for Remainder(%)");
        System.out.print("Enter Your Choice : ");
        choice = input.nextInt();
        System.out.print("Enter First Number : ");
        num1 = input.nextInt();
        System.out.print("Enter Second Number : ");
        num2 = input.nextInt();
        switch(choice){
            case 1:
                res=num1+num2;
                System.out.println("The Summation is  "+res);
                break;
            case 2:
                res=num1-num2;
                System.out.println("The Subtraction is  "+res);
                break;
            case 3:
                res=num1*num2;
                System.out.println("The Multiplication is  "+res);
                break;
            case 4:
                res=num1/num2;
                System.out.println("The Division is  "+res);
                break;
            case 5:
                res=num1%num2;
                System.out.println("The Remainder is  "+res);
                break;
             
        }
    }
    
}
