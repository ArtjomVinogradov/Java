//Artjom Vinogradov
import java.io.*;
import javax.swing.JOptionPane;
public class h7 {


	public static void main(String[] args) {
       
int arv = 0;

        while(arv == 0){
           

        try{
            liitmine(); 
            arv=1;
        }catch(Exception e)  {
            System.out.println("Kontrolli sisestust");
        }
  
        }


    }

public static void liitmine() {
    int  n1, n2;
    String inputString,inputString2;

    inputString = JOptionPane.showInputDialog("Enter an integer number or enter -1 to stop.");
    n1 = Integer.parseInt(inputString);
    inputString2 = JOptionPane.showInputDialog("Enter an integer number or enter -1 to stop.");
    n2 = Integer.parseInt(inputString2);

    int sum = n1+n2;

   
    
    JOptionPane.showMessageDialog(null, "The summa of this numbers is: " + sum + ".");
}

}




