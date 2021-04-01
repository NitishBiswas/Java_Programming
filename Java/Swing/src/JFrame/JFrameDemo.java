
package JFrame;
import java.awt.Color;
import javax.swing.JFrame;
import java.awt.Container;
//import javax.swing.ImageIcon;
public class JFrameDemo extends JFrame{
    
    private Container c;
    //private ImageIcon icon;
    
    JFrameDemo(){
        createFrame();
    }
    public void createFrame(){
        c = this.getContentPane();
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setBounds(50,50,400,300);
        this.setTitle("JFrame");
        this.setResizable(false);
        c.setBackground(Color.GRAY);
        //icon = new ImageIcon(getClass().getResource("img.png"));
        //this.setIconImage(icon.getImage());
    }
    
    public static void main(String[] args) {
        JFrameDemo frame = new JFrameDemo();
        frame.setVisible(true);
    }
}
