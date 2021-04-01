
package Area;

import java.util.Scanner;

public class Area{
    
    public static void main(String[] args) {
        //Area of Triangle
        double base,height,result;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter base : ");
        base = input.nextDouble();
        
        System.out.print("Enter height : ");
        height = input.nextDouble();
        
        result = 0.5 * base * height;
        System.out.println("Area of Triangle : "+result);
        
        //Area of Square
        int width,result2;
        System.out.print("Enter width : ");
        width = input.nextInt();
        result2 = width * width;
        System.out.println("Area of Square : "+result2);
        
        //Area of Rectangular
        double height1,width1,result3;
        System.out.print("Enter height1 : ");
        height1 = input.nextDouble();
        
        System.out.print("Enter width1 : ");
        width1 = input.nextDouble();
        
        result3 = height1 * width1;
        System.out.println("Area of Rectangular ="+result3);
        
        //Area of Circle
        double radius,area;
        System.out.print("Enter Radius : ");
        radius = input.nextDouble();
        
        area = 3.1416 * radius * radius;
        System.out.println("Area of Circle = "+area);
        
    }
}