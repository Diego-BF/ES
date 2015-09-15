package censo;

import java.text.DecimalFormat;

public class Estatistica
{
	private static int menorIdade;
	private static float maiorSalario;
	private static int somaFilhos;
	private static int somaHomens;
	private static int somaHomensSup300;
	private static float somaSalarios;
	
	public static void cadastraDados(float salarios[], int numHabit)
	{
		Pessoa habitante;
		
		for(int aux = 0; aux < numHabit; ++aux)
		{
			habitante = new Pessoa(Validador.validaSalario(), Validador.validaIdade(),
					Validador.validaSexo(), Validador.validaNumFilhos());
			salarios[aux] = habitante.getSalario();
			
			if(aux != 0)
			{
				buscaMenorIdadeMaiorSoldo(habitante.getIdade(), habitante.getSalario());
			} else
			{
				menorIdade = habitante.getIdade();
				maiorSalario = habitante.getSalario();
			}
			//abaixo esta a organizacao dos dados obtidos
			somaFilhos = somaFilhos + habitante.getNumFilhos();
			somaSalarios = somaSalarios + habitante.getSalario();
			if(habitante.getSexo() == 'M')
			{
				somaHomens = somaHomens + 1;
				if(habitante.getSalario() > 300f)
				{
					somaHomensSup300 = somaHomensSup300 + 1;
				}
			}
			
			Servicos.limparConsole(30);
		}
	}
	
	private static void buscaMenorIdadeMaiorSoldo(int idade, float salario)
	{
		if(idade < menorIdade)
		{
			menorIdade = idade;
		}
		if(salario > maiorSalario)
		{
			maiorSalario = salario;
		}
	}

	public static void exibeResultados(float salarios[], int numHabit)
	{
		DecimalFormat mascara = new DecimalFormat("0.00");
		float mediaSalarios = somaSalarios/numHabit; 
		
		Servicos.limparConsole(30);
		
		System.out.println("Menor idade (em anos): " +menorIdade);
		System.out.println("Maior salario (em reais): " +maiorSalario);
		System.out.println("Media de filhos por habitante: " 
				+mascara.format(somaFilhos/numHabit));
		System.out.println("Media dos salarios por habitante: " 
				+mascara.format(mediaSalarios));
		System.out.println("Media dos homens com salario maior que 300 reais, entre os homens: " 
				+mascara.format(somaHomensSup300 / somaHomens));
		System.out.println("Numero de pessoas com salario acima da media: "
				+buscaAcimaMedia(salarios, numHabit, mediaSalarios));		
	}
	
	private static int buscaAcimaMedia(float salarios[], int numHabit, float mediaSalarios)
	{
		int salAcimaMedia = 0;
		
		for(int aux = 0; aux < numHabit; ++aux)
		{
			if(salarios[aux] > mediaSalarios)
			{
				salAcimaMedia = salAcimaMedia + 1;
			}
		}
		
		return salAcimaMedia;
	}
}
