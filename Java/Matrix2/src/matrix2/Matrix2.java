
package matrix2;

import java.util.Scanner;

public class Matrix2 {

    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int [] [] A = new int [2][3];
        int [] [] B = new int [2][3];
        
        for (int row = 0; row < 2; row++) {
            for (int col = 0; col < 3; col++) {
                System.out.printf("A[%d][%d]=",row+1,col+1);
                A[row][col] = input.nextInt();
            }
        }
        
        
    }
    
}
