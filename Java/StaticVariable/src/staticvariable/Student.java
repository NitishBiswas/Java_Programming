
package staticvariable;

class Student {
    String name;
    int roll;
    static int batch = 51;
    
    String setName(String n){
        name = n;
        return name;
    }
    
    int setRoll(int r){
        roll = r;
        return roll;
    }
    
}