package aula3exer3;

import java.text.DecimalFormat;

public class Servicos {
	public static void main(String[] args) {
		Pessoa pessoa = new Pessoa();
		
		do {
			pessoa.nome = Validacao.validaNome();
			limpaConsole(30);
			
			pessoa.idade = Validacao.validaIdade();
			limpaConsole(30);
			
			pessoa.altura = Validacao.validaAltura();
			limpaConsole(30);
			
			mostraDados(pessoa.nome, pessoa.idade, pessoa.altura);
			
		} while (validaContinua());
	}
	
	
	
	
	
	private static void limpaConsole(int linhas) {
		for(int aux1 = 0; aux1 < linhas; aux1++) {
			System.out.println();
		}
	}
	
	
	private static void mostraDados(String nome, int idade, float altura) {
		DecimalFormat mascara = new DecimalFormat("0.00");
		
		System.out.println("Os dados que acabaram de ser cadastrados foram:");
		System.out.println("nome: " +nome);
		System.out.println("idade: " +idade);
		System.out.println("altura: " +mascara.format(altura));
	}
	
	
	private static boolean validaContinua() {
		String opcao;
		boolean continua, repetirPrograma = false;
		
		do {
			continua = true;
			System.out.println("Voce deseja fazer outro cadastro? "
					+ "Digite S caso queira, e N caso deseje encerrar.");
			opcao = Leitor.getString().toUpperCase();
			if(opcao.isEmpty()) {
				System.out.println("\nVoce deve digitar uma opcao.");
				continua = false;
			} else if(opcao.length() > 1 || (opcao.charAt(0) != 'S' && opcao.charAt(0) != 'N')) {
				System.out.println("\nEntrada invalida. Digite apenas S ou N");
				continua = false;
			}
		} while(!continua);
		
		switch(opcao) {
		case "S":
			repetirPrograma = true;
			break;
		case "N":
			repetirPrograma = false;
		}
		
		return repetirPrograma;
	}
}
