
package Hierarchical_Inheritance;

public class University {
    String name;
    int fees;
    int shift;
    void setInfo(String n,int f,int s){
        name = n;
        fees = f;
        shift = s;
    }
    void display(){
        System.out.println("Name : "+name);
        System.out.println("Fees : "+fees);
        System.out.println("Shift : "+shift);
    }
}
class CSE extends University {
    String Dept_Name;
    int batch;
    void setInfo(String n,int f,int s,String d,int b){
        super.name = n;
        super.fees = f;
        super.shift = s;
        Dept_Name = d;
        batch = b;
    }
    @Override
    void display(){
        super.display();
        System.out.println("Dept. Name : "+Dept_Name);
        System.out.println("Batch : "+batch);
    }
}
class EETE extends University {
    String Dept_Name;
    int batch;
    void setInfo(String n,int f,int s,String d,int b){
        super.name = n;
        super.fees = f;
        super.shift = s;
        Dept_Name = d;
        batch = b;
    }
    @Override
    void display(){
        super.display();
        System.out.println("Dept. Name : "+Dept_Name);
        System.out.println("Batch : "+batch);
    }
}