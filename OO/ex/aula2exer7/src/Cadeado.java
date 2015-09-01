import java.util.Scanner;

/*	Sintese
 * 		Objetivo: verificar se a senha esta correta e proteger o sistema no caso de 9 tentativas erradas
 * 		Entrada: senha, tentativas de acertar a senha
 * 		Saida: mensagem avisando se o usuario foi bem sucedido, mensagem de auto-destruicao
 */
public class Cadeado {
	public static void main(String[] args) {
		final int MAX = 9;
		String senha = "", tentativaSenha = "";
		boolean senhaCorreta;
		Scanner ler = new Scanner(System.in);

		String comSenha = "Digite sua senha. Ela deve ter entre 3 e 5 caracteres e nao ter espaco:";
		String erroSenha = "Senha fora do formato especificado. Tente novamente.";
		senha = validarString(ler, comSenha, erroSenha);

		if (!verificarSenha(ler, MAX, senha)) {
			autoDestruicao();
		} else {
			parabenizar();
		}
	}

	public static String validarString(Scanner ler, String comando, String mensagemErro) {
		String saida;
		boolean continuar = false;
		do {
			System.out.println(comando);
			saida = ler.nextLine();
			if (saida.length() < 3 || saida.length() > 5) {
				System.out.println(mensagemErro);
			} else {
				continuar = true;
			}
			for (int i = 0; i < saida.length() && continuar; i++) {
				if (saida.charAt(i) == ' ') {
					continuar = false;
				}
			}
		} while (!continuar);

		return saida;
	}

	public static boolean verificarSenha(Scanner ler, int MAX, String senha) {
		boolean confere = false;
		String tentativa;

		String comTentativa = "Digite a senha. Ela deve ter entre 3 e 5 caracteres e nao ter espaco:";
		String erroTentativa = "Tentativa fora do formato especificado. Tente novamente.";
		for (int i = 0; i < MAX && !confere; i++) {
			tentativa = validarString(ler, comTentativa, erroTentativa);
			if (tentativa.equals(senha)) {
				confere = true;
			} else {
				System.out.println("Senha nao confere.\n" + ((MAX - 1) - i) + " tentativas antes da auto-destruicao");
			}
		}
		return confere;
	}

	public static void autoDestruicao() {
		System.out.println("SEQUENCIA DE AUTO DESTRUICAO ATIVADA!\nCONTAGEM REGRESSIVA DE 10 SEGUNDOS INICIADA");
		Thread.sleep(10000);
		System.out.println("BOOOMMMMM!!!");
	}

	public static void parabenizar() {
		for (int i = 0; i < 22; i++) {
			System.out.println();
		}
		System.out.print("\t\t\t\t\t\t\t");
		System.out.print("Senha correta!");
	}

}
