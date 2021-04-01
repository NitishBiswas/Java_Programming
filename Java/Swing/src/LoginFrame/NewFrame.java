
package LoginFrame;

import java.awt.Color;
import java.awt.Container;
import javax.swing.JFrame;

public class NewFrame extends JFrame{
    
    private Container c;
    
    NewFrame(){
        createFrame();
    }
    
    public void createFrame(){
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(400,300);
        this.setLocationRelativeTo(null);
        this.setTitle("Login System");
        c = this.getContentPane();
        c.setBackground(Color.CYAN);
        c.setLayout(null);
    }
    public static void main(String[] args) {
        NewFrame frame = new NewFrame();
    }
}
