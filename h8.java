//Artjom Vinogradov
import javax.swing.JOptionPane;
import java.io.*;
public class h8 {


	public static void main(String[] args) {
		int number, aNumber, bNumber, cNumbers;
        double sum;
        String inputString;

        inputString = JOptionPane.showInputDialog("Enter an integer number or enter 0 to stop.");
        number = Integer.parseInt(inputString);

        aNumber = number;
        bNumber = number;

        sum = 0;

        for (cNumbers = 1; number != 0; cNumbers++)
            {
                inputString = JOptionPane.showInputDialog("Enter an integer number or enter 0 to stop.");
                number = Integer.parseInt(inputString);
                

                if (number == 0)
                    break; 
                
                
                    sum += number;
            }

           
        JOptionPane.showMessageDialog(null, "The summa of this numbers is: " + bNumber * aNumber + ".");

        


    }
}

    
   



