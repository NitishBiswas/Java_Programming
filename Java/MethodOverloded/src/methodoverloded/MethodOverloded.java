
package methodoverloded;

public class MethodOverloded {
    
    void add(int a,int b){
        System.out.println(a+b);
    }
    void add(double a,double b){
        System.out.println(a+b);
    }
    void add(int a,int b,int c){
        System.out.println(a+b+c);
    }
    void add(){
        System.out.println("Nothing to Print");
    }

    public static void main(String[] args) {
        MethodOverloded ob1 = new MethodOverloded();
        MethodOverloded ob2 = new MethodOverloded();
        MethodOverloded ob3 = new MethodOverloded();
        MethodOverloded ob4 = new MethodOverloded();
        
        ob1.add(1,2);
        ob2.add(1.0,2.0);
        ob3.add(1,2,3);
        ob4.add();
    }
    
}
