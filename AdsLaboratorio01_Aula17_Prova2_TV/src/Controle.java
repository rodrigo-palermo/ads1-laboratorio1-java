import java.util.Scanner;

public class Controle {
	
	static TV tv = new TV();
	static int[] canaisDisponiveis = {2,4,5,7,10,12,20,36};
	static int larguraMenu = 35;

	public static void main(String[] args) {
		mostraControle();
		System.out.println("\nTelevisor desligado");

	}//end of main
	
	private static void cadastra() {
		// TODO Auto-generated method stub
		
	}//-----------------------------------
	
	private static void lista() {
		// TODO Auto-generated method stub
		
	}//-----------------------------------

	private static void geraRelatorio() {
		// TODO Auto-generated method stub
		
	}//-----------------------------------

	private static void mostraControle() {
		String menu ="\n       \\       /";
		menu +=      "\n        \\     /";
		menu +=      "\n         \\   /";
		menu +=      "\n          \\ /";
		menu +=      "\n           o\n";
		menu += formataEspacamento(divisorHorizontal("-"),"+");
		menu += formataEspacamento("         Rodrigo Television","|");
		menu += formataEspacamento(divisorHorizontal("-"),"+");
		menu += formataEspacamento("1- Canal......["+tv.getCanal()+"]","|");
		menu += formataEspacamento("2- Volume.....["+tv.getVolume()+"]","|");
		menu += formataEspacamento("3- Brilho.....["+tv.getBrilho()+"]","|");
		menu += formataEspacamento("4- Contraste..["+tv.getContraste()+"]","|");
		menu += formataEspacamento("5- Mudo.......["+tv.getMudo()+"]","|");
		menu += formataEspacamento("0 ou ENTER - Deligar o televisor","|");
		menu += formataEspacamento(divisorHorizontal("-"),"+");
		System.out.println(menu);
		
		String escolha = teclado("  Escolha uma opcao para alterar: ");
		if(escolha.isEmpty()) return;
		switch(escolha.charAt(0)) {
		case '0': return;
		case '1': tv.setCanal(alteraCanal()); break;
		case '2': menuAltera("volume"); break;
		case '3': menuAltera("brilho"); break;
		case '4': menuAltera("contraste"); break;
		case '5': tv.alteraMudo(); break;
		
		default: System.out.println("\nOpcao invalida. Tente novamente\n"); break;		
		}
		
		mostraControle();
	}//-----------------------------------
	
	/*private static void menuAlteraContraste() {
		// TODO Auto-generated method stub
		
	}//-----------------------------------

	private static void menuAlteraBrilho() {
		char novoVolume = 'c';
		while(novoVolume != '0') {
			novoVolume = alteraVolume();
			tv.alteraVolume(novoVolume);
			System.out.println("VOLUME: ["+tv.getVolume()+"]");
		}
	}//-----------------------------------*/

	private static void menuAltera(String opcao) {
		char novoValor = 'c';
		while(novoValor != '*') {
			novoValor = alteraValor();
			if(opcao.equals("volume")) {
				tv.alteraVolume(novoValor);
				System.out.println("VOLUME: ["+tv.getVolume()+"]");
			}
			else if(opcao.equals("brilho")) {
				tv.alteraBrilho(novoValor);
				System.out.println("BRILHO: ["+tv.getBrilho()+"]");
			}
			else if(opcao.equals("contraste")) {
				tv.alteraContraste(novoValor);
				System.out.println("CONTRASTE: ["+tv.getContraste()+"]");
			}
			
		}
	}//-----------------------------------

	private static char alteraValor() {
		System.out.println("\n Altere com teclas (+) ou (-). Finalize com [ENTER]");
		String valor = teclado("");
		if(valor.isEmpty())
			return '*';
		try {
			char valorChar = valor.charAt(0);
			if(valorChar == '+' || valorChar == '-')
				return valorChar;
			else
				System.out.println("Tecla invalida!");
		}catch(Exception e) {
			System.out.println("Tecla invalida");
		}
		return alteraValor();
	}//-----------------------------------

	private static int alteraCanal() {
		System.out.println("\n Canais Disponíveis: " + mostraCanais());
		String canal = teclado("Escolha o canal ou [ENTER] para retornar: ");
		if(canal.isEmpty())
			return tv.getCanal();
		try {
			int canalInt = Integer.parseInt(canal);
			if(canalExiste(canalInt))
				return canalInt;
			else
				System.out.println("Canal inexistente!");
		}catch(Exception e) {
			System.out.println("Canal com caracter invalido");
		}
		return alteraCanal();
		
	}//-----------------------------------

	private static boolean canalExiste(int canal) {
		for(int i = 0; i < canaisDisponiveis.length; i++)
			if(canaisDisponiveis[i] == canal)
				return true;
		return false;
	}//-----------------------------------

	private static String mostraCanais() {
		String canais = "";
		for(int i = 0; i < canaisDisponiveis.length; i++) {
			canais += canaisDisponiveis[i];
			if(i < canaisDisponiveis.length - 1)
				canais += ", ";
		}
		return canais;
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
