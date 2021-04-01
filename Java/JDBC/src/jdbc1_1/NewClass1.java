
package jdbc1_1;

import java.sql.Connection;

public class NewClass1 {
    NewClass n = new NewClass();
    Connection con = null;
    NewClass1(){
        con = n.Connector();
    }
    public static void main(String[] args) {
        NewClass1 newClass1 = new NewClass1();
    }
}
