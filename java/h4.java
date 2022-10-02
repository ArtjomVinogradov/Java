import java.util.Scanner;
public class h4 {
    public static void main(String[] args) {
		
		Scanner scanner = new Scanner (System.in); //kasutaja sisestus
		System.out.print("Kirjuta midagi mees: ");
		String tekst = scanner.nextLine();
		System.out.println(tekst.toUpperCase());
		System.out.println("tahtede arv: "+tekst.length());
		
		int count = 1;
		 
        for (int i = 0; i < tekst.length() - 1; i++)
        {
            if ((tekst.charAt(i) == ' ') && (tekst.charAt(i + 1) != ' '))
            {
                count++;
            }
        }
        System.out.println("Sonade arv: " + count);
		
		
	}

}



