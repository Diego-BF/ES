package sapataria;

import java.util.InputMismatchException;

public class Visao
{
	public static String lerString(String msg)
	{
		String string;
		System.out.println(msg);
		
		//validacao
		do
		{
			string = Leitor.getString();
			
			if(!Validador.validaString(string))
			{
				System.out.println("\nEntrada invalida: nada foi digitado");
			}
		} while(!Validador.validaString(string));
		
		return string;
	}
	
	public static int lerInt(String msg, int limInf, int limSup)
	{
		int numero = 0;
		boolean sairLoop = true;
		
		//validacao
		do {
			sairLoop = true;
			try
			{
				numero = Leitor.getInt();
			} catch(InputMismatchException excecao)
			{
				System.out.println("\nEntrada invalida: apenas numeros devem ser digitados");
				sairLoop = false;
			}
			
			if(sairLoop && !Validador.validaInt(numero, limInf, limSup))
			{
				System.out.println("\nEntrada invalida: o numero inserido nao pode ser menor que "
						+limInf +" e maior que " +limSup);
				sairLoop = false;
			}
		} while (!sairLoop);
		
		return numero;
	}
}
