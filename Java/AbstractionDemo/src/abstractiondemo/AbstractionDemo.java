
package abstractiondemo;

import javax.swing.JOptionPane;

public abstract class AbstractionDemo {
    
    double r;
    AbstractionDemo(double r) {
        this.r = r;
    }
    public abstract void area();
    
}
class CircleArea extends AbstractionDemo {
    
    CircleArea(double r1){
        super(r1);
    }
    @Override
    public void area(){
        JOptionPane.showMessageDialog(null,"Area of a Circle is "+String.format("%.2f",Math.PI*r*r)+" Square Unit");
    }
    
}