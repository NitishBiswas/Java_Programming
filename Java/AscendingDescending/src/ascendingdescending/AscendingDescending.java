
package ascendingdescending;

import java.util.Scanner;

public class AscendingDescending {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n,choice,temp;
        System.out.print("How many numbers do you want to insert : ");
        n = input.nextInt();
        int[] num = new int[n];
        System.out.print("Enter the numbers : ");
        for (int i = 0; i < n; i++) {
            num [i] = input.nextInt();
        }
        System.out.println("Press 1 for ascending : ");
        System.out.println("Press 2 for descending : ");
        System.out.print("Enter your choice : ");
        choice = input.nextInt();
        switch(choice){
            case 1:
                for(int i=0;i<n;i++){
                    for(int j=i+1;j<n;j++){
                        if(num[j]<num[i]){
                            temp=num[i];
                            num[i]=num[j];
                            num[j]=temp;
                        }
                    }
                }
                System.out.print("Ascending :");
                for (int i = 0; i < n; i++) {
                    System.out.print(" "+num[i]);
                }
                break;
            case 2:
                for(int i=0;i<n;i++){
                    for(int j=i+1;j<n;j++){
                        if(num[j]>num[i]){
                            temp=num[i];
                            num[i]=num[j];
                            num[j]=temp;
                        }
                    }
                }
                System.out.print("Descending :");
                for (int i = 0; i < n; i++) {
                    System.out.print(" "+num[i]);
                }
                break;    
        }
        
    }
    
}
