public class Validador {
	
	public static String validaTime() {
		String nomeTime = new String();
		
		do {
			System.out.println("Digite o nome do time: ");
			nomeTime = Leitor.getString();
			if(nomeTime.isEmpty()) {
				System.out.println("\nEntrada invalida: nada foi digitado.");
			}
		} while(nomeTime.isEmpty());
		System.out.println();
		
		return nomeTime;
	}
	
	
	public static int validaTitulos() {
		int titulosTime;
		
		do {
			System.out.println("Digite quantos Campeonatos Brasileiros esse time ganhou: ");
			titulosTime = Leitor.getInt();
			if(titulosTime < 0) {
				System.out.println("\nEntrada invalida: o numero de titulos deve ser igual ou maior do que 0(zero).");
			}
		} while(titulosTime < 0);
		System.out.println();
		
		return titulosTime;
	}
	
	public static boolean validaContinuar() {
		boolean continuarCadastro = true; 
		char opcao;
		
		do {
			System.out.println("Voce deseja continuar cadastrando times?");
			System.out.println("Digite S para sim e N para nao");
			opcao = Leitor.getString().toUpperCase().charAt(0);
			
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
