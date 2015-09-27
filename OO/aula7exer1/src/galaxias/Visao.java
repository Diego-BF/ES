package galaxias;

import java.util.Vector;

import javax.swing.JOptionPane;

import dados.Calendario;

public class Visao
{
	public static Integer leAno(Integer limInf, Integer limSup)
	{
		Integer numero = 0;
		boolean sairLoop;
		
		do
		{
			sairLoop = true;
			//tratamento de excecao
			try
			{
				numero = Leitor.getInteger(JOptionPane.showInputDialog(null, 
						"Digite o ano dos acontecimentos (nao pode ser menor que "+limInf+" ou maior que "
								+limSup+"):",
						"Informe o ano", JOptionPane.PLAIN_MESSAGE));
			} catch(NumberFormatException excecao)
			{
				JOptionPane.showMessageDialog(null, "Digite apenas numeros", "Entrada invalida", 
						JOptionPane.WARNING_MESSAGE);
				sairLoop = false;
			} catch(NullPointerException excecao)
			{
				JOptionPane.showMessageDialog(null, "Nada foi digitado", "Entrada invalida", 
						JOptionPane.WARNING_MESSAGE);
				sairLoop = false;
			}
			//validacao
			if(sairLoop && !Validador.validaInteger(numero, limInf, limSup))
			{
				JOptionPane.showMessageDialog(null, "O numero digitado nao pode ser menor que "+limInf
						+" ou maior que "+limSup,
						"Entrada Invalida", JOptionPane.WARNING_MESSAGE);
				sairLoop = false;
			}
		} while(!sairLoop);
		
		return numero;
	}
	
	public static StringBuilder leString(String tituloJanela, String msgJanela)
	{
		String string = null;
		boolean sairLoop;
		
		do
		{
			sairLoop = true;
			//tratamento de excecao
			try
			{
				string = JOptionPane.showInputDialog(null, msgJanela, tituloJanela, JOptionPane.PLAIN_MESSAGE);
			} catch(NullPointerException excecao)
			{
				JOptionPane.showMessageDialog(null, "Nada foi digitado", "Entrada invalida", 
						JOptionPane.WARNING_MESSAGE);
				sairLoop = false;
			}
			//validacao
			if(string.isEmpty())
			{
				JOptionPane.showMessageDialog(null, "Nada foi digitado", "Entrada Invalida", 
						JOptionPane.WARNING_MESSAGE);
				sairLoop = false;
			}
		} while(!sairLoop);
		
		return new StringBuilder().append(string);
	}
	
	public static boolean leContinuaRegistro()
	{
		boolean continuaRegistro = true;
		
		if(JOptionPane.showConfirmDialog(null, "Voce deseja realizar outro cadastro?",
				"Continuar Cadastro?",JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE) == 1)
		{
			continuaRegistro = false;
		}
		
		return continuaRegistro;
	}
	
	public static void exibeRelatorio(Vector<Calendario> calendario)
	{
		System.out.println("Relatorio dos registros feitos:\n");
		System.out.println("[ano]\t[presidente]\t[evento espacial]");
		if(calendario.size() > 0)
		{
			for(int aux = 0; aux < calendario.size(); aux++)
			{
				System.out.println(calendario.get(aux).getAno()+"\t"
						+calendario.get(aux).getPresidente()+"\t\t"
						+calendario.get(aux).getEventoEspacial());
			}
		}
	}
}