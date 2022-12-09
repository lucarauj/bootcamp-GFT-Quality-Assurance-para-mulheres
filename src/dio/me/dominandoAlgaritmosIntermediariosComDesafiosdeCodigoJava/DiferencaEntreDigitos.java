package dio.me.dominandoAlgaritmosIntermediariosComDesafiosdeCodigoJava;

import java.util.Arrays;
import java.util.Scanner;

/*
 * O desafio consiste em um número inteiro n, onde será necessário calcular a diferença entre o produto e a soma dos seus digitos.
 */

public class DiferencaEntreDigitos {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Digite um número: ");
		int numero = sc.nextInt();

		String numeroEmString = String.valueOf(numero);
		String[] split = numeroEmString.split("");

		int[] ints = Arrays.stream(split).mapToInt(Integer::new).toArray();
		
		int soma = 0;
		int multiplicacao = 1;
		
		for(int i = 0; i < ints.length; i++) {
			
			soma += ints[i];
			multiplicacao *= ints[i];
		}
		
		int resultado = multiplicacao - soma;
		
		System.out.println(resultado);

		sc.close();

	}
}