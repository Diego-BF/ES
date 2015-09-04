/*
 *	Sintese
 *		Metodo: validaSexo(), validaAltura(), validaTermino()
 */

public class Validador {
	public static String validaSexo(){
		String sexo;
		boolean continuar = true;
		
		do {
			continuar = true;
			System.out.println("Informe seu sexo (digite M para masculino e F para feminino):");
			sexo = Leitor.getString();
			if(sexo.isEmpty()) {
				System.out.println("\nEntrada invalida! Nenhum caracter foi digitado.");
				continuar = false;
			}else if((!sexo.equalsIgnoreCase("m") && !sexo.equalsIgnoreCase("f")) || sexo.length() > 1) {
				System.out.println("\nEntrada invalida! Digite apenas M ou F");
				continuar = false;
			}
		} while(!continuar);
		
		return sexo;
	}
	
	
	public static float validaAltura(){
		float altura;
		
		do {
			System.out.println("Informe sua altura (igual ou maior do que 0m e menor que 3m):");
			altura = Leitor.getFloat();
			if(altura <= 0 || altura > 3) {
				System.out.println("\nAltura invalida! Digite uma altura valida.");
			}
		} while(altura <= 0 || altura > 3);
		
		return altura;
	}
	
	public static boolean validaTermino() {
		boolean continua, terminarPrograma = false;
		String opcao;
		

		do {
			continua = true;
			System.out
					.println("Voce deseja fazer outro calculo? " + "Digite S caso queira, e N caso deseje encerrar.");
			opcao = Leitor.getString().toUpperCase();
			if (opcao.isEmpty()) {
				System.out.println("\nVoce deve digitar uma opcao.");
				continua = false;
			} else if (opcao.length() > 1 || (opcao.charAt(0) != 'S' && opcao.charAt(0) != 'N')) {
				System.out.println("\nEntrada invalida. Digite apenas S ou N");
				continua = false;
			}
		} while (!continua);

		switch (opcao) {
		case "S":
			terminarPrograma = false;
			break;
		case "N":
			terminarPrograma = true;
		}

		return terminarPrograma;
	}
}
