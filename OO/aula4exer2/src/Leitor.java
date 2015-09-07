import java.util.Scanner;

public class Leitor {
	public static String getString() {
		Scanner ler = new Scanner(System.in);
		return ler.nextLine();
	}
	
	
	public static int getInt() {
		Scanner ler = new Scanner(System.in);
		return ler.nextInt();
	}
}
