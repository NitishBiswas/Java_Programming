
package Show_Message_Dialog;

import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class showMessageDialog {
    
    public static void main(String[] args) {
        ImageIcon icon = new ImageIcon("img.png");
        JOptionPane.showMessageDialog(null,"Welcome To Swing!","Swing",JOptionPane.INFORMATION_MESSAGE);
        JOptionPane.showMessageDialog(null,"Welcome To Swing!","Swing",JOptionPane.PLAIN_MESSAGE,icon);//Icon missing
        
    }
}
