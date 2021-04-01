
package LoginFrame;

import java.awt.Color;
import java.awt.Container;
import java.awt.Cursor;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class LoginFrameDemo extends JFrame{
    
    private Container c;
    private JLabel l1,l2;
    private JTextField tf;
    private JPasswordField pf;
    private JButton btn1,btn2;
    private Font f;
    private Cursor cursor;
    private ImageIcon img1,img2;
    
    LoginFrameDemo(){
        createFrame();
    }
    public void createFrame(){
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(400,300);
        this.setLocationRelativeTo(null);
        this.setTitle("Login System");
        c = this.getContentPane();
        c.setBackground(Color.black);
        c.setLayout(null);
        
        f = new Font("Arial",Font.BOLD,18);
        
        l1 = new JLabel("UserName : ");
        l1.setBounds(30,30,150,50);
        l1.setForeground(Color.CYAN);
        l1.setFont(f);
        c.add(l1);
        
        tf = new JTextField();
        tf.setBounds(160,30,160,50);
        tf.setBackground(Color.black);
        tf.setForeground(Color.CYAN);
        tf.setBorder(BorderFactory.createMatteBorder(0,0,1,0, Color.CYAN));
        tf.setFont(f);
        c.add(tf);
        
        l2 = new JLabel("Password : ");
        l2.setBounds(30,100,150,50);
        l2.setForeground(Color.CYAN);
        l2.setFont(f);
        c.add(l2);
        
        pf = new JPasswordField();
        pf.setBounds(160,100,160,50);
        pf.setBackground(Color.black);
        pf.setForeground(Color.CYAN);
        pf.setBorder(BorderFactory.createMatteBorder(0,0,1,0, Color.CYAN));
        pf.setEchoChar('*');
        pf.setFont(f);
        c.add(pf);
        
        img1 = new ImageIcon(getClass().getResource("img1.jpeg"));
        img2 = new ImageIcon(getClass().getResource("img2.jpeg"));
        
        cursor = new Cursor(Cursor.HAND_CURSOR);
        
        btn1 = new JButton(img1);
        btn1.setBounds(50,180,120,50);
        btn1.setCursor(cursor);
        c.add(btn1);
        
        btn2 = new JButton(img2);
        btn2.setBounds(180,180,120,50);
        btn2.setCursor(cursor);
        c.add(btn2);
        
        btn1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                String UserName = tf.getText();
                String Password = pf.getText();
                if(UserName.equals("Nitish") && Password.equals("123123")){
                    dispose();
                    NewFrame frame = new NewFrame();
                    frame.setVisible(true);
                }else{
                    JOptionPane.showMessageDialog(null,"Wrong Input");
                }
            }
        });
        
        btn2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                tf.setText("");
                pf.setText("");
                
            }
        });
        
    }
    
    
    public static void main(String[] args) {
        LoginFrameDemo frame = new LoginFrameDemo();
        frame.setVisible(true);
    }
}
