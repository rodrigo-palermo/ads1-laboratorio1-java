import java.util.Scanner;

public class Aposta {
    private String nomeDoApostador;
    private String timeEscolhido = "Gremio";
    private String timeAdversario;
    private int    qtGolsTimeEscolhido;
    private int    qtGolsTimeAdversario;
    
    public void cadastraAposta() {
    	setNomeDoApostador(teclado("Digite o nome do Apostador ou [ENTER] para retornar: "));
    	if(this.nomeDoApostador.isEmpty())
    		return;
    	setTimeEscolhido(timeEscolhido);
    	setTimeAdversario(teclado("Digite o time adversario: "));
    	setQtGolsTimeEscolhido(Integer.parseInt(teclado("Digite qtde de gols do Gremio: ")));
    	setQtGolsTimeAdversario(Integer.parseInt(teclado("Digite qtde de gols do time adversario: ")));
	    
    }
    
    public String stringApostas1() {
    	return 
    	"  Apostador: "+this.getNomeDoApostador()+
		"\n    Time Escolhido: "+this.getTimeEscolhido()+
		"\n    Time Adversario: "+this.getTimeAdversario()+
		"\n    Qt. gols do Gremio: "+this.getQtGolsTimeEscolhido()+
		"\n    Qt. gols do time adversario: "+this.getQtGolsTimeAdversario();

    }
    
    public String stringApostas2() {
    	return 
    	"  Apostador: "+this.getNomeDoApostador()+
		"\n    Times: "+this.getTimeEscolhido()+" X "+this.getTimeAdversario()+
		"\n    Placar:     "+this.getQtGolsTimeEscolhido()+" X "+this.getQtGolsTimeAdversario();

    }
    
	public String getNomeDoApostador() {
		return nomeDoApostador;
	}
	public void setNomeDoApostador(String nomeDoApostador) {
		this.nomeDoApostador = nomeDoApostador;
	}
	public String getTimeEscolhido() {
		return timeEscolhido;
	}
	public void setTimeEscolhido(String timeEscolhido) {
		this.timeEscolhido = timeEscolhido;
	}
	public String getTimeAdversario() {
		return timeAdversario;
	}
	public void setTimeAdversario(String timeAdversario) {
		this.timeAdversario = timeAdversario;
	}
	public int getQtGolsTimeEscolhido() {
		return qtGolsTimeEscolhido;
	}
	public void setQtGolsTimeEscolhido(int qtGolsTimeEscolhido) {
		this.qtGolsTimeEscolhido = qtGolsTimeEscolhido;
	}
	public int getQtGolsTimeAdversario() {
		return qtGolsTimeAdversario;
	}
	public void setQtGolsTimeAdversario(int qtGolsTimeAdversario) {
		this.qtGolsTimeAdversario = qtGolsTimeAdversario;
	}
	
	private static String teclado(String msg) {
		System.out.print(msg);
		return new Scanner(System.in).nextLine();
	}//------------------------------------

}
