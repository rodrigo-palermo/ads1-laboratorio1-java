
public class Lampada {
	private boolean ligada;   // (true)ligada ou (false)desligada
	private int     voltagem; //110 ou 220
	private String  cor;      // Branca, Amarela
	
	public Lampada(String corEscolhida, int voltagem){
		setVoltagem(voltagem);
		setCor(corEscolhida);		
	}// -------- final construtor

	private void setCor(String cor){
		this.cor = cor;
	}// ------- final
	
	public String getCor(){
		return cor;
	}// ------- final

	private void setVoltagem(int voltagem){
		this.voltagem = voltagem;
	}// ------- final metodo
	
	public int getVoltagem(){
		return voltagem;
	}// ------- final 
	

	private boolean getLampada() {
		return ligada;
	}// ------- final 

	protected void setLampada(boolean lampada) {
		this.ligada = lampada;
	}// ------- final 

	public String estadoDaLampada() {
		if (getLampada())
			return "LIGADA";
		return "DESLIGADA";
		
	}//-------- final
	
	private void setEstado() {
		if (getLampada())
			setLampada(false);
		else 
			setLampada(true);
	}// ------- final 
	protected void mudaEstadoLampada() {
		if (getLampada())
			setLampada(false);
		else 
			setLampada(true);
	}// ------- final 
}//-----------------------------final classe
