
package jdbc4;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class Checking {
    public Connection connector(){
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost/college?serverTimezone=UTC","root","");
            Statement stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT * FROM student");
            while(rs.next()){
                String name = rs.getString("Name");
                int roll = rs.getInt("Roll");
                
                System.out.println(name+" "+roll);
            }
            return con;
        }catch(Exception e){
            System.out.println(e);
            return null;
        }
    }
}

class test{
    Checking c = new Checking();
    Connection con = null;
    test(){
        con = c.connector();
    }
    public static void main(String[] args) {
        test t = new test();
    }
}
