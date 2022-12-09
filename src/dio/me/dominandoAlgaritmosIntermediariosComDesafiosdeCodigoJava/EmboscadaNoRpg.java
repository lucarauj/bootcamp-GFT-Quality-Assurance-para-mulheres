package dio.me.dominandoAlgaritmosIntermediariosComDesafiosdeCodigoJava;

import java.util.Scanner;

/*
 * Voc� e seus amigos est�o jogando uma partida de RPG (Role-Playing Game) utilizando um dado de 10 lados. 
 * Em um determinado momento, em uma masmorra escura, o seu personagem foi emboscado por um terr�vel goblin. 
 * Como em todo bom RPG, temos alguns par�metros que definem os status dos personagens:
 * 
 * Vida: Pontos que devem ser maiores que 0, se n�o o personagem morre.
 * Ataque: Pontos que definem quanto de dano ele inflingir� nos outros personagens.
 * Defesa: Pontos que definem quanto dano ser� mitigado quando ele levar um ataque.
 * 
 * O dado � um modificador desses par�metros. Quando voc� joga o dado o valor dele deve ser somado ao seu ataque ou a sua defesa. 
 * Quando o valor do dado for maior que 8 e menor que 10, o jogador tira um cr�tico e essa soma deve ser DOBRADA.
 * 
 * O dano causado ao jogador � calculado dessa forma: vidaDoJogador - (ataqueInimigo - (defesaDoJogador + dados))
 * 
 * O dano causado ao inimigo � calculado dessa forma: vidaDoInimigo - (ataqueDoJogador + dados)
 * 
 * Caso o jogador sobreviva a emboscada, ele contra-ataca.
 * Para deixar a jogatina mais r�pida, fazendo o computador realizar as contas matem�ticas, 
 * voc� decidiu criar esse programa para verificar se seu personagem vai sobreviver e contra-atacar ou morrer.
 */

public class EmboscadaNoRpg {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int dados = sc.nextInt();
		int vidaDoJogador = sc.nextInt();
		int ataqueDoJogador = sc.nextInt();
		int defesaDoJogador = sc.nextInt();
		int vidaDoInimigo = sc.nextInt();
		int ataqueDoInimigo = sc.nextInt();
		
		int danoJogador;
		int danoInimigo;

		if (dados == 9) {
			danoJogador = vidaDoJogador - (ataqueDoInimigo - 2 * (defesaDoJogador + dados));
			danoInimigo = vidaDoInimigo - 2 * (ataqueDoJogador + dados);
		} else {
			danoJogador = vidaDoJogador - (ataqueDoInimigo - (defesaDoJogador + dados));
			danoInimigo = vidaDoInimigo - (ataqueDoJogador + dados);
		}

		if (danoJogador <= 0) {
			System.out.println("Jogador nao sobreviveu");
		} else if (danoInimigo <= 0) {
			System.out.println("Jogador sobreviveu e derrotou o inimigo");
		} else {
			System.out.println("Jogador sobreviveu e nao derrotou o inimigo");
		}
		sc.close();
	}
}