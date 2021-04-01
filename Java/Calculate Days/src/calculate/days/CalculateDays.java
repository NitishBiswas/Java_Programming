
package calculate.Days;

import java.util.Scanner;

public class CalculateDays{
   
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n,y,m,d,temp;
        System.out.print("Enter Total Days : ");
        n = input.nextInt();
        y=n/365;
        m=y*365;
        m=n-m;
        temp=m;
        m=m/30;
        d=m*30;
        d=temp-d;
        System.out.println("Year = "+y+'\n'+"Month = "+m+'\n'+"Days = "+d);
        System.out.println("");
    }
    
}