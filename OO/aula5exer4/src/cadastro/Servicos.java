package cadastro;

public class Servicos
{
	public static void limparConsole(int linhas)
	{
		for(int aux = 0; aux < linhas; aux++)
		{
			System.out.println();
		}
	}
	
	public static boolean continuarCadastros()
	{
		char opcao;
		boolean continuarCadastros = false;
		
		do
		{
			System.out.println("Voce deseja cadastrar outra pessoa?");
			System.out.println("Digite S para sim e N para nao");
			opcao = Leitor.getChar();
			if(opcao != 'S' && opcao != 'N')
			{
				Servicos.limparConsole(30);
				System.out.println("Entrada invalida: digite apenas S ou N.\n");
			}
		} while(opcao != 'S' && opcao != 'N');
		
		switch(opcao)
		{
			case 'S':
				continuarCadastros = true;
				break;
			case 'N':
				continuarCadastros = false;
		}
		
		return continuarCadastros;
	}
}
