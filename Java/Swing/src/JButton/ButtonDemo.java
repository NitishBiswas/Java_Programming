
package JButton;

import java.awt.Color;
import java.awt.Container;
import java.awt.Cursor;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class ButtonDemo extends JFrame {
    
    private Container c;
    private JButton btn1,btn2;
    private ImageIcon img1,img2;
    private Cursor cursor;
    
    ButtonDemo(){
        createFrame();
    }
    public void createFrame(){
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(300,200);
        this.setLocationRelativeTo(null);
        c = this.getContentPane();
        c.setLayout(null);
        c.setBackground(Color.gray);
        this.setResizable(false);
        
        img1 = new ImageIcon(getClass().getResource("img1.jpeg"));
        img2 = new ImageIcon(getClass().getResource("img2.jpeg"));
        
        cursor = new Cursor(Cursor.HAND_CURSOR);
        
        btn1 = new JButton(img1);
        btn1.setBounds(20,40,120,50);
        btn1.setCursor(cursor);
        c.add(btn1);
        
        btn2 = new JButton(img2);
        btn2.setBounds(155,40,120,50);
        btn2.setCursor(cursor);
        c.add(btn2);
        
        Handler handler = new Handler();
        btn1.addActionListener(handler);
    }
    
    class Handler implements ActionListener{
    
    public void actionPerformed(ActionEvent e){
        JOptionPane.showMessageDialog(null,"Successfully Login","Info",JOptionPane.INFORMATION_MESSAGE);
    }
}
    
    public static void main(String[] args) {
        ButtonDemo frame = new ButtonDemo();
        frame.setVisible(true);
    }
}
