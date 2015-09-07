public class Validador {
	
	public static String validaNome() {
		String nome;
		
		do {
			System.out.println("Digite o nome completo do participante:");
			nome = Leitor.getString();
			if(nome.isEmpty()) {
				System.out.println("\nEntrada invalida: nada foi digitado");
			}
		} while(nome.isEmpty());
		
		return nome;
	}
	
	public static int validaIdade() {
		int idade;
		
		do {
			System.out.println("Digite a idade, em anos, do participante:");
			idade = Leitor.getInt();
			if(idade < 0 || idade > 130) {
				System.out.println("\nEntrada invalida: a idade nao pode ser menor do que 0 (zero) ou superior a 130 anos.");
			}
		} while(idade < 0 || idade > 130);
	
		return idade;
	}
	
	public static char validaSexo() {
		char sexo;
		
		do {
			System.out.println("Digite o sexo do participante. M para masculino e F para feminino:");
			sexo = Leitor.getChar();
			if(sexo != 'M' && sexo != 'F') {
				System.out.println("\nEntrada invalida: digite apenas M ou F.");
			}
		} while(sexo != 'M' && sexo != 'F');
		
		return sexo;
	}
	
	public static boolean validaJaTeveDengue() {
		boolean jaTeveDengue = false;
		char opcao;
		
		do {
			System.out.println("Digite S caso o participante ja tenha tido dengue e N se nunca teve.");
			opcao = Leitor.getChar();
			if(opcao != 'S' && opcao != 'N') {
				System.out.println("\nEntrada invalida: digite apenas S ou N.");
			}
		} while(opcao != 'S' && opcao != 'N');
		
		switch(opcao) {
		case 'S':
			jaTeveDengue = true;
			break;
		case 'N':
		}
		
		return jaTeveDengue;
	}
	
	public static int validaTamCadastro() {
		int tamCadastro;
		
		do {
			System.out.println("Quantos serao os participantes da pesquisa? (o numero inserido deve ser maior do que 0 (zero)");
			tamCadastro = Leitor.getInt();
			if(tamCadastro < 1) {
				System.out.println("\nEntrada invalida: O numero inserido e igual ou menor do que 0 (zero).");
			}
		} while(tamCadastro < 1);
	
		return tamCadastro;
	}
	
	public static boolean validaContinuarCadastro() {
		boolean continuarCadastro = true; 
		char opcao;
		
		do {
			System.out.println("Voce deseja continuar cadastrando participantes?");
			System.out.println("Digite S para sim e N para nao");
			opcao = Leitor.getChar();
			
			if(opcao != 'S' && opcao != 'N') {
				System.out.println("\nEntrada invalida: digite apenas S ou N");
			}
		} while(opcao != 'S' && opcao != 'N');
		
		switch(opcao) {
		case 'S':
			break;
		case 'N':
			continuarCadastro = false;
		}
		
		return continuarCadastro;
	}
}