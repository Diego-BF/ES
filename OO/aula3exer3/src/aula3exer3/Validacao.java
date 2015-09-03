package aula3exer3;

public class Validacao {
	public static String validaNome() {
		String nome;
		
		do {
			System.out.println("Digite o nome da pessoa (deve ter ao menos 3 caracteres):");
			nome = Leitor.getString();
			if(nome.length() < 3) {
				System.out.println("\nEntrada invalida: o nome inserido possui menos de 3 caracteres.");
			} else if(nome.isEmpty()) {
				System.out.println("\nEntrada invalida: nada foi digitado.");
			}
		} while(nome.length() < 3);
		
		return nome;
	}
	
	public static int validaIdade() {
		int idade;
		
		do {
			System.out.println("Digite a idade da pessoa (deve ser maior que 0 e menor que 150 anos):");
			idade = Leitor.getInt();
			if(idade <= 0 || idade >= 150) {
				System.out.println("\nEntrada invalida: idade fora do intervalo especificado.");
			}
		} while(idade < 1 || idade > 149);
		
		return idade;
	}
	
	public static float validaAltura() {
		float altura;
		
		do {
			System.out.println("Digite a altura da pessoa (deve ser maior que 0,4m e menor que 2,6m):");
			altura = Leitor.getFloat();
			if(altura <= 0.4f || altura >= 2.6f) {
				System.out.println("\nEntrada invalida: altura fora do intervalo especificado.");
			}
		} while(altura <= 0.4f || altura >= 2.6f);
		
		return altura;
	}
}
