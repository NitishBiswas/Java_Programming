
package automatictypecasting;

public class AutomaticTypeCasting {
    
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
        AutomaticTypeCasting ob1 = new AutomaticTypeCasting();
        AutomaticTypeCasting ob2 = new AutomaticTypeCasting();
        AutomaticTypeCasting ob3 = new AutomaticTypeCasting();
        AutomaticTypeCasting ob4 = new AutomaticTypeCasting();
        
        ob1.add(1,2);
        ob2.add(1.0,2.0);
        ob3.add(1,2,3);
        ob4.add();
    }
    
}
