
package arraylist2;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayList2 {

    public static void main(String[] args) {
        ArrayList <Integer> number = new ArrayList<>();
        
        number.add(10);
        number.add(20);
        number.add(30);
        number.add(3,40);
        System.out.println("Size : "+number.size());
        System.out.println(number);
        for(int x: number){
            System.out.println(x);
        }
        
        Iterator itr = number.iterator();
        
        while(itr.hasNext()){
            System.out.println(itr.next());
        }
        number.remove(2);
        System.out.println(number);
    }
    
}
