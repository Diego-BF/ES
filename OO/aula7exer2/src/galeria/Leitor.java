package galeria;

public class Leitor
{
	public static Integer getInteger(String string)
	{
		return new Integer(0).parseInt(string.trim());
	}
	
	public static Float getFloat(String string)
	{
		return new Float(0).parseFloat(string.trim());
	}
}