package dio.me.dominandoAlgaritmosIntermediariosComDesafiosdeCodigoJava;

import java.util.Scanner;

/*
 * Um número feliz é um número definido pelo seguinte processo:

• Começando com qualquer número inteiro positivo, substitua o número pela soma dos quadrados de seus dígitos.
• Repita o processo até que o número seja igual a 1 (onde ficará), ou faça um loop infinito em um ciclo que não inclua 1.
• Aqueles números para os quais esse processo termina em 1 são felizes.
• Retorna true se n for um número feliz e false se não for.

* Escreva um algoritmo para determinar se o número n é feliz.
*/

public class NumeroFeliz {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Digite um número inteiro positivo: ");
		int num = sc.nextInt();
		System.out.println(numeroFeliz(num));
		sc.close();
	}

	public static boolean numeroFeliz(int n) {

		String texto = String.valueOf(n);
		if (texto.length() == 1) {
			return Integer.parseInt(texto) == 1;
		}
		int soma = 0;
		do {
			String[] vetor = texto.split("");
			soma = 0;
			for (int i = 0; i < vetor.length; i++) {
				int valor = Integer.parseInt(vetor[i]);
				soma += Math.pow(valor, 2);
			}
			String somaString = String.valueOf(soma);
			if (somaString.length() == 1) {
				return Integer.parseInt(somaString) == 1;
			}
			texto = somaString;

		} while (texto.length() != 1);
		return false;
	}
}