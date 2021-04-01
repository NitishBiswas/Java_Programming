
package Problem_2;

public abstract class Shape {
    double r1,r2;
    Shape(double r1,double r2){
        this.r1 = r1;
        this.r2 = r2;
    }
    abstract void area();
}
