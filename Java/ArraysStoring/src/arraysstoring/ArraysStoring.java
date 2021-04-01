
package arraysstoring;

import java.util.Arrays;

public class ArraysStoring {

    public static void main(String[] args) {
        int [] num = {10,2,-4,6,5};
        Arrays.sort(num);
        
        //Accending
        System.out.print("Accending : ");
        for (int i = 0; i < 5; i++) {
            System.out.print(" "+num[i]);
        }
        
        System.out.println();
        
        //Deccending
        System.out.print("Deccending : ");
        for (int i = 4; i >= 0; i--) {
            System.out.print(" "+num[i]);
        }
        System.out.println();
        
        String [] names = {"nitish","atiq","musha","rikta"};
        
        Arrays.sort(names);
        
        for (int i = 0; i < 4; i++) {
            System.out.println(names[i]);
        }
        
        for (int i = 3; i >= 0; i--) {
            System.out.println(names[i]);
        }
    }
    
}
