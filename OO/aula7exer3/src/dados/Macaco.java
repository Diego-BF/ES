package dados;

public class Macaco extends Mamifero
{
	private StringBuilder porte;

	public Macaco(Integer idadeDesmame, Integer expectativaVida, 
			StringBuilder descrEspecie, Float tamanhoAdulto, StringBuilder porte)
	{
		super(idadeDesmame, expectativaVida, descrEspecie, tamanhoAdulto);
		this.porte = porte;
	}
	
	public StringBuilder getPorte()
	{
		return porte;
	}
}