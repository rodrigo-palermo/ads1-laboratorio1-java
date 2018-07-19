import java.util.Scanner;

public class Problema {
	private String descricaoProblema;
	
	public Problema() { 
		this.setDescricaoProblema(teclado("Digite a descricao do problema ou [ENTER] para retornar: "));
	}
	
	public Problema(String teste) { 
	}

	public String getDescricaoProblema() {
		return descricaoProblema;
	}

	public void setDescricaoProblema(String descricaoProblema) {
		this.descricaoProblema = descricaoProblema;
	}
	
	public String toString() {
		return this.getDescricaoProblema();
	}//-----------------------------------
	
	private static String teclado(String msg) {
		System.out.print(msg);
		return new Scanner(System.in).nextLine();
	}//-----------------------------------
	
	/*public String listaProblema(Problema vProblema[]) {
		String lista = "  == Lista de Problemas ==";
		lista += "\n ITEM   DESCRICAO\n";
		int item = 1;
		for(Problema p:vProblema)
			if(p != null) {
				lista += "  " +item++ + "     " + p + "\n";
			}
		return lista;
	}*/

}
