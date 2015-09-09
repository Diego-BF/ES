public class Validador 
{
	
	public static float validaTemperatura(int dia)
	{
		float temperatura;
		
		do
		{
			System.out.println("Informe a temperatura do dia " +dia +", em Celsius:");
			temperatura = Leitor.getFloat();
			if(temperatura <= -50 || temperatura >= 50)
			{
				System.out.println("Entrada invalida: a temperatura informada deve estar entre -50ºC e 50ºC");
			}
		} while(temperatura <= -50 || temperatura >= 50);
		
		return temperatura;
	}
}