
package consonantvowel2;

import java.util.Scanner;

public class ConsonantVowel2 {

    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        char ch;
        System.out.print("Enter A Char : ");
        ch = input.next().charAt(0);
        if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'||ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U'){
            System.out.println(ch+" is a Vowel");
        }else{
            System.out.println(ch+" is a Consonant");
        }
    }
    
}
