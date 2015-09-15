package censo;

public class Pessoa
{
	private float salario;
	private int idade;
	private char sexo;
	private int numFilhos;

	public Pessoa(float salario, int idade, char sexo, int numFilhos)
	{
		this.salario = salario;
		this.idade = idade;
		this.sexo = sexo;
		this.numFilhos = numFilhos;
	}
	
	public float getSalario()
	{
		return salario;
	}
	
	public int getIdade()
	{
		return idade;
	}
	
	public char getSexo()
	{
		return sexo;
	}
	
	public int getNumFilhos()
	{
		return numFilhos;
	}
}
