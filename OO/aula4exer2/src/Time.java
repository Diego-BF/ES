public class Time {
	String nome;
	int titulos;
	
	
	public Time(String nome, int titulos) {
		setNome(nome);
		setTitulos(titulos);
	}
	
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getNome() {
		return nome;
	}
	
	
	public void setTitulos(int titulos) {
		this.titulos = titulos;
	}
	public int getTitulos() {
		return titulos;
	}
}
