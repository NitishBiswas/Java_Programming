
package jdbc2_2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class NewClass {
    public Connection connector(){
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost/test2?serverTimezone=UTC","root","");
            System.out.println("Connected");
            Statement stm = con.createStatement();
            ResultSet re = stm.executeQuery("SELECT * FROM tab");
            while(re.next()){
                System.out.println(re.getString(1));
            }
            return con;
        }catch(Exception e){
            System.out.println(e);
            return null;
        }
    }
}
