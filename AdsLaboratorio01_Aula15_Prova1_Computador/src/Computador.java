import java.util.Scanner;

public class Computador {
	private String numeroSerie;
	private Problema problema;
	
	public Computador() { 
		this.setNumeroSerie(digitaNumSerie("Digite o numero de serie do computador ou [ENTER] para retornar: "));
		/*if(this.getNumeroSerie().isEmpty())
			return;*/
	}

	public String getNumeroSerie() {
		return numeroSerie;
	}
	public void setNumeroSerie(String numeroSerie) {
		this.numeroSerie = String.format("%1$10s",numeroSerie);
	}
	public Problema getProblema() {
		return problema;
	}
	public void setProblema(Problema problema) {
		this.problema = problema;
	}
	
	private static String digitaNumSerie(String msg) {
		System.out.print(msg);
		String numSerie = new Scanner(System.in).nextLine();
	    if(numSerie.length()>10)
	    	return digitaNumSerie("Numero de serie deve ter ate 10 caracteres. Tente novamente: ");
		return numSerie;
	}//-----------------------------------


}
