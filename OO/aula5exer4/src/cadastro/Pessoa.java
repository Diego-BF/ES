package cadastro;

public class Pessoa
{
	private StringBuilder nomeFormatado;

	public Pessoa(StringBuilder nomeFormatado)
	{
		this.nomeFormatado = nomeFormatado;
	}
	
	public StringBuilder getNomeFormatado()
	{
		return nomeFormatado;
	}
}
