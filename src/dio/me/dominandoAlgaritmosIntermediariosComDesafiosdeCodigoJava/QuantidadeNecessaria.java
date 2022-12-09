package dio.me.dominandoAlgaritmosIntermediariosComDesafiosdeCodigoJava;

import java.util.Scanner;

/*
 * Cada pizza é composta por 4 fatias. Há N amigos e cada amigo precisa de exatamente X fatias.
 * Você deverá criar um código capaz de calcular o número mínimo de pizzas que eles devem pedir para satisfazer seu apetite.
 */

public class QuantidadeNecessaria {

	public static void main(String[] args) {
		final int SLICE = 4;
		Scanner sc = new Scanner(System.in);

		System.out.println("Quantos testes?");
		int T = sc.nextInt();

		for (int i = 0; i < T; i++) {

			System.out.println("Quantos amigos?");
			int amigos = sc.nextInt();

			System.out.println("Quantas fatias?");
			int fatias = sc.nextInt();

			double quantidadeFatias = fatias * amigos;

			int quantidadePizzas = (int) Math.ceil((quantidadeFatias / SLICE));

			System.out.println(quantidadePizzas);
		}
		sc.close();

	}
}