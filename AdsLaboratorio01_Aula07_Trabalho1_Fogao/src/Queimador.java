
public class Queimador {
	String status;
	
	public Queimador(){
		this.status = "Apagado";
	}
	
	public String getStatus() {
		return this.status;
	}
	
	public void setStatus(int status) {
		this.status = escolhePosicao(status);
	}
	
	private String escolhePosicao(int posicao) {
		switch(posicao) {
		case 0: return "Apagado";
		case 1: return "Chama baixa";
		case 2: return "Chama media";
		default: return "Chama alta";
		}
	}

}
