package multiplication_table;

import java.awt.Color;
import java.awt.Container;
import java.awt.Cursor;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.Action;
import javax.swing.JButton;
import javax.swing.JOptionPane;

public class MultiplicationTable extends JFrame {

    private Container c;
    private ImageIcon icon;
    private JLabel jl1, jl2;
    private JTextField tf;
    private JPasswordField pf;
    private Font f;
    private JButton btn1, btn2;
    private Cursor cursor;

    MultiplicationTable() {
        createFrame();
    }

    void createFrame() {
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(350, 250);
        this.setLocationRelativeTo(null);
        this.setLayout(null);

        icon = new ImageIcon(getClass().getResource("icon.PNG"));
        this.setIconImage(icon.getImage());

        c = this.getContentPane();
        c.setBackground(Color.GRAY);

        f = new Font("Arial", Font.BOLD + Font.ITALIC, 18);

        jl1 = new JLabel("UserName ");
        jl1.setBounds(40, 30, 150, 50);
        jl1.setBackground(Color.GRAY);
        jl1.setForeground(Color.RED);
        jl1.setFont(f);
        c.add(jl1);

        tf = new JTextField();
        tf.setBounds(150, 30, 150, 50);
        tf.setBackground(Color.GREEN);
        tf.setForeground(Color.RED);
        tf.setFont(f);
        c.add(tf);

        jl2 = new JLabel("Password ");
        jl2.setBounds(40, 90, 150, 50);
        jl2.setBackground(Color.GRAY);
        jl2.setForeground(Color.RED);
        jl2.setFont(f);
        c.add(jl2);

        pf = new JPasswordField();
        pf.setBounds(150, 90, 150, 50);
        pf.setBackground(Color.GREEN);
        pf.setForeground(Color.RED);
        pf.setEchoChar('N');
        pf.setFont(f);
        c.add(pf);

        cursor = new Cursor(Cursor.HAND_CURSOR);

        btn1 = new JButton("Login");
        btn1.setBounds(60, 150, 100, 50);
        btn1.setBackground(Color.black);
        btn1.setForeground(Color.RED);
        btn1.setFont(f);
        btn1.setCursor(cursor);
        c.add(btn1);

        btn2 = new JButton("Cancel");
        btn2.setBounds(170, 150, 100, 50);
        btn2.setBackground(Color.black);
        btn2.setForeground(Color.RED);
        btn2.setFont(f);
        btn2.setCursor(cursor);
        c.add(btn2);

        btn1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String un = tf.getText();
                String p = pf.getText();
                if (un.equals("Nitish") && p.equals("diu")) {
                    dispose();
                    Multiplication_Table frame = new Multiplication_Table();
                    frame.setVisible(true);
                }else{
                    JOptionPane.showMessageDialog(null,"Invalid username or password !","Wrong Input !",JOptionPane.WARNING_MESSAGE);
                }
            }
        });
        
        btn2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });

    }

    public static void main(String[] args) {
        MultiplicationTable jframe = new MultiplicationTable();
        jframe.setVisible(true);

    }
}
