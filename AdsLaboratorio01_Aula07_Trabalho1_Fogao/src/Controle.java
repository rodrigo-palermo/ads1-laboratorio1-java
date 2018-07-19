//Alteracoes em 20180516 - Retirada atribuiçao do status do queimador feita em Controle.
// portanto status do queimador passado para metodo privado na propria classe Queimador.

import java.util.Scanner;

public class Controle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner e = new Scanner(System.in);
		int resposta, botao;
		
		//Fogao f1 = new Fogao();
		//FogaoArray fa1 = new FogaoArray();
		Fogao fogao = new Fogao();
		
		while(true){
			System.out.println("1 - Altera posicao do Botao");
			System.out.println("2 - Mostra Status do Fogao");
			System.out.print("Escolha: ");
			resposta = e.nextInt();
			if(resposta == 1) {
				escolheBotao(fogao);
			}
			else if(resposta ==2)
				fogao.status();
			else
				System.out.println("Opcao invalida");
			
		}

	}//fim do main

	private static void escolheBotao(Fogao fogao) {
		System.out.println("Escolha o botao [1] [2] [3] [4]");
		int	botao = new Scanner(System.in).nextInt();
		if(botao > 0 && botao <= 4) 
			alteraPosicaoDoBotao(fogao, botao);
		else
			escolheBotao(fogao);
	}//----------------------------------------------------

	private static void alteraPosicaoDoBotao(Fogao fogao, int botao) {
		System.out.println("Escolha a posicao:\n [0] Apagado\n [1] Chama Baixa\n [2] Chama Media\n [3] Chama Alta");
		int	posicao = new Scanner(System.in).nextInt();
		if(posicao >= 0 && posicao <= 3)
			fogao.alteraPosicaoDoBotao(botao, posicao);
		else
			alteraPosicaoDoBotao(fogao,botao);
			
		
	}//----------------------------------------------------
		

}//fim da classe
