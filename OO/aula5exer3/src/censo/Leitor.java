package censo;

import java.util.Scanner;

public class Leitor
{
	public static int getInt()
	{
		Scanner ler = new Scanner(System.in);
		
		return ler.nextInt();
	}
	
	public static float getFloat()
	{
		Scanner ler = new Scanner(System.in);
		
		return ler.nextFloat();
	}
	
	public static char getChar()
	{
		Scanner ler = new Scanner(System.in);
		
		return ler.nextLine().toUpperCase().charAt(0);
	}
}
