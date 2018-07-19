import java.util.Scanner;

public class OldFogaoArray {
	private String[] queimador = new String[4];
	private int[] botao = new int[4];
	
	public OldFogaoArray() {
		for(int i = 0; i < 4; i++) {
			this.queimador[i] = "Apagado";
			this.botao[i] = 0;
		}
	}

	public String getQueimador(int botao) {
		return queimador[botao];
	}

	public void setQueimador(int botao, String status) {
		this.queimador[botao] = status;
	}

	public void status() {
		// TODO Auto-generated method stub
		System.out.println("=== STATUS DO FOGAO ===");
		System.out.println("botao 1 - " + this.getQueimador(0));
		System.out.println("botao 2 - " + this.getQueimador(1));
		System.out.println("botao 3 - " + this.getQueimador(2));
		System.out.println("botao 4 - " + this.getQueimador(3));
	}
	
	public int escolheBotao() {
		System.out.println("Escolha o botao [1] [2] [3] [4]");
		int	botao = new Scanner(System.in).nextInt();
		if(botao == 1) return 0;
		if(botao == 2) return 1;
		if(botao == 3) return 2;
		if(botao == 4) return 3;
		return escolheBotao();
	}

	public void alteraStatusQueimador(int botao) {
		System.out.println("Escolha a posicao:\n [0] Apagado\n [1]Chama baixa\n [2]Chama media\n [3]Chama alta");
		int	status = new Scanner(System.in).nextInt();
		if(status == 0) this.setQueimador(botao,"Apagado");
		else if(status == 1) this.setQueimador(botao,"Chama baixa");
		else if(status == 2) this.setQueimador(botao,"Chama media");
		else if(status == 3) this.setQueimador(botao,"Chama alta");
		else alteraStatusQueimador(botao);
		
	}

}// fim da classe
