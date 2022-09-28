import java.util.Scanner;
public class h5 {


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter Two Numbers (Press Enter after each):");	
		Scanner scanner = new Scanner (System.in); //kasutaja sisestus
		int number = scanner.nextInt();
		int number2 = scanner.nextInt();
		
		sharing(number, number2);

	}
	static void sharing (int v1, int v2) {
		double answer = (double)v1 / (double)v2;
		System.out.println("Sharing answer "+ answer);
		
 	

}

}
