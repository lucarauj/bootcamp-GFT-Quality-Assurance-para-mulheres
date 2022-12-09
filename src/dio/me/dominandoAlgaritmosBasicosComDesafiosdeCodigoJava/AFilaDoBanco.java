package dio.me.dominandoAlgaritmosBasicosComDesafiosdeCodigoJava;

import java.util.Scanner;

/*
 * Elabore um programa que simule uma fila de atendimento bancário. 
 * O programa deve ler o nome de 3 pessoas (clientes do banco), armazenando-os em uma fila.
 */

public class AFilaDoBanco {

	public static void main(String[] args) {

		String[] nomesFila = new String[3];
		Scanner sc = new Scanner(System.in);

		System.out.println("Cite 3 nomes em ordem de chegada: ");

		nomesFila[0] = sc.next();
		nomesFila[1] = sc.next();
		nomesFila[2] = sc.next();

		for (int i = 0; i < nomesFila.length; i++) {
			System.out.println(nomesFila[i] + " - esta na posicao: " + (i + 1));
		}
		sc.close();
	}
}