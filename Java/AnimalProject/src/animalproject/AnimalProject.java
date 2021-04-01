
package animalproject;
import javax.swing.JOptionPane;
public class AnimalProject {

    public static void main(String[] args) {
       Animal animal1 = new Animal();
       String name1 = animal1.name("Dog");
       float wight1 = animal1.wight(55);
       JOptionPane.showMessageDialog(null,"Animal Name : "+name1+"\nWight = "+wight1+" kg","Output For Animal 1",JOptionPane.PLAIN_MESSAGE);
       
       Animal animal2 = new Animal();
       String name2 = animal2.name("Cow");
       float wight2 = animal2.wight(120);
       JOptionPane.showMessageDialog(null,"Animal Name : "+name2+"\nWight = "+wight2+" kg","Output For Animal 2",JOptionPane.PLAIN_MESSAGE);
       
       System.exit(0);
    }
    
}
