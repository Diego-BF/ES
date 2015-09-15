package censo;
/*
 *	Sintese
 *		Objetivo: analisar dados sobre os habitantes de uma cidade
 *		Entrada: salario, idade, sexo e numero de filhos de cada habitante
 *		Saida: menor idade, maior salario, media do numero de filhos,
 *			media dos salarios, media dos homens que ganham mais do que 300 reais,
 *			numero de pessoas que tem salario maior do que a media obtida
 */

public class Principal
{
	public static void main(String[] args)
	{
		int numHabitantes = Validador.validaNumHabitantes();
		float salarios[] = new float[numHabitantes];
		
		Servicos.limparConsole(30);
		Estatistica.cadastraDados(salarios, numHabitantes);
		
		Estatistica.exibeResultados(salarios, numHabitantes);
	}
}
