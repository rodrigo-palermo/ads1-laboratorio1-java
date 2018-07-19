// Tarefa: Reescrever a classe Lampada
public class Lampada {
	private String cor;
	private int voltagem;
	private boolean ligada;
	
	public Lampada(){
		this.cor = "Branca";
		this.voltagem = 110;
	}
	
	public Lampada(String cor, int voltagem) {
		this.cor = cor;
		this.voltagem = voltagem;
	}
	
	public void status() {
		//System.out.println("===STATUS===");
		System.out.println("Cor: "+this.getCor());
		System.out.println("Tensao: "+this.getVoltagem());
		System.out.println("A lampada esta "+this.estadoLampada());
	}
	
	public String estadoLampada() {
		if(this.isLigada())
			return "LIGADA";
		return "DESLIGADA";
	}
	
	public String getCor() {
		return this.cor;
	}
	
	public int getVoltagem() {
		return this.voltagem;
	}
	
	public boolean isLigada() {
		return this.ligada;
	}
	
	public void setCor(String cor) {
		this.cor = cor;
	}
	
	public void setVoltagem(int voltagem) {
		this.voltagem = voltagem;
	}
	
	private void setLigada(boolean ligada) {
		this.ligada = ligada;
	}
	
	public void ligar() {
		this.setLigada(true);
	}
	
	public void desligar() {
		this.setLigada(false);
	}

}
