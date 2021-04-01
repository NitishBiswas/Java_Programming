
package constructoroverloading;

public class AddClass {
    int a,b,c,d,result;

    public AddClass(int a,int b) {
        result = a+b;
    }
    public AddClass(int a,int b,int c) {
        result = a+b+c;
    }
    public AddClass(int a,int b,int c,int d) {
        result = a+b+c+d;
    }
    void result(){
        System.out.println(result);
    }
    
}
