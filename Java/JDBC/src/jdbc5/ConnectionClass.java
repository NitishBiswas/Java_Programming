
package jdbc5;

import java.sql.Connection;
import java.sql.DriverManager;

public class ConnectionClass {
    public Connection connector(){
        try{
            String url = System.getProperty("user.dir");
            Class.forName("org.apache.derby.jdbc.EmbeddedDriver");
            Connection con = DriverManager.getConnection("jdbc:derby:"+url+"\\DB2Table","nitish","nitish");
            //System.out.println("Connected");
            return con;
        }catch(Exception e){
            e.printStackTrace();
            return null;
        }
    }
}
