import java.util.Scanner;

public class Controle {
	
	static Pessoa vPessoa[] = new Pessoa[20]; 
	static int larguraMenu = 40;

	public static void main(String[] args) {
		mostraControle();
		System.out.println("\nPrograma Finalizado");

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
		String menu = formataEspacamento(divisorHorizontal("-"),"+");
		menu += formataEspacamento("MENU","|");
		menu += formataEspacamento(divisorHorizontal("-"),"+");
		menu += formataEspacamento("1- Cadastra","|");
		menu += formataEspacamento("2- Lista","|");
		menu += formataEspacamento("3- Relatorio","|");
		menu += formataEspacamento("0 ou ENTER - Sair do Programa","|");
		menu += formataEspacamento(divisorHorizontal("-"),"+");
		System.out.println(menu);
		
		String escolha = teclado("  Escolha uma opcao: ");
		if(escolha.isEmpty()) return;
		switch(escolha.charAt(0)) {
		case '0': return;
		case '1': cadastra(); break;
		case '2': lista(); break;
		case '3': geraRelatorio(); break;
		default: System.out.println("\nOpcao invalida. Tente novamente\n"); break;
		
		}
		
		mostraControle();
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
