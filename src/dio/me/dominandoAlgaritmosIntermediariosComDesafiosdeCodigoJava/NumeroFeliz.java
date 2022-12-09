package dio.me.dominandoAlgaritmosIntermediariosComDesafiosdeCodigoJava;

import java.util.Scanner;

/*
 * Um n�mero feliz � um n�mero definido pelo seguinte processo:

� Come�ando com qualquer n�mero inteiro positivo, substitua o n�mero pela soma dos quadrados de seus d�gitos.
� Repita o processo at� que o n�mero seja igual a 1 (onde ficar�), ou fa�a um loop infinito em um ciclo que n�o inclua 1.
� Aqueles n�meros para os quais esse processo termina em 1 s�o felizes.
� Retorna true se n for um n�mero feliz e false se n�o for.

* Escreva um algoritmo para determinar se o n�mero n � feliz.
*/

public class NumeroFeliz {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Digite um n�mero inteiro positivo: ");
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