
package J_lable;
import java.awt.Color;
import javax.swing.JFrame;
import java.awt.Container;
import javax.swing.JLabel;
import java.awt.Font;
public class J_Lable extends JFrame {
    
    private Container c;
    private JLabel userLabel,passLabel;
    private Font f;
    
    J_Lable(){
        createFrame();
    }
    public void createFrame(){
        c = this.getContentPane();
        c.setBackground(Color.GRAY);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(400, 300);
        this.setLocationRelativeTo(null);
        
        f = new Font("Arial",Font.BOLD+Font.ITALIC,18);
        
        c.setLayout(null);
        userLabel = new JLabel();
        userLabel.setText("UserName : ");
        userLabel.setFont(f);
        userLabel.setBounds(50,30,150,50);
        userLabel.setForeground(Color.RED);
        userLabel.setBackground(Color.yellow);
        userLabel.setOpaque(true);
        c.add(userLabel);
        
        passLabel = new JLabel();
        passLabel.setText("Password : ");
        passLabel.setFont(f);
        passLabel.setBounds(50,70,150,50);
        passLabel.setForeground(Color.RED);
        c.add(passLabel);
       
    }
    
    public static void main(String[] args) {
        J_Lable frame = new J_Lable();
        frame.setVisible(true);
    }
}

