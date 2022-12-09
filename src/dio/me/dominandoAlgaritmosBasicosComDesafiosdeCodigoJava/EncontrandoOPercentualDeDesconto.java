package dio.me.dominandoAlgaritmosBasicosComDesafiosdeCodigoJava;

import java.util.Scanner;

/*
 * O gerente de uma loja resolveu aplicar descontos em todos os seus produtos! 
 * A tarefa é calcular a Porcentagem de Desconto aplicada a esses produtos. 
 * TODO: Retorne o percentual de desconto que foi aplicado no produto
 */

public class EncontrandoOPercentualDeDesconto {

	public static void main(String args[]) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Digite o valor do produto sem desconto: ");
		double valor = sc.nextInt();
		System.out.println("Digite o valor do produto com desconto: ");
		double valorComDesconto = sc.nextInt();

		int percent = (int) (100 - (valorComDesconto / valor * 100));

		System.out.println("O desconto foi de " + percent + "%");

		sc.close();
	}
}