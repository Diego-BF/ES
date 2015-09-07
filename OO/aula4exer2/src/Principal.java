/*
 *	Sintese
 *		Objetivo: cadastrar e exibir informacoes sobre ate 10 times
 *		Entrada: nome e quantidade de titulos do time, opcao do usuario quanto a continuar cadastrando
 *		Saida: lista com nome e quantidade de titulos dos times cadastrados
 */

public class Principal {

	public static void main(String[] args) {
		final int CADASTROS = 10;
		Time lista[] = new Time[CADASTROS];
		boolean continuarCadastro = true;
		int pontoParada = CADASTROS;
		
		for(int i = 0; i < CADASTROS && continuarCadastro; ++i) {
			lista[i] = new Time(Validador.validaTime(), Validador.validaTitulos());
			limpaConsole(30);
			
			if(i < CADASTROS-1) {
				continuarCadastro = Validador.validaContinuar();
				limpaConsole(30);
				//gravacao de onde o cadastro parou para usar na exibicao da lista
				if(!continuarCadastro) {
					pontoParada = ++i;
				}
			} 
		}
		
		limpaConsole(30);
		exibirCadastro(lista, pontoParada);
	}
	
	
	// outros metodos //
	private static void exibirCadastro(Time lista[], int limiteContador) {
		for(int i = 0; i < limiteContador; ++i) {
			System.out.println(lista[i].nome +": " +lista[i].titulos +" Campeonatos Brasileiros conquistados");			
		}
	}
	
	private static void limpaConsole(int linhas) {
		for(int i = 0; i < linhas; ++i) {
			System.out.println();
		}
	}
}
