
package jdbc1_1;

import java.sql.Connection;
import java.sql.DriverManager;

public class NewClass {
    public Connection Connector(){
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost/test1?serverTimezone=UTC","root","");
            System.out.println("Connected");
            return con;
        }catch(Exception e){
            System.out.println(e);
            return null;
        }
        
    }
}
