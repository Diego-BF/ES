/*
 *	Sintese
 *		Objetivo: listar presidentes e eventos espaciais que ocorreram em determinados anos
 *		Entrada: ano, presidente, evento espacial
 *		Saida: lista exibindo o presidente e evento espacial para cada ano cadastrado 
 */

package galaxias;

import java.util.Vector;

import dados.Calendario;

public class Principal
{
	public static void main(String[] args)
	{
		Vector<Calendario> calendario = new Vector<Calendario>();
		final Integer ANOATUAL = 2015;
		
		do
		{
			//leitura da informacao
			calendario.add(new Calendario(Visao.leAno(1900, ANOATUAL), 
					Visao.leString("Nome do Presidente do Brasil", "Digite o nome da pessoa que presidia o Brasil neste ano"), 
					Visao.leString("Evento Espacial", "Digite a descrição do evento espacial que ocorreu nesse ano:")));
			//verificar se os registros continuarao
						
		} while(Visao.leContinuaRegistro());
		
		Visao.exibeRelatorio(calendario);
	}
}