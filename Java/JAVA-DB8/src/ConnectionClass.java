
import java.sql.Connection;
import java.sql.DriverManager;


public class ConnectionClass {
    public Connection connector(){
        try{
            Class.forName("org.apache.derby.jdbc.EmbeddedDriver");
            Connection con = DriverManager.getConnection("jdbc:derby:C:\\Users\\Nitish Biswas\\AppData\\Roaming\\NetBeans\\Derby\\Registration","nitish","nitish");
            System.out.println("Connected");
            return con;
        }catch(Exception e){
            System.out.println(e);
            return null;
        }
    }
}

