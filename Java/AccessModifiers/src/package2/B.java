
package package2;

import package1.A;


public class B {
    public static void main(String[] args) {
        A ob = new A();
        //ob.Add();//We can not access Because of private 
        //ob.pro();//We can not access Because of protected 
        ob.pub();
    }
   
}
