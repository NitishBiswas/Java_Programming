//sum of diagonal
//upper triangle
//lower triangle

package matrix;

import java.util.Scanner;

public class Matrix {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int [][] A = new int [3][3];
        int sum1 = 0,sum2 = 0,sum3 = 0;
        for (int row = 0; row < 3; row++) {
            for (int col = 0; col < 3; col++) {
                A[row][col] = input.nextInt();
            }
        }
        
        for (int row = 0; row < 3; row++) {
            for (int col = 0; col < 3; col++) {
                if(row==col){
                    sum1=sum1+A[row][col];
                }
                if(row<col){
                    sum2=sum2+A[row][col];
                }
                if(row>col){
                    sum3=sum3+A[row][col];
                }
            }
        }
        
        System.out.println("Sum of digonal matrix = "+sum1);
        System.out.println("Sum of upper matrix = "+sum2);
        System.out.println("Sum of lower matrix = "+sum3);
        
    }
    
}
