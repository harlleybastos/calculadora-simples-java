package calculadoraSimples;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class Calculadora {

	public static void main(String[] args) {

		String n1, n2, op;
		int numero1 = 0;
		int numero2 = 0;
		double resultado = 0;
		int ope;
		JFrame quadro = new JFrame();

		n1 = JOptionPane.showInputDialog("Digite o primeiro n�mero: ");
		numero1 = Integer.parseInt(n1);

		n2 = JOptionPane.showInputDialog("Digite o segundo numero:  ");
		numero2 = Integer.parseInt(n2);

		op = JOptionPane.showInputDialog(
				"Digite o numero correspondente opera��o desejada [0 - SAIR ]: Adi��o - 1 | Subtra��o - 2 | Multiplica��o - 3 | Divis�o - 4 ");
		ope = Integer.parseInt(op);

		switch (ope) {

		case 1:
			resultado = numero1 + numero2;
			JOptionPane.showMessageDialog(quadro, "O resultado �: " + resultado);
			break;
		case 2:
			resultado = numero1 - numero2;
			JOptionPane.showMessageDialog(quadro, "O resultado �: " + resultado);
			break;
		case 3:
			resultado = numero1 * numero2;
			JOptionPane.showMessageDialog(quadro, "O resultado �: " + resultado);
			break;
		case 4:
			resultado = numero1 / numero2;
			JOptionPane.showMessageDialog(quadro, "O resultado �: " + resultado);
			break;
		default:
			JOptionPane.showMessageDialog(quadro, "Op��o inv�lida !");
			break;
		}
	}

}
