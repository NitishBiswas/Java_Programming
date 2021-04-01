
package arraylist;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class arrayList {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n;
        ArrayList<String> st = new ArrayList<>();
        System.out.println("Size = "+st.size());
        
        st.add("Nitish");
        st.add("Biswas");
        st.add("Nitish");
        st.add("Biswas");
        
        for(String s: st){
            System.out.println(s);
        }
        
        Collections.sort(st,Collections.reverseOrder());
        System.out.println(st);
        
//        do{
//            System.out.print("Enter Name : ");
//            st.add(input.nextLine());
//            System.out.print("Do you insert another name (0/1) : ");
//            n = input.nextInt();
//        }while(n==1);
        
    }
    
}
