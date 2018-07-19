
public class Lanterna {
	private String corCapa;
	private boolean botao;
	private Lampada lampada;
	private int bateria;
	
	public Lanterna(){
		this.lampada = new Lampada("Branca",220);
		this.setCorCapa("Branca");
		this.setBateria(20);
	}// end of constructor
	
	public void status() {
		System.out.println("===STATUS DA LANTERNA===");
		System.out.println(" Cor da Capa: "+this.getCorCapa());
		System.out.println(" Bateria: "+this.getBateria());
		System.out.println(" LAMPADA - cor: "+this.lampada.getCor());
		System.out.println("         - voltagem: "+this.lampada.getVoltagem());
		System.out.println("         - estado: "+this.lampada.estadoLampada());
	}//-----------------------------------
	
	public void mudaEstadoBotao() {
		if(this.lampada.isLigada()) {
			this.lampada.desligar();
		}
		else
			if(this.bateria > 0)
			{
			this.lampada.ligar();
			this.atualizaBateria();
     		//this.setBotao(true);
		    }
			else System.out.println("\n!!! Bateria fraca. Recarregue !!!\n");
	
	}//-----------------------------------
	
	private void atualizaBateria() {
		this.bateria -= 10;
		
	}//-----------------------------------

	public String getCorCapa() {
		return this.corCapa;
	}//-----------------------------------
	
	public boolean getBotao() {
		return this.botao;
	}//-----------------------------------
	
	protected Lampada getLampada() {
		return this.lampada;
	}//-----------------------------------
	
	public int getBateria() {
		return this.bateria;
	}//-----------------------------------
	
	public void setCorCapa(String corCapa) {
		this.corCapa = corCapa;
	}//-----------------------------------
	
	public void setBotao(boolean botao) {
		this.botao = botao;
	}
	
	public void setLampada(Lampada lampada) {
		this.lampada = lampada;
	}//-----------------------------------
	
	public void setBateria(int bateria) {
		this.bateria = bateria;
	}//-----------------------------------
			

}// end of Lanterna
