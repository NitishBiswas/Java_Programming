
package Problem_2;

public class Circle extends Shape {
    Circle(double r){
        super(r,r);
    }
    @Override
    void area(){
        double result = 3.1416 * r1*r2;
        System.out.println("Circle : "+result);
    }
}
