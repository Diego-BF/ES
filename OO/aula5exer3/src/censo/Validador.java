package censo;

import java.util.InputMismatchException;

public class Validador
{
	public static float validaSalario()
	{
		float salario = -1;
		boolean sairRepeticao = true;
		
		do
		{
			System.out.println("Digite o salario, em reais, do habitante:");
			sairRepeticao = true;
			try
			{
				salario = Leitor.getFloat();
			} catch(InputMismatchException excecao)
			{
				System.out.println("\nEntrada invalida: digite apenas numeros e virgula (se necessario)");
				sairRepeticao = false;
			}
			
			if((salario < 0 || salario > 100000) && sairRepeticao)
			{
				System.out.println("\nEntrada invalida: o salario deve ser igual ou estar entre 0 (zero) e 100000 reais");
				sairRepeticao = false;
			}
		} while(!sairRepeticao);
		
		return salario;
	}
	
	private static int validaInt(String comando, String msgEntInv, int limSup)
	{
		int numero = -1;
		boolean sairRepeticao = true;
		
		do
		{
			sairRepeticao = true;
			System.out.println(comando);
			try
			{
				numero = Leitor.getInt();
			} catch (InputMismatchException excecao)
			{
				System.out.println("\nEntrada invalida: digite apenas numeros.");
				sairRepeticao = false;
			}
			if ((numero < 0 || numero > limSup) && sairRepeticao)
			{
				System.out.println(msgEntInv);
				sairRepeticao = false;
			} 
		} while (!sairRepeticao);
		return numero;
	}
	
	public static int validaIdade()
	{
		String comando = "Digite a idade do habitante:";
		String msgEntInv = "\nEntrada invalida: a idade deve ser igual ou estar entre 0 (zero) e 130 anos";
		
		return validaInt(comando, msgEntInv, 130);
	}
	
	public static int validaNumFilhos()
	{
		String comando = "Digite a quantidade de filhos do habitante:";
		String msgEntInv = "\nEntrada invalida: o numero de filhos deve ser igual ou estar entre 0 (zero) e 20";
		
		return validaInt(comando, msgEntInv, 20);
	}
	
	public static int validaNumHabitantes()
	{
		String comando = "Digite a quantidade de participantes da pesquisa:";
		String msgEntInv = "\nEntrada invalida: o numero de participantes deve ser igual ou estar entre 0 (zero) e 500 milhoes";
		
		return validaInt(comando, msgEntInv, 500000000);
	}
	
	public static char validaSexo()
	{
		char sexo;
		
		do
		{
			System.out.println("Informe o sexo do habitante.");
			System.out.println("Digite M caso seja masculino e F caso seja feminino");
			sexo = Leitor.getChar();
			if(sexo != 'M' && sexo != 'F')
			{
				System.out.println("Entrada invalida: digite apenas M ou F.");
			}
		} while(sexo != 'M' && sexo != 'F');
		
		return sexo;
	}
}
