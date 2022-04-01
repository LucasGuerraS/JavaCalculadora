package br.com.fiap;

import javax.swing.JOptionPane;

public class UsaCalculadora {

	public static void main(String[] args) {

		Calculadora calc1 = new Calculadora();
		String aux;

		try {
			aux = JOptionPane.showInputDialog("Digite o valor do número 1");
			calc1.setNum1(Integer.parseInt(aux));
			aux = JOptionPane.showInputDialog("Digite o valor do número 2");
			calc1.setNum2(Integer.parseInt(aux));
			if(calc1.getNum2() > 0) {	
				try {
				aux = JOptionPane.showInputDialog(
						"Digite o valor da operação desejada: \n1-Adição   \n2-Subtração    \n3-Multiplicação   \n4-Divisão");
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
					System.out.println("Digite uma das opções(1-4) ");
				}
			} catch (Exception e) {
				System.out.println("Digite uma opção de 1 até 4.");
			}
			}
			
			

		} catch (Exception e) {
			System.out.println("Digite um número válido");
		}

	}

}
