package dio.me.dominandoAlgaritmosBasicosComDesafiosdeCodigoJava;

import java.util.Scanner;

/*
 * Dado um inteiro positivo n , retorne o menor inteiro positivo que é um múltiplo 2 de e n.
 */

public class DescubraOMenorMultiplo {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Digite um número inteiro positivo: ");
		int numero = sc.nextInt();
		int minimoMultiplo = 0;

		if (numero % 2 == 0) {
			minimoMultiplo = numero;
		} else {
			minimoMultiplo = numero * 2;
		}

		System.out.println("O resultado eh:" + minimoMultiplo);

		sc.close();
	}
}