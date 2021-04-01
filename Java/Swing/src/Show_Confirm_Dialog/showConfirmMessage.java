
package Show_Confirm_Dialog;
import javax.swing.JOptionPane;
public class showConfirmMessage {
    public static void main(String[] args) {
        int y = JOptionPane.showConfirmDialog(null,"Do you want to close this program ?","Close Program",JOptionPane.YES_NO_CANCEL_OPTION);
        if(y == JOptionPane.YES_OPTION){
            JOptionPane.showMessageDialog(null,"Thanks For Using This Program !");
        }else if(y != JOptionPane.NO_OPTION){
            System.exit(0);
        }else{
            JOptionPane.showMessageDialog(null,"Welcome To Swing !");
        }
    }
}
