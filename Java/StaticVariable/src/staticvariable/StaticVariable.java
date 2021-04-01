
package staticvariable;
import javax.swing.JOptionPane;
public class StaticVariable {

    public static void main(String[] args) {
        Student student1 = new Student();
        Student student2 = new Student();
        Student student3 = new Student();
        String st1 = student1.setName("Nitish Biswas");
        String st2 = student2.setName("MD. Musha");
        String st3 = student3.setName("Atiq");
        int r1 = student1.setRoll(5);
        int r2 = student2.setRoll(10);
        int r3 = student3.setRoll(16);
        JOptionPane.showMessageDialog(null,"Name : "+st1+"\nRoll : "+r1+"\nBatch : "+Student.batch+"\nName : "+st2+"\nRoll : "+r2+"\nBatch : "+Student.batch+"\nName : "+st3+"\nRoll : "+r3+"\nBatch : "+Student.batch);
    }
    
}
