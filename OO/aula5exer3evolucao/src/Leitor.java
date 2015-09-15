import java.util.Scanner;

public class Leitor {

	public static int getInt(){
		Scanner ler = new Scanner(System.in);
		
		return ler.nextInt();
	}
	
	public static float getFloat(){
		Scanner ler = new Scanner(System.in);
				
		return ler.nextFloat();
	}
	
	public static String getString(){
		Scanner ler = new Scanner(System.in);
		
		return ler.next();
	}
	
}
