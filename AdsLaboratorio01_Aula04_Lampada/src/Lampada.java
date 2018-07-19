
public class Lampada {
	private boolean ligada;
	private int voltagem;
	private String cor;
	
	public Lampada() {
		this.ligada = false;
		this.voltagem = 110;
		this.cor = "Branca";
	}
	
	public void status() {
		System.out.println("=======LAMPADA======");
		System.out.println("Status: "+this.ligadoDesligado());
		System.out.println("Voltagem: "+this.getVoltagem());
		System.out.println("Cor: "+this.getCor());
		System.out.println("-------------------");
	}
	
	public boolean getLigada() {
		return this.ligada;  //Pode-se alterar aqui para informar Ligada, se true, e Desligada, se false
	}
	
	public String ligadoDesligado() {
		if(this.getLigada())
			return "LIGADA";
		return "DESLIGADA";  // não precisa de ELSE, pois se cair no return anterior, ja saira do metodo
	}
	
	public int getVoltagem() {
		return voltagem;
	}

	public void setVoltagem(int voltagem) {
		this.voltagem = voltagem;
	}

	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}

	public void setLigada(boolean ligada) {
		this.ligada = ligada;
	}
	public void ligar() {
		this.setLigada(true);
		//System.out.println("Lampada ligada!");  //RETIRADO apos implementar metodo ligadoDesligado()
		
	}
	public void desligar() {
		this.setLigada(false);
		//System.out.println("Lampada desligada!"); //RETIRADO apos implementar metodo ligadoDesligado()
	}

}
