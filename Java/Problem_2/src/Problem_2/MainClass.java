
package Problem_2;

public class MainClass {
    public static void main(String[] args) {
        Shape shape;
        shape = new Triangle(10, 20);
        shape.area();
        shape = new Circle(10);
        shape.area();
    }
}
