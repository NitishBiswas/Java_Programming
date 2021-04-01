
package jdbc1;

import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;

public class NewClass {
    public static Connection connect(){
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost/college?serverTimezone=UTC","root","");
            JOptionPane.showMessageDialog(null,"Connected");
            return con;
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
            return null;
        }
        
    }
}
