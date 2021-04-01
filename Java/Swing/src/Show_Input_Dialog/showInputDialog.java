
package Show_Input_Dialog;

import javax.swing.JOptionPane;

public class showInputDialog {
    public static void main(String[] args) {
        String fn = JOptionPane.showInputDialog(null,"Enter Your Frist Name","Frist Name",JOptionPane.INFORMATION_MESSAGE);
        String ln = JOptionPane.showInputDialog(null,"Enter Your Last Name","Last Name",JOptionPane.INFORMATION_MESSAGE);
        JOptionPane.showMessageDialog(null,fn+" "+ln,"Full Name",JOptionPane.INFORMATION_MESSAGE);
        
    }
}
