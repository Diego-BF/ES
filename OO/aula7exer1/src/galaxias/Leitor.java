package galaxias;

import java.util.Scanner;

public class Leitor
{
	public static Integer getInteger(String string)
	{
		return new Integer(0).parseInt(string.trim());
	}
	
	public static String getString()
	{
		return new Scanner(System.in).nextLine().trim();
	}
}