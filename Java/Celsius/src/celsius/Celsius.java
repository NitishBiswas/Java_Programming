
package celsius;

import java.util.Scanner;

public class Celsius{
    
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        double fahrenheit,celsius;
       
        System.out.print("Enter Fahrenheit : ");
        fahrenheit = input.nextDouble();
        
        celsius = 5 * (fahrenheit - 32) / 9;
        System.out.println("Celsius = "+celsius);
        
    }
}