
package decimalformatation;

import java.text.DecimalFormat;

public class DecimalFormatation {

    public static void main(String[] args) {
        DecimalFormat ob = new DecimalFormat("0.00");
        double x = Math.PI;
        System.out.println("x = "+ob.format(x));//Java language
        System.out.printf("x = %.2f\n",x);//C language
    }
    
}
