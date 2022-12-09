package dio.me.dominandoAlgaritmosBasicosComDesafiosdeCodigoJava;

import java.util.Scanner;

/*
 * Fa�a um programa que pe�a para 3 pessoas a sua idade, 
 * ao final o programa dever� verificar se a m�dia de idade da turma varia entre 0 e 25, 26 e 60 e maior que 60; 
 * e ent�o, dizer se a turma � jovem, adulta ou idosa, conforme a m�dia calculada.
 */

public class MediaDeIdade {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int idade1 = sc.nextInt();
		int idade2 = sc.nextInt();
		int idade3 = sc.nextInt();

		double media = (idade1 + idade2 + idade3) / 3;

		if (media >= 0 && media <= 25) {
			System.out.println("Jovem!");
		} else if (media > 25 && media <= 60) {
			System.out.println("Adulta!");
		} else {
			System.out.println("Idosa!");
		}

		sc.close();

	}
}
