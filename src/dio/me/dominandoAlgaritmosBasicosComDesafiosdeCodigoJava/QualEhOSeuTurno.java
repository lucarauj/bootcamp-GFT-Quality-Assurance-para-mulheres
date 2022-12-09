package dio.me.dominandoAlgaritmosBasicosComDesafiosdeCodigoJava;

import java.util.Scanner;

/*
 * Fa�a um Programa que pergunte em que turno voc� estuda. 
 * Pe�a para digitar M-matutino ou V-Vespertino ou N- Noturno. 
 * Imprima a mensagem "Bom Dia!", "Boa Tarde!" ou "Boa Noite!" ou "Valor Inv�lido!", conforme o caso.
 */

public class QualEhOSeuTurno {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		System.out.print("Em que turno voc� estuda? Digite M-matutino, V-Vespertino ou N-Noturno: ");
		char turno = sc.next().toUpperCase().charAt(0);
		
		if (turno == 'M') {
			System.out.println("Bom Dia!");
		} else if (turno == 'V') {
			System.out.println("Boa Tarde!");
		} else if (turno == 'N') {
			System.out.println("Boa Noite!");
		} else {
			System.out.println("Valor inv�lido!");
		}
		
		sc.close();

	}
}
