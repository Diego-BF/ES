package cadastro;

/*
 *	Sintese
 *		Objetivo: exibir o nome do cliente
 *		Entrada: nome, ultimo nome
 *		Saida: [ultimo nome]/[nome]
 */

public class Principal
{
	public static void main(String[] args)
	{
		Pessoa cliente;
		
		do
		{
			cliente = new Pessoa(Cadastro.cadastraNomes());
			
			System.out.println("nome cadastrado: " +cliente.getNomeFormatado());
			Servicos.limparConsole(2);
		} while(Servicos.continuarCadastros());
	}
}
