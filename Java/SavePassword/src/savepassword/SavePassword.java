
package savepassword;

import java.sql.Connection;
import java.sql.DriverManager;

public class SavePassword {
    
    public static Connection connector(){
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost/college1?serverTimezone=UTC","root","");
            System.out.println("Connected");
            return con;
        } catch (Exception e) {
            System.out.println(e);
            return null;
        }
        
    }
    
    public static void main(String[] args) {
        connector();
    }
    
}
