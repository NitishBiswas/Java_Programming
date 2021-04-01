
package consonantvowel;

import java.util.Scanner;
public class ConsonantVowel {

    static Scanner input = new Scanner(System.in);
    public static void main(String[] args) {
        char ch;
        System.out.print("Enter A Char : ");
        ch = input.next().charAt(0);
        switch(ch){
            case 'a':
                System.out.println(ch+" is a Vowel");
                break;
            case 'e':
                System.out.println(ch+" is a Vowel");
                break;
            case 'i':
                System.out.println(ch+" is a Vowel");
                break;
            case 'o':
                System.out.println(ch+" is a Vowel");
                break;
            case 'u':
                System.out.println(ch+" is a Vowel");
                break;
            case 'A':
                System.out.println(ch+" is a Vowel");
                break;
            case 'E':
                System.out.println(ch+" is a Vowel");
                break;
            case 'I':
                System.out.println(ch+" is a Vowel");
                break;
            case 'O':
                System.out.println(ch+" is a Vowel");
                break;
            case 'U':
                System.out.println(ch+" is a Vowel");
                break;
            default:
                System.out.println(ch+" is a Consonant");
        }
    }
    
}
