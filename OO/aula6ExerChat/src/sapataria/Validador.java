package sapataria;

public class Validador
{
	public static boolean validaString(String string)
	{
		return !string.isEmpty();
	}
	
	public static boolean validaInt(int numero, int limInf, int limSup)
	{
		boolean numValido = true;
		
		if(numero < limInf || numero > limSup)
		{
			numValido = false;
		}
		
		return numValido;
	}
}
