
package superkeyword;

public class B extends A {
    int x = 5;
    void display(){
        System.out.println("B class "+x);
        System.out.println("A class "+super.x);
    }
    @Override
    void add(){
        super.add();
        System.out.println("B");
    }
    B(){
        super();
        System.out.println("B constructor");
    }
    
}
