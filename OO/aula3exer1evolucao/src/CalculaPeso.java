import java.text.DecimalFormat;

/**Sintese:
 * 	Objetivo: Calcular e apresentar o peso ideal de uma pessoa
 * 	Entrada: sexo e altura
 * 	Saida: peso ideal
 */
public class CalculaPeso {
	public static void main(String[] args) {
		//Declaracoes
		Pessoa pessoa= new Pessoa();
		DecimalFormat mascara = new DecimalFormat("0.000");

		//Instrucoes	
		do {
			pessoa.setSexo(Validador.validaSexo());
			limpaTela();
			
			pessoa.setAltura(Validador.validaAltura());
			limpaTela();

			if (pessoa.getSexo().equalsIgnoreCase("m")) {
				pessoa.setPesoIdeal(calculoHomem(pessoa.getAltura()));
			} else {
				pessoa.setPesoIdeal(calculoMulher(pessoa.getAltura()));
			}
			limpaTela();

			System.out.print("Seu peso ideal e: " +mascara.format(pessoa.getPesoIdeal()) +"\n");
		} while(!Validador.validaTermino());
	}


		// SUBPROGRAMAS (outros metodos de servicos) //

		
		public static float calculoHomem(float altura) {
			return(72.7F * altura - 58F); 
		}

		public static float calculoMulher(float altura) {
			return (62.1F * altura - 44.7F); 
		}

		public  static void limpaTela(){
			final int LINHAS = 30;
			for(int linha = 0; linha < LINHAS; linha++)
				System.out.println();
		}
	}
