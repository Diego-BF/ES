package dados;

public class Mamifero
{
	private Integer idadeDesmame;
	private Integer ExpectativaVida;
	private StringBuilder descrEspecie;
	private Float tamanhoAdulto;
	
	public Mamifero(Integer idadeDesmame, Integer expectativaVida, 
			StringBuilder descrEspecie, Float tamanhoAdulto)
	{
		this.idadeDesmame = idadeDesmame;
		this.ExpectativaVida = expectativaVida;
		this.descrEspecie = descrEspecie;
		this.tamanhoAdulto = tamanhoAdulto;
	}

	public Integer getIdadeDesmame()
	{
		return idadeDesmame;
	}

	public Integer getExpectativaVida()
	{
		return ExpectativaVida;
	}

	public StringBuilder getDescrEspecie()
	{
		return descrEspecie;
	}

	public Float getTamanhoAdulto()
	{
		return tamanhoAdulto;
	}	
}
