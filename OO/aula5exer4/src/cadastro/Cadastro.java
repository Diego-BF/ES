package cadastro;

public class Cadastro
{
	public static StringBuilder cadastraNomes()
	{
		StringBuilder nomePadronizado = new StringBuilder();
		nomePadronizado.append(Validador.validaString("nome"));
		Servicos.limparConsole(30);
		
		nomePadronizado.insert(0, Validador.validaString("ultimo nome") +"/");
		Servicos.limparConsole(30);
		
		return nomePadronizado;
	}
}
