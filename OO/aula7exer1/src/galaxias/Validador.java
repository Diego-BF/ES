package galaxias;

public class Validador
{
	public static Boolean validaInteger(Integer numero, Integer limInf, Integer limSup)
	{
		Boolean numeroValido = true;
		
		if(numero < limInf || numero > limSup)
		{
			numeroValido = false;
		}
		
		return numeroValido;
	}
	
	public static Boolean validaString(String string)
	{
		return !string.trim().isEmpty();
	}
}