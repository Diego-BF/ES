import java.util.Vector;

public class Servico {

	public static void limpaConsole(int linhas)
	{
		for(int aux = 0; aux < linhas; aux++)
		{
			System.out.println();
		}
	}

	public static void mostraDados(Vector habitantes, int qtdeHabitantes){
		float mediaSalario;
		Estatistica.menorIdade(habitantes ,qtdeHabitantes);
		Estatistica.maiorSalario(habitantes, qtdeHabitantes);
		mediaSalario = Estatistica.mediaNumeroFilhoESalario(habitantes, qtdeHabitantes);
		Estatistica.salarioSuperiorMedia(habitantes, qtdeHabitantes, mediaSalario);
	}

	public static boolean continuarCadastros()
	{
		String opcao;
		boolean continuarCadastros = true;
		boolean sairLoop = true;

		do
		{
			sairLoop = true;
			System.out.println("Outro cadastro sera realizado? Digite S para sim e N para nao.");
			opcao = Leitor.getString().toUpperCase();
			if(opcao.isEmpty())
			{
				sairLoop = false;
				System.out.println("Opcao invalida: nada foi digitado.");
			} else if (!(opcao.equals("S")) && !(opcao.equals("N")))
			{
				sairLoop = false;
				System.out.println("Opcao invalida: Digite apenas S ou N.");
			}
		} while (!sairLoop);
		
		switch(opcao)
		{
			case "S":
				continuarCadastros = true;
				break;
			case "N":
				continuarCadastros = false;
		}
		
		return continuarCadastros;
	}
}