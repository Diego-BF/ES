/*
 *	Sintese
 *		Objetivo: informatizar uma galeria de quadros
 *		Entrada: codigo, preco e ano de aquisicao de cada quadro; numero de identificacao,
 *			nome e ano de nascimento de cada autor de quadro da galeria
 *		Saida: lista de todos os quadros de um pintor; lista de quadros da galeria
 */

package galeria;

import java.util.ArrayList;

import dados.Pintor;
import dados.Quadro;

public class Principal
{
	public static void main(String[] args)
	{
		final int ANOLIMNAS = 1000;
		ArrayList<Quadro> pinacoteca = new ArrayList<Quadro>();
		ArrayList<Pintor> autores = new ArrayList<Pintor>();
		String opcao = null;
		
		//menu opcoes
		do
		{
			opcao = Visao.leMenu();
			switch(opcao)
			{
			case "1":
				//cadastro de quadro
				pinacoteca.add(new Quadro(Servico.checaCodigo(pinacoteca), 
						Visao.lerFloat("Digite o preco do quadro (nao pode ser menor que 0)", "Preco do Quadro"),
								Visao.lerInteger(ANOLIMNAS, "Digite o ano de aquisicao do quadro (nao pode ser menor que 1001)",
										"Ano de Aquisicao do Quadro"), 
								Visao.lerInteger(0, "Digite o numero de identificacao do autor (nao pode ser menor que 1)", 
										"Numero de Identificacao do Autor do Quadro")));
				
			}
		} while(!opcao.equals("5"));
	}
}