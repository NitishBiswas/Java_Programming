
package jdbc3;

import java.sql.Connection;
import java.sql.DriverManager;

public class NewClass {
    public static Connection connector(){
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost/login?serverTimezone=UTC","root","");
            
            return con;
        }catch(Exception e){
            System.out.println(e);
            return null;
        }
    }
}
