/**Sintese:
 * 		Objetivo: Analisar dados referente a habitantes.
 * 		Entrada:  Salario, idade, sexo e numero de filhos.
 *		Saida:    menor idade, maior salario, media numero de filhos, media dos salarios,
 *				  media dos homens com salario superior a R$300, 
 *				  pessoas com salario maior que media.
 */
import java.util.Vector;

public class Principal {
	
	public static void main(String[] args) {
		int qtdeHabitantes = 0;
		Vector habitantes = new Vector(10, 1);
		
		do
		{
			habitantes.add(new Habitante(Validador.validaSalario(qtdeHabitantes),
					Validador.validaIdade(qtdeHabitantes), 
					Validador.validaSexo(qtdeHabitantes),
					Validador.validaNumFilhos(qtdeHabitantes)));
			qtdeHabitantes = qtdeHabitantes+1;
		} while (Servico.continuarCadastros());
		
		Servico.mostraDados(habitantes, qtdeHabitantes);
	}

}
