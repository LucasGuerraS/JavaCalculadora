package br.com.fiap;

import javax.swing.JOptionPane;

public class UsaCalculadora {

	public static void main(String[] args) {

		Calculadora calc1 = new Calculadora();
		String aux;

		try {
			aux = JOptionPane.showInputDialog("Digite o valor do n�mero 1");
			calc1.setNum1(Integer.parseInt(aux));
			aux = JOptionPane.showInputDialog("Digite o valor do n�mero 2");
			calc1.setNum2(Integer.parseInt(aux));
			if(calc1.getNum2() > 0) {	
				try {
				aux = JOptionPane.showInputDialog(
						"Digite o valor da opera��o desejada: \n1-Adi��o   \n2-Subtra��o    \n3-Multiplica��o   \n4-Divis�o");
				int escolha = Integer.parseInt(aux);
				if (escolha == 1) {
					calc1.soma(calc1.getNum1(), calc1.getNum2());
				} else if (escolha == 2) {
					calc1.subtracao(calc1.getNum1(), calc1.getNum2());
				} else if (escolha == 3) {
					calc1.multiplicacao(calc1.getNum1(), calc1.getNum2());
				} else if (escolha == 4) {
					calc1.divisao(calc1.getNum1(), calc1.getNum2());
				} else {
					System.out.println("Digite uma das op��es(1-4) ");
				}
			} catch (Exception e) {
				System.out.println("Digite uma op��o de 1 at� 4.");
			}
			}
			
			

		} catch (Exception e) {
			System.out.println("Digite um n�mero v�lido");
		}

	}

}
