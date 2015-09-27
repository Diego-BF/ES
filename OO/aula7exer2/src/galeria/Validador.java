package galeria;

public class Validador
{
	public static boolean validaInteger(Integer numero, Integer limInf)
	{
		boolean numeroValido = true;
		
		if(numero <= limInf)
		{
			numeroValido = false;
		}
		
		return numeroValido;
	}
	
	public static boolean validaFloat(Float numero)
	{
		boolean numeroValido = true;
		
		if(numero < 0)
		{
			numeroValido = false;
		}
		
		return numeroValido;
	}
	
	public static boolean validaString(String string)
	{
		return !string.trim().isEmpty();
	}
	
	public static boolean validaOpcaoMenu(String string)
	{
		boolean opcaoValida = true;
		
		if((!string.equals("1") && !string.equals("2") && !string.equals("3") && !string.equals("4") 
				&& !string.equals("5")))
		{
			opcaoValida = false;
		}
		
		return opcaoValida;
	}
}