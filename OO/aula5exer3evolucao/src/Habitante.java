
public class Habitante {
		private float salario;
		private int idade;
		private String sexo;
		private int numeroFilho;
		
		Habitante(float salario, int idade, String sexo, int numeroFilho){
			setSalario(salario);
			setIdade(idade);
			setSexo(sexo);
			setNumeroFilho(numeroFilho);
		}
		
		public void setSalario(float salario){
			this.salario = salario;
		}
		
		public void setIdade (int idade){
			this.idade = idade;
		}
		
		public void setSexo(String sexo){
			this.sexo = sexo;
		}
		
		public void setNumeroFilho(int numeroFilho){
			this.numeroFilho = numeroFilho;
		}
		
		public float getSalario(){
			return salario;
		}
		
		public int getIdade(){
			return idade;
		}
		
		public String getSexo(){
			return sexo;
		}
		
		public int getNumeroFilho(){
			return numeroFilho;
		}
		
}
