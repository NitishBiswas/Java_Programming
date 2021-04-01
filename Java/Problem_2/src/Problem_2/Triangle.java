
package Problem_2;

public class Triangle extends Shape {
    Triangle(double r1,double r2){
        super(r1,r2);
    }
    @Override
    void area(){
        double result = 0.5 * r1*r2;
        System.out.println("Triangle : "+result);
    }
}
