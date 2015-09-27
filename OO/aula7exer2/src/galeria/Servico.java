package galeria;

import java.util.ArrayList;

import dados.Pintor;
import dados.Quadro;

public class Servico
{
	public static Integer checaCodigo(ArrayList<Quadro> pinacoteca)
	{
		Integer codigo = null;
		boolean codigoNovo;
		
		do
		{
			codigoNovo = true;
			codigo = Visao.lerInteger(0, "Informe o codigo do quadro (nao pode ser menor que 1 ou repetido)",
					"Codigo do quadro");
			//verifica se o codigo e novo
			if (pinacoteca.size() != 0)
			{
				for (int aux = 0; aux < pinacoteca.size() && codigoNovo; aux++)
				{
					if (pinacoteca.get(aux).equals(codigo))
					{
						codigoNovo = false;
					}
				}
			} 
		} while (!codigoNovo);
		
		return codigo;
	}
	
	public static Integer checaNumId(ArrayList<Pintor> autores)
	{
		Integer numId = null;
		boolean numIdNova;
		
		do
		{
			numIdNova = true;
			numId = Visao.lerInteger(0,
					"Informe o numero de identificacao do pintor (nao pode ser menor que 1 ou repetido)",
					"Numero de identificacao do pintor");
			//verifica se o numId e novo
			if (autores.size() != 0)
			{
				for (int aux = 0; aux < autores.size() && numIdNova; aux++)
				{
					if (autores.get(aux).equals(numId))
					{
						numIdNova = false;
					}
				}
			} 
		} while (!numIdNova);
		
		return numId;
	}
}