import java.text.DecimalFormat;

/*
 *	Sintese
 *		Objetivo: armazenar medias diarias de temperaturas e exibir informacoes sobre a maior e a menor
 *				obtidas ao longo do mes de novembro
 *		Entrada: temperaturas
 *		Saida: maior e menor media de temperatura no mes e os dias em que estas ocorreram
 */

public class Principal
{
	private static float menorTemperatura;
	private static float maiorTemperatura;
	//private static TemperaturaDia temperNov[];
	
	public static void main(String[] args)
	{
		final int QTDEDIAS = 30; //30
		TemperaturaDia temperNov[] = new TemperaturaDia[QTDEDIAS];
		
		armazenaTemperatura(QTDEDIAS, temperNov);
		
		exibeDadosFinais(QTDEDIAS, temperNov);
	}
	
	
	// outros metodos //
	
	private static void armazenaTemperatura(final int QTDEDIAS, TemperaturaDia temperNov[])
	{
		for(int i = 0; i < QTDEDIAS; ++i)
		{
			temperNov[i] = new TemperaturaDia(Validador.validaTemperatura(i+1));
			if(i != 0)
			{
				obterMinMaxTemp(temperNov[i].getTemperatura());
			} else
			{
				menorTemperatura = maiorTemperatura = temperNov[0].getTemperatura();
			}
			
			limpaConsole(30);
		}
	}
	
	public static void limpaConsole(int linhas)
	{
		for(int i = 0; i < linhas; ++i)
		{
			System.out.println();
		}
	}
	
	private static void obterMinMaxTemp(float temperatura)
	{
		if(temperatura > maiorTemperatura)
		{
			maiorTemperatura = temperatura;
		} else if(temperatura < menorTemperatura)
		{
			menorTemperatura = temperatura;
		}
	}
	
	private static void buscaTemperatura(float temperaturaAlvo, int QTDEDIAS, TemperaturaDia temperNov[])
	{
		for(int i = 0; i < QTDEDIAS; ++i)
		{
			if(temperNov[i].getTemperatura() == temperaturaAlvo)
			{
				System.out.print((i+1) +" ");
			}
		}
	}
	
	private static void exibeDadosFinais(int QTDEDIAS, TemperaturaDia temperNov[])
	{
		DecimalFormat mascara = new DecimalFormat("0.00");
		
		System.out.println("Menor media de temperatura em novembro: " +mascara.format(menorTemperatura) 
					+"ºC");
		System.out.print("Ela ocorreu nos dias: ");
		buscaTemperatura(maiorTemperatura, QTDEDIAS, temperNov);
		System.out.println();
		
		System.out.println("Maior media de temperatura em novembro: " +mascara.format(maiorTemperatura) 
					+"ºC");
		System.out.print("Ela ocorreu nos dias: ");
		buscaTemperatura(menorTemperatura, QTDEDIAS, temperNov);
	}
}
