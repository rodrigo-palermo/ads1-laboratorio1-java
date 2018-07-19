
public class Lanterna {
	private Lampada lamp;
	private String  corCapa;
	private boolean botao;
	private int 	bateria;
	
	public Lanterna(){
		lamp = new Lampada("Branca",110);
		setCor("Branca");
		setBateria(100);
	}

	private void setBateria(int bateria) {
		this.bateria = bateria;
	}
	public int getBateria() {
		return bateria;
	}
	
	protected Lampada getLamp() {
		return lamp;
	}

	private void setLamp() {
		this.lamp.mudaEstadoLampada();   //setEstado();
	}

	public String getCor() {
		return corCapa;
	}

	public void setCor(String cor) {
		this.corCapa = cor;
	}

	private boolean getBotao() {
		return botao;
	}

	private void setBotao(boolean botao) {
		this.botao = botao;	
//		this.botao = !this.botao;
	}
	public void mudaEstadoBotao(){
		if(getBotao()) {
			setBotao(false);
			this.lamp.setLampada(false);
		}
		else {
			setBotao(true);
			if (getBateria()>0) {
				this.lamp.setLampada(true);
				this.atualizaBateria();
			}
		}
	}

	private void atualizaBateria() {
		setBateria(getBateria()-10);
	}
	
}
