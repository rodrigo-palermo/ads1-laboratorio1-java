import java.util.Scanner;

public class Fogao {
	private int bocas = 4;
	private Queimador queimador[] = new Queimador[bocas];  // por que nao consiego declarar aqui como vetor? Pois o vetor estava sem valor de bocas.
	private Botao botao[] = new Botao[bocas];
	
	public Fogao() {
		for(int i = 0; i < bocas; i++) {
			this.queimador[i] = new Queimador();
			this.botao[i] = new Botao();
			//this.queimador[i].setStatus("Apagado");
			//this.botao[i].setPosicao(0);
		}
	}

	public void status() {
		// TODO Auto-generated method stub
		System.out.println("=== STATUS DO FOGAO ===");
		for(int i = 0; i < bocas; i++)
			//System.out.println("botao "+(i+1)+ " posicao "+this.botao[i].getPosicao()+" - " + this.queimador[i].getStatus());
			System.out.println("botao "+(i+1)+ " - " + this.queimador[i].getStatus());

	}

	public void alteraPosicaoDoBotao(int botao, int posicao) {
		this.botao[botao-1].setPosicao(posicao);
		//this.alteraStatusDoQueimador(botao,posicao);
		this.queimador[botao-1].setStatus(posicao);
		
	}

/*/	private void alteraStatusDoQueimador(int botao, int posicao) {
		//String status = "";
		if(posicao == 0) status = "Apagado";
		else if(posicao == 1) status = "Chama baixa";
		else if(posicao == 2) status = "Chama media";
		else if(posicao == 3) status = "Chama alta";
	    this.queimador[botao-1].setStatus(status);
		
	}
/**/
	
}// fim da classe
