
package newpackage;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class NewClass {
    
    public Connection connector(){
        String url = System.getProperty("user.dir");
        try{
            Class.forName("org.apache.derby.jdbc.EmbeddedDriver");
            Connection con = DriverManager.getConnection("jdbc:derby:"+url+"\\Student","nitish","nitish");
            System.out.println("Connected");
            Statement stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT * FROM Login");
            while(rs.next()){
                String name = rs.getString("UserName");
                String pass = rs.getString("Password");
                System.out.println("UserName : "+name+"\nPassWord : "+pass);
            }
            return con;
        }catch(Exception e){
            System.out.println(e);
            return null;
        }
    }
}

class test{
    Connection con = null;
    test(){
        NewClass n = new NewClass();
        con = n.connector();
    }
    
    public static void main(String[] args) {
        test t = new test();
    }
}
