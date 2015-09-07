public class Pessoa {

	private String nome;
	private int idade;
	private char sexo;
	private boolean jaTeveDengue;

	Pessoa(String nome, int idade, char sexo, boolean jaTeveDengue) {
		setNome(nome);
		setIdade(idade);
		setSexo(sexo);
		setJaTeveDengue(jaTeveDengue);
	}

	//metodos de acesso aos atributos
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getNome() {
		return nome;
	}

	
	public void setIdade(int idade) {
		this.idade = idade;
	}
	public int getIdade() {
		return idade;
	}
	
	
	public void setSexo(char sexo) {
		this.sexo = sexo;
	}
	public char getSexo() {
		return sexo;
	}
	
	
	public void setJaTeveDengue(boolean jaTeveDengue) {
		this.jaTeveDengue = jaTeveDengue;
	}
	public boolean getJaTeveDengue() {
		return jaTeveDengue;
	}
}