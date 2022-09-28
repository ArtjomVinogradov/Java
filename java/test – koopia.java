//Artjom Vinogradov
import javax.swing.JOptionPane;
import java.io.*;
public class h6 {


	public static void main(String[] args) {
		Scanner stdin = new Scanner(System.in);
        int largestNumber = Integer.MIN_VALUE;
        int smallestNumber = Integer.MAX_VALUE;
        int number;
        double sum = 0;
        int amountOfNumbers = 0;
        do {
            System.out.print("Enter an integer, or enter -99 to stop: ");
            number = stdin.nextInt();
            if (number == -99) {
                break;
            }
            if (number > largestNumber) {
                largestNumber = number;
            }
            if (number < smallestNumber) {
                smallestNumber = number;  
            }
            sum += number;
            amountOfNumbers++;
        } while (number != -99);

        if (amountOfNumbers > 0) {
            double average = sum / amountOfNumbers;
            System.out.printf("The smallest number is: %d.%n", smallestNumber);
            System.out.printf("The largest number is: %d.%n", largestNumber);
            System.out.printf("The average of all numbers is: %.4f.%n", average);
        }
    }
}




