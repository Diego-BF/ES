/*
 *	Sintese
 *		Atributo: sexo, altura, pesoIdeal
 *		Metodo: get/setSexo(), get/setAltura(), get/setPesoIdeal()
 */

public  class Pessoa {
	private String sexo;
	private float  altura;
	private float pesoIdeal;

	public String getSexo() {
		return sexo;
	}
	public void setSexo(String sexo) {
		this.sexo = sexo;
	}
	
	public float getAltura() {
		return altura;
	}
	public void setAltura(float altura) {
		this.altura = altura;
	}
	
	public float getPesoIdeal() {
		return pesoIdeal;
	}
	public void setPesoIdeal(float pesoIdeal) {
		this.pesoIdeal = pesoIdeal;
	}
}
