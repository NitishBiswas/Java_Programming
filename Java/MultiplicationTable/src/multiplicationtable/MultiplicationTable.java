package multiplicationtable;

import java.util.Scanner;

public class MultiplicationTable{
    
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        int n;
        System.out.print("Enter Number : ");
        n = input.nextInt();
        
        for (int i = 1; i <= 10; i++) {
            System.out.println(n+" "+"X"+" "+i+" ="+i*n);
        }
        
    }
}
