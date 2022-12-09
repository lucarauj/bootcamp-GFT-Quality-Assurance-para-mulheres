package dio.me.dominandoAlgaritmosIntermediariosComDesafiosdeCodigoJava;

import java.util.Scanner;

/*
 * Voc� e seus amigos est�o em uma aula de cria��o de jogos. 
 * Para inspirar os alunos e treinar, o professor pediu para que voc�s fizessem um jogo que j� existe com alguma modifica��o. 
 * A escolha de voc�s foi "Pedra, Papel e Tesoura" e a modifica��o foi mudar Pedra para Flecha, Papel para Escudo e Tesoura para Espada.
 * Ent�o, voc�s escolheram um n�mero para representar cada um dos par�metros. Sendo:
 * 1 - Flecha
 * 2 - Escudo
 * 3 - Espada
 */

/*
 * � Flecha(1) ganha da Espada(3)
 * � Espada(3) ganha do Escudo(2)
 * � Escudo(2) ganha da Flecha(1)
 */

public class FlexaEscudoOuEspada {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("[Jogador 1] Escolha: 1 - Flecha, 2 - Escudo ou 3 - Espada: ");
		String jogadaJogador = sc.next();
		System.out.println("[Jogador 2] Escolha: 1 - Flecha, 2 - Escudo ou 3 - Espada: ");
		String jogadaInimigo = sc.next();

		String resultadoParcial = jogadaJogador + jogadaInimigo;
		int resultadoFinal = Integer.parseInt(resultadoParcial);

		switch (resultadoFinal) {
		case 11:
			System.out.println("Empatou");
			break;
		case 12:
			System.out.println("Perdeu");
			break;
		case 13:
			System.out.println("Ganhou");
			break;
		case 21:
			System.out.println("Ganhou");
			break;
		case 22:
			System.out.println("Empatou");
			break;
		case 23:
			System.out.println("Perdeu");
			break;
		case 31:
			System.out.println("Perdeu");
			break;
		case 32:
			System.out.println("Ganhou");
			break;
		case 33:
			System.out.println("Empatou");
			break;
		default:
			System.out.println("Valor inv�lido");
		}

		sc.close();
	}
}