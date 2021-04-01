
package array;

import java.util.Scanner;

public class Array {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter five number : ");
        double num[]= new double[5],max,min,sum=0,avg;
        for (int i = 0; i < num.length; i++) {
            num[i]=input.nextDouble();
        }
        for (int i = 0; i < num.length; i++) {
            sum = sum +num[i];
        }
        avg = sum/num.length;
        max=num[0];
        min=num[0];
        for (int i = 1; i < num.length; i++) {
            if(num[i]>max){
                max=num[i];
            }
            if(num[i]<min){
                min = num[i];
            }
        }
        System.out.println("Sum = "+sum);
        System.out.println("Average = "+avg);
        System.out.println("Maximum = "+max);
        System.out.println("Minimum = "+min);
        
    }
    
}
