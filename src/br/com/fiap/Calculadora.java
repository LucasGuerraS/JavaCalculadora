package br.com.fiap;

public class Calculadora {

	private int num1;
	private int num2;

	public void setNum1(int num1) {
		try {
			this.num1 = num1;
		} catch (Exception e) {
			System.out.println("Digite um número");
		}
	}

	public int getNum1() {
		return num1;
	}

	public void setNum2(int num2) {
		try {
			if (num2 > 0) {
				this.num2 = num2;
			} else {
				System.out.println("Digite o segundo número de forma que ele seja maior que zero");
			}
		} catch (Exception e) {
			System.out.println("Digite um número");
		}
	}

	public int getNum2() {
		return num2;
	}

	public void soma(int num1, int num2) {
		int soma = getNum1() + getNum2();
		System.out.println("Soma dos números: " + soma + "\nnúmero 1: " + getNum1() + "\nnúmero 2: " + getNum2());
	}

	public void subtracao(int num1, int num2) {
		int subtracao = getNum1() - getNum2();
		System.out.println("Subtração dos números: " + subtracao + "\nnúmero 1: " + getNum1() + "\nnúmero 2: " + getNum2());
	}

	public void divisao(int num1, int num2) {
		int divisao = getNum1() / getNum2();
		System.out.println("Divisão dos números: " + divisao + "\nnúmero 1: " + getNum1() + "\nnúmero 2: " + getNum2());
	}

	public void multiplicacao(int num1, int num2) {
		int multiplicacao = getNum1() * getNum2();
		System.out.println(
				"Multiplicação dos números: " + multiplicacao + "\nnúmero 1: " + getNum1() + "\nnúmero 2: " + getNum2());
	}

}
