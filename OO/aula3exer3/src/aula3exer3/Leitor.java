package aula3exer3;

import java.util.Scanner;

/*
 *	Síntese:
 *		Metodo: getInt(), getString(), get Float()
 */

public class Leitor {
	public static int getInt() {
		Scanner ler = new Scanner(System.in);
		
		return ler.nextInt();
	}
	
	public static String getString() {
		Scanner ler = new Scanner(System.in);
		
		return ler.nextLine();
	}
	
	public static float getFloat() {
		Scanner ler = new Scanner(System.in);
		
		return ler.nextFloat();
	}
}
