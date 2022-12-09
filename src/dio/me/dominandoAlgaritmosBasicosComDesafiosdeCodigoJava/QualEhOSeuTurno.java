package dio.me.dominandoAlgaritmosBasicosComDesafiosdeCodigoJava;

import java.util.Scanner;

/*
 * Faça um Programa que pergunte em que turno você estuda. 
 * Peça para digitar M-matutino ou V-Vespertino ou N- Noturno. 
 * Imprima a mensagem "Bom Dia!", "Boa Tarde!" ou "Boa Noite!" ou "Valor Inválido!", conforme o caso.
 */

public class QualEhOSeuTurno {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		System.out.print("Em que turno você estuda? Digite M-matutino, V-Vespertino ou N-Noturno: ");
		char turno = sc.next().toUpperCase().charAt(0);
		
		if (turno == 'M') {
			System.out.println("Bom Dia!");
		} else if (turno == 'V') {
			System.out.println("Boa Tarde!");
		} else if (turno == 'N') {
			System.out.println("Boa Noite!");
		} else {
			System.out.println("Valor inválido!");
		}
		
		sc.close();

	}
}
