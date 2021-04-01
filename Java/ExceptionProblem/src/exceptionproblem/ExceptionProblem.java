package exceptionproblem;

import java.util.Scanner;

public class ExceptionProblem {

    public static void main(String[] args) {
        int count = 0;
        do {
            try {
                Scanner input = new Scanner(System.in);
                System.out.print("Enter 1st Number : ");
                int num1 = input.nextInt();
                System.out.print("Enter 2nd Number : ");
                int num2 = input.nextInt();
                int result = num1 / num2;
                System.out.println("Result : " + num1 + " / " + num2 + " = " + result);
                count++;
            }catch(Exception e){
                System.out.println("Exception : "+e);
                System.out.println("You must enter integer number.Please try again");
            }
        } while (count == 0);

    }

}
