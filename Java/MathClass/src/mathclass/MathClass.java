/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mathclass;

/**
 *
 * @author NITISH BISWAS
 */
public class MathClass {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        int a = -10;
        a = Math.abs(a);
        System.out.println("Absulate Int = "+a);
        
        float b = -10.53f;
        b = Math.abs(b);
        b = Math.round(b);
        System.out.println("Absulate float = "+b);
        
        double c = 3,d = 3.33;
        System.out.println("Maximum = "+Math.max(c, d));
        System.out.println("Minimum = "+Math.min(c, d));
        
        int e=2,f=3;
        System.out.println("2^3 = "+Math.pow(e, f));
        
        int g = 16;
        System.out.println("Square root of "+g+" = "+Math.sqrt(g));
        System.out.println("Cube root of "+g+" = "+Math.cbrt(g));
        
        int sin = 90;
        System.out.println("Sin "+sin+" = "+Math.sin(sin));
        
        int h = 45;
        double j;
        j=Math.tan(h);
        System.out.println("tan "+h+" = "+j);
        double i = 0;
        System.out.println("cos "+i+" = "+Math.cos(i));
        
    }
    
}
