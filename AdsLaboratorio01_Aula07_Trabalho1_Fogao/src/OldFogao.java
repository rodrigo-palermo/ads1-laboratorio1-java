import java.util.Scanner;

public class OldFogao {
	private String queimador1;
	private String queimador2;
	private String queimador3;
	private String queimador4;
	private int botao1;
	private int botao2;
	private int botao3;
	private int botao4;
	
	public OldFogao() {
		String queimadorInicial = "Apagado";
		int botaoInicial = 0;
		this.queimador1 = queimadorInicial;
		this.queimador2 = queimadorInicial;
		this.queimador3 = queimadorInicial;
		this.queimador4 = queimadorInicial;
		this.botao1 = botaoInicial;
		this.botao2 = botaoInicial;
		this.botao3 = botaoInicial;
		this.botao4 = botaoInicial;
	}
		

	public String getQueimador1() {
		return queimador1;
	}

	public void setQueimador1(String queimador1) {
		this.queimador1 = queimador1;
	}

	public String getQueimador2() {
		return queimador2;
	}

	public void setQueimador2(String queimador2) {
		this.queimador2 = queimador2;
	}

	public String getQueimador3() {
		return queimador3;
	}

	public void setQueimador3(String queimador3) {
		this.queimador3 = queimador3;
	}

	public String getQueimador4() {
		return queimador4;
	}

	public void setQueimador4(String queimador4) {
		this.queimador4 = queimador4;
	}

	public int getBotao1() {
		return botao1;
	}

	public void setBotao1(int botao1) {
		this.botao1 = botao1;
	}

	public int getBotao2() {
		return botao2;
	}

	public void setBotao2(int botao2) {
		this.botao2 = botao2;
	}

	public int getBotao3() {
		return botao3;
	}

	public void setBotao3(int botao3) {
		this.botao3 = botao3;
	}

	public int getBotao4() {
		return botao4;
	}

	public void setBotao4(int botao4) {
		this.botao4 = botao4;
	}


	public void status() {
		// TODO Auto-generated method stub
		System.out.println("=== STATUS DO FOGAO ===");
		System.out.println("botao 1 - " + this.getQueimador1());
		System.out.println("botao 2 - " + this.getQueimador2());
		System.out.println("botao 3 - " + this.getQueimador3());
		System.out.println("botao 4 - " + this.getQueimador4());
	}


	public int escolheBotao() {
		System.out.println("Escolha o botao [1] [2] [3] [4]");
		int	botao = new Scanner(System.in).nextInt();
		if(botao == 1) return 1;
		if(botao == 2) return 2;
		if(botao == 3) return 3;
		if(botao == 4) return 4;
		return escolheBotao();
		
		
		
	}


	public void alteraStatusQueimador(int botao) {
		System.out.println("Escolha a posicao:\n [0] Apagado\n [1]Chama baixa\n [2]Chama media\n [3]Chama alta");
		int	status = new Scanner(System.in).nextInt();
		if(botao == 1) {
			if(status == 0) this.setQueimador1("Apagada");
			else if(status == 1) this.setQueimador1("Chama baixa");
			else if(status == 2) this.setQueimador1("Chama media");
			else this.setQueimador1("Chama alta");
		}
		if(botao == 2) {
			if(status == 0) this.setQueimador2("Apagada");
			else if(status == 1) this.setQueimador2("Chama baixa");
			else if(status == 2) this.setQueimador2("Chama media");
			else this.setQueimador2("Chama alta");
		}
		if(botao == 3) {
			if(status == 0) this.setQueimador3("Apagada");
			else if(status == 1) this.setQueimador3("Chama baixa");
			else if(status == 2) this.setQueimador3("Chama media");
			else this.setQueimador3("Chama alta");
		}
		if(botao == 4) {
			if(status == 0) this.setQueimador4("Apagada");
			else if(status == 1) this.setQueimador4("Chama baixa");
			else if(status == 2) this.setQueimador4("Chama media");
			else this.setQueimador4("Chama alta");
		}
		
	}

}
