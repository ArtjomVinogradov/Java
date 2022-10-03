import java.util.Scanner;
import javax.swing.JOptionPane;

class Main {
  public static void main(String[] args) {

    char operator;
    Double number1, number2, result;
    String inputString;

    // create an object of Scanner class
    Scanner input = new Scanner(System.in);

    // ask users to enter operator
    inputString = JOptionPane.showInputDialog("Choose an operator: +, -, *, or /");
    operator = input.next().charAt(0);

    // ask users to enter numbers
    inputString = JOptionPane.showInputDialog("Enter first number");
    number1 = input.nextDouble();

    inputString = JOptionPane.showInputDialog("Enter second number");
    number2 = input.nextDouble();

    switch (operator) {

      // performs addition between numbers
      case '+':
        result = number1 + number2;
        JOptionPane.showMessageDialog(null, number1 + " + " + number2 + " = " + result);
        break;

      // performs subtraction between numbers
      case '-':
        result = number1 - number2;
        JOptionPane.showMessageDialog(null, number1 + " - " + number2 + " = " + result);
        break;

      // performs multiplication between numbers
      case '*':
        result = number1 * number2;
        JOptionPane.showMessageDialog(null, number1 + " * " + number2 + " = " + result);
        break;

      // performs division between numbers
      case '/':
        result = number1 / number2;
        JOptionPane.showMessageDialog(null, number1 + " / " + number2 + " = " + result);
        break;

      default:
      JOptionPane.showMessageDialog(null, "Invalid operator!");
        break;
    }

    input.close();
  }
}