
package array2d;

import java.util.Scanner;

public class Array2D {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int [][] num = new int[3][3];
        for (int row = 0; row < 3; row++) {
            System.out.print("Enter three number : ");
            for (int col = 0; col < 3; col++) {
                num [row] [col] = input.nextInt();
            }
        }
        
        for (int row = 0; row < 3; row++) {
            for (int col = 0; col < 3; col++) {
                System.out.print(" "+num [row] [col]);
            }
            System.out.println();
        }
        
        
    }
    
}
