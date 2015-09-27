package dados;

public class Quadro
{
	private Integer codigoQuadro;
	private Float preco;
	private Integer anoAquis;
	private Pintor autor;
	
	public Quadro(Integer codigoQuadro, Float preco, Integer anoAquis, Pintor autor)
	{
		this.codigoQuadro = codigoQuadro;
		this.preco = preco;
		this.anoAquis = anoAquis;
		this.autor = autor;
	}
	
	public Integer getCodigoQuadro()
	{
		return codigoQuadro;
	}
	public Float getPreco()
	{
		return preco;
	}
	public Integer getAnoAquis()
	{
		return anoAquis;
	}
	public Pintor getAutor()
	{
		return autor;
	}
	
	
}