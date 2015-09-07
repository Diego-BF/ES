import java.text.DecimalFormat;

/*
 *	Sintese
 *		Objetivo: cadastrar e exibir informacoes, em termos estatisticos, sobre pessoas participantes de uma pesquisa
 *		Entrada: maximo de participantes; nome, idade, sexo e se a pessoa ja teve dengue; opcao sobre continuar o cadastro
 *		Saida: porcentagem dos participantes que ja teve dengue, de homens que ja tiveram dengue entre os homens participantes
 *			e de criancas que ja tiveram dengue (relativo a toda a amostra); quantidade de pessoas, assim como de homens e de mulheres,
 *			participantes
 */
public class CadastroDengue {
	
	public static void main(String[] args) {
		int tamCadastro = Validador.validaTamCadastro();
		int ultimoCadastro = tamCadastro;
		int totalHom = 0, totalMul = 0, homJaCont = 0, criJaCont = 0, partJaCont = 0; 
		Pessoa participantes[] = new Pessoa[tamCadastro];
		boolean continuarCadastro = true;
		
		for(int i = 0; i < tamCadastro && continuarCadastro; ++i) {
			limpaConsole(30);
			participantes[i] = new Pessoa(Validador.validaNome(), Validador.validaIdade(), Validador.validaSexo(),
					Validador.validaJaTeveDengue());
			if(i < tamCadastro-1) {
				limpaConsole(30);
				continuarCadastro = Validador.validaContinuarCadastro();
				if(!continuarCadastro) {
					ultimoCadastro = ++i;
				}
			}
			extraiDados(participantes[i], totalHom, totalMul, homJaCont, criJaCont, partJaCont);
		}
		
		exibeDados(totalHom, totalMul, homJaCont, criJaCont, partJaCont, ultimoCadastro);
	}
	
	
	// outros metodos //
	
	private static void limpaConsole(int linhas) {
		for(int i = 0; i < linhas; ++i) {
			System.out.println();
		}
	}
	
	private static void extraiDados(Pessoa participante, int totalHom, int totalMul, int homJaCont, int criJaCont, int partJaCont) {
		if(participante.getSexo() == 'M') {
			totalHom = totalHom+1;
			if(participante.getJaTeveDengue()) {
				homJaCont = homJaCont+1;
			}
		} else {
			totalMul = totalMul+1;
		}
		
		if(participante.getJaTeveDengue()) {
			partJaCont = partJaCont+1;
			if(participante.getIdade() <= 12) {
				criJaCont = criJaCont+1;
			}
		}
	}
	
	private static float porcentagem(int numerador, int denominador) {
		float porcentagem;
		
		if(denominador == 0) {
			porcentagem = 0;
		} else {
			porcentagem = (numerador/denominador)*100f;
		}
		
		return porcentagem;
	}
	
	private static void exibeDados(int totalHom, int totalMul, int homJaCont, int criJaCont, int partJaCont, int ultimoCadastro){
		DecimalFormat mascara = new DecimalFormat("0.000");
		
		limpaConsole(30);
		System.out.println("Relatorio final:");
		System.out.println(mascara.format(porcentagem(partJaCont, ultimoCadastro)) 
				+"% dos participantes ja tiveram dengue");
		System.out.println(mascara.format(porcentagem(homJaCont, totalHom)) 
				+"% do total de homens ja tiveram dengue.");
		System.out.println(mascara.format(porcentagem(criJaCont, ultimoCadastro)) 
				+"% dos participantes sao criancas com 12 anos ou menos que ja tiveram dengue");
		System.out.println("\nparticiparam da pesquisa " +ultimoCadastro +" pessoas");
		System.out.println("\n"+totalHom +" dos participantes eram homens");
		System.out.println("\n"+totalMul +" dos participantes eram mulheres");
	}
}