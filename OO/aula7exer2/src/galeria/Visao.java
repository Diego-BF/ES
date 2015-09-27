package galeria;

import javax.swing.JOptionPane;

public class Visao
{
	public static Integer lerInteger(Integer limInf, String msg, String titulo)
	{
		boolean sairLoop;
		Integer numero = null;
		
		do
		{
			sairLoop = true;
			//tratamento de excecao
			try
			{
				numero = Leitor.getInteger(JOptionPane.showInputDialog(null, msg, titulo, 
						JOptionPane.PLAIN_MESSAGE));
			} catch(NumberFormatException excessao)
			{
				JOptionPane.showMessageDialog(null,"Entrada invalida: digite apenas numeros", 
						"Entrada Invalida", JOptionPane.WARNING_MESSAGE);
				sairLoop = false;
			} catch(NullPointerException excecao)
			{
				JOptionPane.showMessageDialog(null, "Digite os dados pedidos", "Operacao Invalida", 
						JOptionPane.WARNING_MESSAGE);
				sairLoop = false;
			}
			//validacao
			if(sairLoop && !Validador.validaInteger(numero, limInf))
			{
				JOptionPane.showMessageDialog(null, "Entrada invalida: o numero digitado nao pode ser menor que "
						+(limInf+1), "Entrada Invalida", JOptionPane.WARNING_MESSAGE);
				sairLoop = false;
			}
		} while(!sairLoop);
		
		return numero;
	}

	public static Float lerFloat(String msg, String titulo)
	{
		boolean sairLoop;
		Float numero = null;
		
		do
		{
			sairLoop = true;
			//tratamento de excecao
			try
			{
				numero = Leitor.getFloat(JOptionPane.showInputDialog(null, msg, titulo, 
						JOptionPane.PLAIN_MESSAGE));
			} catch(NumberFormatException excecao)
			{
				JOptionPane.showMessageDialog(null,"Entrada invalida: digite apenas numeros", 
						"Entrada Invalida", JOptionPane.WARNING_MESSAGE);
				sairLoop = false;
			} catch(NullPointerException excecao)
			{
				JOptionPane.showMessageDialog(null, "Digite os dados pedidos", "Operacao Invalida", 
						JOptionPane.WARNING_MESSAGE);
				sairLoop = false;
			}
			//validacao
			if(sairLoop && !Validador.validaFloat(numero))
			{
				JOptionPane.showMessageDialog(null, "Entrada invalida: o numero digitado nao pode ser menor que 0",
						"Entrada Invalida", JOptionPane.WARNING_MESSAGE);
				sairLoop = false;
			}
		} while(!sairLoop);
		
		return numero;
	}
	
	public static StringBuilder leStringBuilder(String msg, String titulo)
	{
		boolean sairLoop;
		String string = null;
		
		do{
			sairLoop = true;
			//tratamento de excecao
			try
			{
				string = JOptionPane.showInputDialog(null, msg, titulo, JOptionPane.PLAIN_MESSAGE).trim();
			} catch(NullPointerException excecao)
			{
				JOptionPane.showMessageDialog(null, "Digite os dados pedidos", "Operacao Invalida", 
						JOptionPane.WARNING_MESSAGE);
				sairLoop = false;
			}
			//validacao da string
			if(sairLoop && !Validador.validaString(string))
			{
				JOptionPane.showMessageDialog(null, "Entrada invalida: nada foi digitado", 
						"Entrada Invalida", JOptionPane.WARNING_MESSAGE);
				sairLoop = false;
			}
		} while(!sairLoop);
		
		return new StringBuilder().append(string);
	}
	
	public static String leMenu()
	{
		boolean sairLoop;
		String opcao = null;
		
		do
		{
			sairLoop = true;
			//tratamento de excecao
			try
			{
				opcao = JOptionPane.showInputDialog(null, "O que voce deseja fazer?\n"
					+"Digite 1 para cadastrar um novo quadro\nDigite 2 para cadastrar um novo pintor\n"
					+"Digite 3 para buscar as obras de um pintor\nDigite 4 para listar todos os quadros cadastrados\n"
					+"Digite 5 para encerrar o programa", "Menu de opcoes", JOptionPane.QUESTION_MESSAGE).trim();
			} catch(NullPointerException excecao)
			{
				JOptionPane.showMessageDialog(null, "Digite os dados pedidos", "Operacao Invalida", 
						JOptionPane.WARNING_MESSAGE);
				sairLoop = false;
			}
			//validacao
			if(sairLoop && !Validador.validaOpcaoMenu(opcao))
			{
				JOptionPane.showMessageDialog(null, "Entrada invalida: digite 1, 2, 3, 4 ou 5, conforme a opcao escolhida", 
						"Entrada Invalida", JOptionPane.WARNING_MESSAGE);
				sairLoop = false;
			}
		} while(!sairLoop);
		
		return opcao;
	}
}
