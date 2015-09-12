package cadastro;

import java.util.Scanner;

public class Leitor
{
	public static String getString()
	{
		Scanner ler = new Scanner(System.in);
		
		return ler.next();
	}
	
	public static char getChar()
	{
		Scanner ler = new Scanner(System.in);
		
		return ler.next().toUpperCase().charAt(0);
	}
}
