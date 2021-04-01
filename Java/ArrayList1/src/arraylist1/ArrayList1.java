
package arraylist1;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayList1 {

    public static void main(String[] args) {
        ArrayList<Integer> number = new ArrayList<>();
        System.out.println("Size = "+number.size());
        number.add(10);
        number.add(20);
        number.add(30);
        number.add(3,40);
        
        System.out.println(number);
        
        for(int x:number){
            System.out.println(x);
        }
        
        Iterator itr = number.iterator();
        
        while(itr.hasNext()){
            System.out.println(itr.next());
        }
        
        number.remove(3);
        
        System.out.println(number);
        
        number.removeAll(number);
        
        System.out.println("Remove All : "+number);
    }
    
}
