package sapataria;

public class Sapataria
{
	private String nomeSapataria;
	private int codigoCalcado;
	private String modeloCalcado;
	private int tamanhoCalcado;
	
	
	public Sapataria(String nomeSapataria)
	{
		this.nomeSapataria = nomeSapataria;
	}


	public Sapataria(int codigoCalcado, String modeloCalcado, int tamanhoCalcado)
	{
		this.codigoCalcado = codigoCalcado;
		this.modeloCalcado = modeloCalcado;
		this.tamanhoCalcado = tamanhoCalcado;
	}
	
	public String getNomeSapataria()
	{
		return nomeSapataria;
	}
	
	public int getCodigoCalcado()
	{
		return codigoCalcado;
	}
	
	public String getModeloCalcado()
	{
		return modeloCalcado;
	}
	
	public int getTamanhoCalcado()
	{
		return tamanhoCalcado;
	}
}