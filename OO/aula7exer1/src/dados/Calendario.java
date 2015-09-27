package dados;

public class Calendario
{
	Integer ano;
	StringBuilder presidente;
	StringBuilder eventoEspacial;
	public Calendario(Integer ano, StringBuilder presidente, StringBuilder eventoEspacial)
	{
		this.ano = ano;
		this.presidente = presidente;
		this.eventoEspacial = eventoEspacial;
	}
	
	public Integer getAno()
	{
		return ano;
	}
	
	public StringBuilder getPresidente()
	{
		return presidente;
	}
	
	public StringBuilder getEventoEspacial()
	{
		return eventoEspacial;
	}
}