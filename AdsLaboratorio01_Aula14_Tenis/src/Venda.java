import java.util.Scanner;

public class Venda {
	
	static Tenis vTenis[] = new Tenis[20];
    static int larguraMenu = 40;
    
	public static void main(String[] args) {
		mostraControle();
		System.out.println("\nPrograma Finalizado");

	}//end of main
	
	private static void mostraControle() {
		String menu = formataEspacamento(divisorHorizontal("-"),"+");
		menu += formataEspacamento("MENU","|");
		menu += formataEspacamento(divisorHorizontal("-"),"+");
		menu += formataEspacamento("1- Cadastra Tenis","|");
		menu += formataEspacamento("2- Lista Todos Tenis","|");
		menu += formataEspacamento("3- Lista por Numero","|");
		menu += formataEspacamento("4- Lista por Cor","|");
		menu += formataEspacamento("0 ou ENTER - Sair do Programa","|");
		menu += formataEspacamento(divisorHorizontal("-"),"+");
		System.out.println(menu);
		
		String escolha = teclado("  Escolha uma opcao: ");
		if(escolha.isEmpty()) return;
		switch(escolha.charAt(0)) {
		case '0': return;
		case '1': cadastraTenis(); break;
		case '2': listaTodosTenis(); break;
		case '3': listaPorNumero(); break;
		case '4': listaPorCor(); break;
		default: System.out.println("\nOpcao invalida. Tente novamente\n"); break;		
		}
		
		mostraControle();
	}//-----------------------------------
	
	private static void cadastraTenis() {
		if(!cadastroCompleto()) {
			int posicao = posicaoDisponivel();
			vTenis[posicao] = new Tenis();
			if(vTenis[posicao].getNumero() == -1)
				vTenis[posicao] = null;
		}
		else System.out.println("Cadastro completo.");
		
	}

	private static int posicaoDisponivel() {
		int posicao = 0;
		for(Tenis t:vTenis)
			if(t != null)
				posicao++;
		return posicao;
	}

	private static boolean cadastroCompleto() {
		for(Tenis t:vTenis)
			if(t == null)
				return false;
		return true;
	}

	private static void listaTodosTenis() {
		if(posicaoDisponivel() != 0) {
			System.out.println("== Lista de Tenis ==");
			for(Tenis t:vTenis)
				if(t != null)
					System.out.println(t);
			mostraTotal();
		}
		else System.out.println("== Lista vazia ==");		
		
	}

	private static void mostraTotal() {
		double total = 0;
		for(Tenis t:vTenis)
			if(t != null)
				total+=t.getValor();
		System.out.println("\n        Total R$: "+total+"\n");
		
	}

	private static void listaPorNumero() {
		// TODO Auto-generated method stub
		
	}

	private static void listaPorCor() {
		// TODO Auto-generated method stub
		
	}

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
