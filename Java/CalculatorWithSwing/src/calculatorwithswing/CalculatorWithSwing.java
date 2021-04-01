
package calculatorwithswing;
import javax.swing.JOptionPane;
public class CalculatorWithSwing {

    public static void main(String[] args) {
        String choice,firstNumber,secondNumber;
        int number1,number2,n,result;
        choice = JOptionPane.showInputDialog(null,"Enter 1 for Addition( + ) \nEnter 2 for Subtraction( - )\nEnter 3 for Multiplication( * )\nEnter 4 for Division( / )\nEnter Your Choice : ","Taken Choice",JOptionPane.PLAIN_MESSAGE);
        n = Integer.parseInt(choice);
        firstNumber = JOptionPane.showInputDialog(null,"Enter First Number : ","Taken First Number",JOptionPane.PLAIN_MESSAGE);
        number1 = Integer.parseInt(firstNumber);
        secondNumber = JOptionPane.showInputDialog(null,"Enter Second Number : ","Taken Second Number",JOptionPane.PLAIN_MESSAGE);
        number2 = Integer.parseInt(secondNumber);
        
        switch(n){
            case 1:
                result = number1+number2;
                JOptionPane.showMessageDialog(null,"First Number = "+number1+"\nSecond Number = "+number2+"\nThe Summation is = "+result,"Result",JOptionPane.PLAIN_MESSAGE);
                break;
            case 2:
                result = number1-number2;
                JOptionPane.showMessageDialog(null,"First Number = "+number1+"\nSecond Number = "+number2+"\nThe Subtarction is = "+result,"Result",JOptionPane.PLAIN_MESSAGE);
                break;
            case 3:
                result = number1*number2;
                JOptionPane.showMessageDialog(null,"First Number = "+number1+"\nSecond Number = "+number2+"\nThe Multiplication is = "+result,"Result",JOptionPane.PLAIN_MESSAGE);
                break;
            case 4:
                result = number1/number2;
                JOptionPane.showMessageDialog(null,"First Number = "+number1+"\nSecond Number = "+number2+"\nThe Division is = "+result,"Result",JOptionPane.PLAIN_MESSAGE);
                break;
            default:JOptionPane.showMessageDialog(null,"Wrong Input!","Informations",JOptionPane.PLAIN_MESSAGE);
        }
        
        System.exit(0);
        
    }
    
}
