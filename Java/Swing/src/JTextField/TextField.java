
package JTextField;

import java.awt.Button;
import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.awt.Cursor;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.BorderFactory;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class TextField extends JFrame {
    
    private Container c;
    private JLabel l1,l2;
    private JTextField tf1,tf2;
    private Font f;
    private Button b1,b2;
    private Cursor cursor;
    
    TextField(){
        createFrame();
    }
    
    public void createFrame(){
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(400,300);
        this.setLocationRelativeTo(null);
        getRootPane().setBorder(BorderFactory.createMatteBorder(2,2,2,2, Color.PINK));
        c = this.getContentPane();
        c.setBackground(Color.GRAY);
        c.setLayout(null);
        
        f = new Font("Arial",Font.BOLD,20);
        
        l1 = new JLabel("UserName : ");
        l1.setBounds(30,30,200,50);
        l1.setFont(f);
        l1.setForeground(Color.BLACK);
        c.add(l1);
        
        tf1 = new JTextField();
        tf1.setBounds(150,30,200,50);
        tf1.setFont(f);
        tf1.setBackground(Color.LIGHT_GRAY);
        tf1.setForeground(Color.BLACK);
        //tf1.setBorder(BorderFactory.createMatteBorder(2,2,2,2, Color.yellow));
        //tf1.setBorder(null);
        c.add(tf1);
        
        l2 = new JLabel("Password : ");
        l2.setBounds(30,95,200,50);
        l2.setFont(f);
        l2.setForeground(Color.BLACK);
        c.add(l2);
        
        tf2 = new JTextField();
        tf2.setBounds(150,95,200,50);
        tf2.setFont(f);
        tf2.setBackground(Color.LIGHT_GRAY);
        tf2.setForeground(Color.BLACK);
        //tf2.setBorder(null);
        c.add(tf2);
        
        cursor = new Cursor(Cursor.HAND_CURSOR);
        b1 = new Button("Login");
        b1.setBounds(110,180,80,40);
        b1.setBackground(Color.black);
        b1.setForeground(Color.red);
        b1.setFont(f);
        b1.setCursor(cursor);
        c.add(b1);
        
        b2 = new Button("Clear");
        b2.setBounds(200,180,80,40);
        b2.setBackground(Color.black);
        b2.setForeground(Color.red);
        b2.setFont(f);
        b2.setCursor(cursor);
        c.add(b2);
        
        b1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                String s = tf1.getText();
                tf2.setText(s);
            }
        });
    }
    
    
    
    public static void main(String[] args) {
        TextField frame = new TextField();
        frame.setVisible(true);
    }
}
