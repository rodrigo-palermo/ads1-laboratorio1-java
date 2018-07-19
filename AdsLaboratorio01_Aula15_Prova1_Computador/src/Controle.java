import java.util.Scanner;

public class Controle {
	
	static Computador vComputador[]  = new Computador[20];
	static Problema   vProblema  []  = new Problema  [7]; 
	static int larguraMenu = 40;

	public static void main(String[] args) {
		mostraControle();
		System.out.println("\nPrograma Finalizado");

	}//end of main
	
	private static void cadastraComputador() {
		if(temProblemaCadastrado())
			if(!cadComputadorCompleto()) {
				Computador cAux = new Computador();
				if(!cAux.getNumeroSerie().isEmpty()) {		
					cAux.setProblema(vProblema[escolheProblema()]);
					vComputador[posicaoComputador()]= cAux;					
				}
			}
			else System.out.println("\nCadastro de computadores esta completo!");
		else System.out.println("\nAinda nao existem problemas cadastrados. Cadastre pelo menos um.\n");
		
	}//-----------------------------------
	
	private static int escolheProblema() {
		System.out.println("Escolha um item conforme numeracao da lista de problemas");
		listaProblemas();
		try {
			int escolha = Integer.parseInt(teclado(" Escolha: "))-1;
			if(escolha >= 0 && escolha < posicaoProblema())
				return escolha;
			else System.out.println("\nItem fora do intervalo. Tente novamente.\n");
		}catch(Exception e) {
			System.out.println("\nFormato invalido.\n");
		}
		return escolheProblema();
		
	}//-----------------------------------

	private static int posicaoComputador() {
		int posicao = 0;
		for(Computador c:vComputador)
			if(c == null)
				return posicao;
			else posicao++;
		return posicao;
	}//-----------------------------------

	private static boolean cadComputadorCompleto() {
		for(Computador c:vComputador)
			if(c == null)
				return false;
		return true;
	}//-----------------------------------

	private static boolean temProblemaCadastrado() {
		for(Problema p:vProblema)
			if(p != null)
				return true;
		return false;
	}//-----------------------------------

	private static void relatorioComputador() {
		if(temComputadorCadastrado()) {
			String lista = " == Lista de Computadores ==";
			lista += "\n COMPUTADOR   PROBLEMA\n";
			//int item = 1;
			for(Computador c:vComputador)
				if(c != null) {
					lista += " " + c.getNumeroSerie() + "   " + c.getProblema() + "\n";
				}
			System.out.println(lista);
			
		}
		else System.out.println("\nAinda nao existem computadores cadastrados. Cadastre pelo menos um.\n");
		
	}//-----------------------------------

	private static boolean temComputadorCadastrado() {
		for(Computador c:vComputador)
			if(c != null)
				return true;
		return false;
	}//-----------------------------------

	private static void cadastraProblemas() {
		if(!cadProblemaCompleto()) {
			Problema pAux = new Problema();
			if(!pAux.getDescricaoProblema().isEmpty())
				vProblema[posicaoProblema()]= pAux;
		}
		else System.out.println("\nCadastro de problemas esta completo!\n");
		
	}//-----------------------------------
	
	private static int posicaoProblema() {
		int posicao = 0;
		for(Problema p:vProblema)
			if(p == null)
				return posicao;
			else posicao++;
		return posicao;
	}//-----------------------------------

	private static boolean cadProblemaCompleto() {
		for(Problema p:vProblema)
			if(p == null)
				return false;
		return true;
	}//-----------------------------------

	private static void listaProblemas() {
		if(temProblemaCadastrado()) {
			String lista = "  == Lista de Problemas ==";
			lista += "\n ITEM   DESCRICAO\n";
			int item = 1;
			for(Problema p:vProblema)
				if(p != null) {
					lista += "  " +item++ + "     " + p + "\n";
				}
			System.out.println(lista);
			
		}
		else System.out.println("\nAinda nao existem problemas cadastrados. Cadastre pelo menos um.\n");
		
	}//-----------------------------------
	
	private static void relatorioPorProblemas() {
		if(temComputadorCadastrado()) {
			int total = 0;
			String relatorio = "\n== Listagem de computadores conforme o problema ==\n";
			Problema problemaEscolhido = vProblema[escolheProblema()];
			relatorio += "PROBLEMA: " + problemaEscolhido.getDescricaoProblema();
			relatorio += "\n  Computador(s) afetado(s): ";
			for(Computador c:vComputador)
				if(c != null && c.getProblema().equals(problemaEscolhido)) {
					relatorio += "\n    " + c.getNumeroSerie();
					total++;
				}
			relatorio += "\n\nTOTAL: " + total;
			System.out.println(relatorio);
		}
		else System.out.println("\nAinda nao existem computadores cadastrados. Cadastre pelo menos um.\n");
		
	}//-----------------------------------
	
	private static void mostraControle() {
		String menu = formataEspacamento(divisorHorizontal("-"),"+");
		menu += formataEspacamento("MENU","|");
		menu += formataEspacamento(divisorHorizontal("-"),"+");
		menu += formataEspacamento("1- Cadastra Computador","|");
		menu += formataEspacamento("2- Relatorio Computador","|");
		menu += formataEspacamento("3- Cadastra Problemas","|");
		menu += formataEspacamento("4- Lista Problemas","|");
		menu += formataEspacamento("5- Relatorio por Problema","|");
		menu += formataEspacamento("6 ou ENTER - Finaliza o Programa","|");
		menu += formataEspacamento(divisorHorizontal("-"),"+");
		System.out.println(menu);
		
		String escolha = teclado("  Escolha uma opcao: ");
		if(escolha.isEmpty()) return;
		switch(escolha.charAt(0)) {
		case '6': return;
		case '1': cadastraComputador(); break;
		case '2': relatorioComputador(); break;
		case '3': cadastraProblemas(); break;
		case '4': listaProblemas(); break;
		case '5': relatorioPorProblemas(); break;
		//case '9': cadastraProblemaTeste(); break;
		default: System.out.println("\nOpcao invalida. Tente novamente\n"); break;		
		}
		
		mostraControle();
	}//-----------------------------------

	private static void cadastraProblemaTeste() {
		vProblema[0] = new Problema("null");
		vProblema[1] = new Problema("null");
		vProblema[0].setDescricaoProblema("Mouse");
		vProblema[1].setDescricaoProblema("Teclado");
		
	}//-----------------------------------

	private static String formataEspacamento(String string, String borda) {
		return string = String.format(borda+"%-"+larguraMenu+"s"+borda,string)+"\n";
	}//-----------------------------------

	private static String divisorHorizontal(String caractere) {
		String divisor = "";
		for(int i = 0; i < larguraMenu; i++)
			divisor +=caractere;
		return divisor;
	}//-----------------------------------

	private static String teclado(String msg) {
		System.out.print(msg);
		return new Scanner(System.in).nextLine();
	}//-----------------------------------

}//end of class
