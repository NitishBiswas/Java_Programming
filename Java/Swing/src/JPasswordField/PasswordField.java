
package JPasswordField;

import java.awt.Color;
import java.awt.Container;
import javax.swing.JFrame;
import javax.swing.JPasswordField;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JCheckBox;
import javax.swing.JLabel;
public class PasswordField extends JFrame {
    
    private Container c;
    private JPasswordField pf;
    private Font f;
    private JCheckBox ch;
    private JLabel l;
    
    PasswordField(){
        createFrame();
    }
    
    public void createFrame(){
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(300,200);
        this.setTitle("Password Field");
        this.setLocationRelativeTo(null);
        c = this.getContentPane();
        c.setBackground(Color.gray);
        c.setLayout(null);
        
        f = new Font("Arial",Font.BOLD,20);
        
        pf = new JPasswordField();
        pf.setBounds(50,50,150,40);
        pf.setHorizontalAlignment(JPasswordField.CENTER);
        pf.setFont(f);
        pf.setEchoChar('*');
        c.add(pf);
        
        ch = new JCheckBox();
        ch.setBounds(50,100,20,20);
        c.add(ch);
        
        l = new JLabel("Show");
        l.setBounds(80,100,100,20);
        c.add(l);
        
        ch.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                if(ch.isSelected()){
                    pf.setEchoChar((char)0);
                }else{
                    pf.setEchoChar('*');
                }
            }
        });
    }
    
    public static void main(String[] args) {
        PasswordField frame = new PasswordField();
        frame.setVisible(true);
    }
}
