import java.util.InputMismatchException;

public class Validador
{

	public static String validaSexo(int qtdeHabitantes)
	{
		String sexo;
		boolean verifica;

		do
		{
			verifica = true;
			System.out.println("Informe o sexo do " + (qtdeHabitantes + 1) + "º habitante (M/F):");
			sexo = Leitor.getString().toUpperCase();
			if(sexo.isEmpty())
			{
				verifica = false;
				System.out.println("Sexo informado invalido: nada foi digitado.");
			} else if (!(sexo.equals("M")) && !(sexo.equals("F")))
			{
				verifica = false;
				System.out.println("Sexo informado invalido: Digite apenas M ou F.");
			}
		} while (!verifica);
		
		return sexo;
	}

	public static float validaSalario(int qtdeHabitantes)
	{
		float salario = 0f;
		boolean verifica;
		
		do
		{
			verifica = true;
			System.out.println("Informe o salario do " + (qtdeHabitantes + 1) + "º habitante:");
			try
			{
				salario = Leitor.getFloat();
			} catch (InputMismatchException excessao)
			{
				verifica = false;
				System.out.println("Salario informado invalido: digite apenas numeros e virgula (se necessario).");
			}
			if (salario < 0 && verifica)
			{
				verifica = false;
				System.out.println("Salario informado invalido: nao pode ser menor que 0 (zero) reais.");
			}
		} while (!verifica);
		
		return salario;
	}
	
	public static int validaInt(int qtdeHabitantes, String complemento, int limite)
	{
		int inteiro = 0;
		boolean verifica;
		
		do
		{
			verifica = true;
			System.out.println("Informe " +complemento +" do " +(qtdeHabitantes + 1) +"º habitante:");
			try
			{
				inteiro = Leitor.getInt();
			} catch(InputMismatchException excessao)
			{
				verifica = false;
				System.out.println("Informacao invalida: digite apenas numeros.");
			}
			if (inteiro < 0 && verifica)
			{
				verifica = false;
				System.out.println("Informacao invalida: " +complemento +" nao pode ser menor que 0 (zero).");
			} else if(inteiro > limite)
			{
				System.out.println("Informacao invalida: " +complemento +" nao pode ser maior que " +limite +".");
			}
		} while (!verifica);
		
		return inteiro;
	}
	
	public static int validaNumFilhos(int qtdeHabitantes)
	{
		return validaInt(qtdeHabitantes, "o numero de filhos", 30);
	}
	
	public static int validaIdade(int qtdeHabitantes)
	{
		return validaInt(qtdeHabitantes, "a idade, em anos completos,", 130);
	}

}
