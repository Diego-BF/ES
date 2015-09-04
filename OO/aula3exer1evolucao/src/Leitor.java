import java.util.Scanner;

/*
 *	Sintese
 *		Metodo: getString(), getFloat()
 */

public class Leitor {
	public static String getString(){
		Scanner ler = new Scanner(System.in);
		
		return ler.next();
	}
	
	public static float getFloat() {
		Scanner ler = new Scanner(System.in);
		
		return ler.nextFloat();
	}
}
