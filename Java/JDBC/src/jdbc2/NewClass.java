
package jdbc2;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;

public class NewClass {
    public static Connection connect(){
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost/student?serverTimezone=UTC","root","");
            Statement stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT * FROM user WHERE name like 'N%' ");
            while(rs.next()){
                String name = rs.getString("Name");
                JOptionPane.showMessageDialog(null,name);
            }
            JOptionPane.showMessageDialog(null, "Connected");
            return con;
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
           return null; 
        }
    }
    
}

