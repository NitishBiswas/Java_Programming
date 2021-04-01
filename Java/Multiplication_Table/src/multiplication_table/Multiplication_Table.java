package multiplication_table;

import java.awt.Color;
import javax.swing.JFrame;
import java.awt.Container;
import java.awt.Cursor;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class Multiplication_Table extends JFrame {

    private Container c;
    private ImageIcon icon, image, image2;
    private JLabel imageLabel, imageLabel2, textLabel, textLabel1, textLabel2;
    private JCheckBox cb1, cb2;
    private ButtonGroup grp;
    private Font f, f2;
    private JTextField textField, textField2, textField3;
    private JTextArea ta1;
    private JButton btn;
    private Cursor cursor;
    private JScrollPane scroll;

    Multiplication_Table() {
        createFrame();
    }

    void createFrame() {

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(318, 750);
        this.setLocationRelativeTo(null);
        this.setLayout(null);
        c = this.getContentPane();
        c.setBackground(Color.GRAY);

        icon = new ImageIcon(getClass().getResource("icon.PNG"));
        this.setIconImage(icon.getImage());

        image = new ImageIcon(getClass().getResource("image.PNG"));
        imageLabel = new JLabel(image);
        imageLabel.setBounds(10, 10, image.getIconWidth(), image.getIconHeight());
        c.add(imageLabel);

        f = new Font("Arial", Font.BOLD + Font.ITALIC, 18);
        f2 = new Font("Arial", Font.BOLD, 20);

        grp = new ButtonGroup();

        cb1 = new JCheckBox("Single Table");
        cb1.setBounds(10, 230, 140, 30);
        cb1.setBackground(Color.GRAY);
        cb1.setFont(f);
        cb1.setForeground(Color.RED);
        //cb1.setSelected(true);
        c.add(cb1);

        cb2 = new JCheckBox("Multiple Table");
        cb2.setBounds(145, 230, 150, 30);
        cb2.setBackground(Color.GRAY);
        cb2.setFont(f);
        cb2.setForeground(Color.RED);
        c.add(cb2);

        grp.add(cb1);
        grp.add(cb2);

        checkBoxHandler checkBox = new checkBoxHandler();
        cb1.addActionListener(checkBox);
        cb2.addActionListener(checkBox);

        image2 = new ImageIcon(getClass().getResource("image2.PNG"));
        imageLabel2 = new JLabel(image2);
        imageLabel2.setBounds(10, 350, image2.getIconWidth(), image2.getIconHeight());
        c.add(imageLabel2);

        textLabel = new JLabel();
        textLabel.setFont(f);

        textLabel1 = new JLabel();
        textLabel1.setFont(f);

        textField = new JTextField("0");

        btn = new JButton("Clear");

        textLabel2 = new JLabel();
        textLabel2.setFont(f);

        textField2 = new JTextField("0");

        textField3 = new JTextField("0");

        ta1 = new JTextArea();
        ta1.setBackground(Color.GREEN);
        scroll = new JScrollPane(ta1);
        scroll.setBounds(0, 0, 0, 0);
        c.add(scroll);
        
        btn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                textField.setText("");
                textField2.setText("");
                textField3.setText("");
                ta1.setText("");
                
            }
        });

    }

    class checkBoxHandler implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {

            if (e.getSource() != cb2) {

                textLabel.setText("");
                textLabel1.setText("");
                textLabel2.setText("");
                imageLabel2.setBounds(0, 0, 0, 0);
                textField.setBounds(0, 0, 0, 0);
                textField.setText("0");
                textField2.setBounds(0, 0, 0, 0);
                textField2.setText("");
                textField3.setBounds(0, 0, 0, 0);
                textField3.setText("");
                ta1.setText("");
                btn.setBounds(0, 0, 0, 0);

                scroll.setBounds(10, 330, 280, 300);

                textLabel.setText("Enter Any Number ");
                textLabel.setBounds(20, 270, 180, 50);
                textLabel.setForeground(Color.RED);
                c.add(textLabel);

                textField.setBounds(185, 270, 85, 50);
                textField.setFont(f2);
                textField.setHorizontalAlignment(JTextField.CENTER);
                textField.setBackground(Color.GREEN);
                textField.setForeground(Color.RED);
                c.add(textField);

                cursor = new Cursor(Cursor.HAND_CURSOR);

                btn.setBounds(185, 640, 85, 50);
                btn.setCursor(cursor);
                btn.setBackground(Color.GREEN);
                btn.setFont(f);
                c.add(btn);

                textField.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {

                        scroll.setBounds(10, 330, 280, 300);
                        ta1.setText("");
                        int num = Integer.parseInt(textField.getText());
                        for (int i = 1; i <= 10; i++) {
                            int res = num * i;
                            String r = String.valueOf(res);
                            String in = String.valueOf(i);
                            String n = String.valueOf(num);

                            ta1.append("    " + n + " x " + in + " = " + r + "\n");
                            ta1.setFont(f);
                            ta1.setForeground(Color.RED);
                        }
                    }
                });

            } else {
                textLabel.setText("");
                imageLabel2.setBounds(0, 0, 0, 0);
                textField.setBounds(0, 0, 0, 0);
                textField.setText("0");
                textField2.setText("0");
                textField3.setText("0");
                ta1.setText("");
                scroll.setBounds(10, 330, 280, 300);

                btn.setBounds(0, 0, 0, 0);

                textLabel1.setText("From ");
                textLabel1.setBounds(20, 270, 80, 50);
                textLabel1.setForeground(Color.RED);
                c.add(textLabel1);

                textField2.setBounds(70, 270, 70, 50);
                textField2.setFont(f2);
                textField2.setHorizontalAlignment(JTextField.CENTER);
                textField2.setBackground(Color.GREEN);
                textField2.setForeground(Color.RED);
                c.add(textField2);

                textLabel2.setText("To ");
                textLabel2.setBounds(180, 270, 80, 50);
                textLabel2.setForeground(Color.RED);
                c.add(textLabel2);

                textField3.setBounds(210, 270, 70, 50);
                textField3.setFont(f2);
                textField3.setHorizontalAlignment(JTextField.CENTER);
                textField3.setBackground(Color.GREEN);
                textField3.setForeground(Color.RED);
                c.add(textField3);

                cursor = new Cursor(Cursor.HAND_CURSOR);

                btn.setBounds(185, 640, 85, 50);
                btn.setCursor(cursor);
                btn.setBackground(Color.GREEN);
                btn.setFont(f);
                c.add(btn);

                textField3.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {

                        scroll.setBounds(10, 330, 280, 300);
                        ta1.setText("");
                        int num1 = Integer.parseInt(textField2.getText());
                        int num2 = Integer.parseInt(textField3.getText());
                        if (num1 < num2) {
                            for (int j = num1; j <= num2; j++) {
                                for (int i = 1; i <= 10; i++) {
                                    int res = j * i;
                                    String r = String.valueOf(res);
                                    String in = String.valueOf(i);
                                    String n = String.valueOf(j);

                                    ta1.append("    " + n + " x " + in + " = " + r + "\n");
                                    ta1.setFont(f);
                                    ta1.setForeground(Color.RED);
                                }
                                ta1.append("\n\n");
                            }
                        } else {
                            JOptionPane.showMessageDialog(null, "Wrong Input !\nTry Again !", "Message", JOptionPane.WARNING_MESSAGE);
                        }
                    }
                });

                textField2.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        scroll.setBounds(10, 330, 280, 300);
                        ta1.setText("");
                        int num1 = Integer.parseInt(textField2.getText());
                        int num2 = Integer.parseInt(textField3.getText());
                        if (num1 < num2 && num2 > 0) {
                            for (int j = num1; j <= num2; j++) {
                                for (int i = 1; i <= 10; i++) {
                                    int res = j * i;
                                    String r = String.valueOf(res);
                                    String in = String.valueOf(i);
                                    String n = String.valueOf(j);

                                    ta1.append("    " + n + " x " + in + " = " + r + "\n");
                                    ta1.setFont(f);
                                    ta1.setForeground(Color.RED);
                                }
                                ta1.append("\n\n");
                            }
                        } else {
                            JOptionPane.showMessageDialog(null, "Wrong Input !\nTry Again !", "Message", JOptionPane.WARNING_MESSAGE);
                        }
                    }
                });

            }

        }

    }


}
