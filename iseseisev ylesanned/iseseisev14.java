//Artjom Vinogradov

public class iseseisev14 {
        public static void main(String[] args) {
        
                //Generating 3 car numbers
                int firstnumber = 65 + (int) (Math.random() * 26);
                int secondnumber = 65 + (int) (Math.random() * 26);
                int thirdnumber = 65 + (int) (Math.random()* 26 );

                //Generating 4 digits
                int digit1 = (int) (Math.random() * 10);
                int digit2 = (int) (Math.random() * 10);
                int digit3 = (int) (Math.random() * 10);
                int digit4 = (int) (Math.random() * 10);

                //Print
                System.out.println(" " + (char)firstnumber + (char)secondnumber + (char)thirdnumber + digit1 + digit2 + digit3 + digit4);
                

        }

}