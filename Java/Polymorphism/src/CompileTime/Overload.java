
package CompileTime;

public class Overload {
    Overload(){
        System.out.println("Constructor Overloading");
    }
    Overload(int a,int b){
        System.out.println(a+b);
    }
    Overload(String n){
        System.out.println(n);
    }
}
