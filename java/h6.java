//Artjom Vinogradov
import javax.swing.JOptionPane;
import java.io.*;
public class h6 {


	public static void main(String[] args) {
		int number, largestNumber, smallestNumber, amountOfNumbers;
        double sum, average;
        String inputString;

        inputString = JOptionPane.showInputDialog("Enter an integer number or enter -1 to stop.");
        number = Integer.parseInt(inputString);

        largestNumber = number;
        smallestNumber = number;

        sum = 0;

        for (amountOfNumbers = 1; number != -1; amountOfNumbers++)
            {
                inputString = JOptionPane.showInputDialog("Enter an integer number or enter -1 to stop.");
                number = Integer.parseInt(inputString);
                

                if (number == -1)
                    break;
                
                    if (number > largestNumber)
                    largestNumber = number;
                
                    if (number < smallestNumber)
                    smallestNumber = number;  
                
                
                    sum += number;
            }

            average = sum / amountOfNumbers;

        JOptionPane.showMessageDialog(null, "The smallest number is: " + smallestNumber + ".");

        JOptionPane.showMessageDialog(null, "The largest number is: " + largestNumber + ".");

        JOptionPane.showMessageDialog(null, "The average off all numbers is: " + average + ".");
        
        JOptionPane.showMessageDialog(null, "The summa of this numbers is: " + smallestNumber + largestNumber + ".");

        


    }
}




