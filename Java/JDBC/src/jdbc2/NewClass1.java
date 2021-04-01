
package jdbc2;

import java.sql.Connection;

public class NewClass1 {
    Connection con = null;
    NewClass1(){
        con = NewClass.connect();
    }
    public static void main(String[] args) {
        NewClass1 ne = new NewClass1();
    }
}
