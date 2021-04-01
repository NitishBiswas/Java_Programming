
package addtwonumber;
import javax.swing.JOptionPane;
public class AddTwoNumber {

    public static void main(String[] args) {
        String firstNumber,secondNumber;
        int number1,number2,result;
        firstNumber = JOptionPane.showInputDialog(null,"Enter First Number : ");
        secondNumber = JOptionPane.showInputDialog(null,"Enter Second Number : ");
        number1 = Integer.parseInt(firstNumber);
        number2 = Integer.parseInt(secondNumber);
        result = number1+number2;
        JOptionPane.showMessageDialog(null,"First Number : "+number1+"\nSecond Number : "+number2+"\nThe Summation is : "+result,"Result",JOptionPane.PLAIN_MESSAGE);
        System.exit(0);
    }
    
}
