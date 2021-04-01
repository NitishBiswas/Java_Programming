
package array2;

import java.util.Scanner;

public class Array2 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String[] st = new String[4];
        st[0] = "Nitish";
        st[1] = "Biswas";
        st[2] = "Nitish";
        st[3] = "Biswas";
        String n;
        n = input.nextLine();
        for (String i : st) {
            if(i.equals(n)){
                System.out.println("Yes");
                System.exit(0);
            }
        }
        System.out.println("No");
        
        
    }
    
}
