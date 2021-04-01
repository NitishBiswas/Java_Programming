
package arrayoutput;

public class ArrayOutput {

    public static void main(String[] args) {
        int [][] num = new int [4][];
        num[0] = new int[1];
        num[1] = new int[2];
        num[2] = new int[3];
        num[3] = new int[4];
        int k = 0;
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < i+1; j++) {
                num [i][j] = k;
                k++;
            }
        }
        
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < i+1; j++) {
                System.out.print(" "+num[i][j]);
            }
            System.out.println();
        }
        
    }
    
}
