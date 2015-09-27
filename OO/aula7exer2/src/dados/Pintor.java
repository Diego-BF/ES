package dados;

public class Pintor
{
	private Integer numId;
	private String nome;
	private Integer anoNascimento;
	
	public Pintor(Integer numId, String nome, Integer dataNascimento)
	{
		this.numId = numId;
		this.nome = nome;
		this.anoNascimento = dataNascimento;
	}

	public Integer getNumId()
	{
		return numId;
	}

	public String getNome()
	{
		return nome;
	}

	public Integer getDataNascimento()
	{
		return anoNascimento;
	}
	
	
}