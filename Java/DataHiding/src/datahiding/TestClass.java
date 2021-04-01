
package datahiding;

import javax.swing.JOptionPane;

public class TestClass {
    public static void main(String[] args) {
        DataHiding test = new DataHiding();
        test.setName("Nitish");
        test.setRoll(05);
        test.setGPA(4.00);
        
        JOptionPane.showMessageDialog(null,"Name : "+test.getName()+"\nRoll : "+test.getRoll()+"\nGPA : "+test.getGPA(),"Result Info",JOptionPane.INFORMATION_MESSAGE);
    }
}
