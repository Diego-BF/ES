package cadastro;

public class Validador
{
	public static String validaString(String complemento)
	{
		String palavra;
		boolean sairLoop = true;
		
		do
		{
			sairLoop = true;
			System.out.println("Digite o " +complemento +" do cliente:");
			palavra = Leitor.getString();
			if(palavra.isEmpty())
			{
				Servicos.limparConsole(30);
				System.out.println("\nEntrada invalida: nada foi digitado.\n");
				sairLoop = false;
			}
		} while(sairLoop = false);
		
		return palavra;
	}
}
