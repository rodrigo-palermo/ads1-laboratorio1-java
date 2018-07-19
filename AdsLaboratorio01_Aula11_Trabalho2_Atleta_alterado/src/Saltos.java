import java.util.Scanner;
public class Saltos {
	
	static Atleta atletas[] = new Atleta[10];

	public static void main(String[] args) {
		
		mostraMenu();
		
		System.out.println("Programa finalizado");

	}// fim do main

	private static void listaAtletasESaltos() {
		if(posicao() == 0)
			System.out.println("Lista vazia");
		else {
			System.out.println(" -- Lista de Atletas e Saltos --");
			for(Atleta a:atletas)
				if(a != null)
					System.out.println(a);
		}
		
	}//---------------------------

	private static void cadastraSaltosDeAtletas() {
		if(posicao() == 0)
			System.out.println("Nao exite atletas cadastrados. Insira pelo menos um atleta.");
		else {
			System.out.println(" -- Lista de Atletas e Saltos --");
			int indAtleta = 0;
			for(Atleta a:atletas)
				if(a != null) {
					System.out.print("Opcao "+((indAtleta++)+1));
					System.out.println(a);
				}
			String escolha = teclado("Escolha um atleta para cadastrar os saltos ou [ENTER] retorna: ");
			if(!escolha.isEmpty()) {
				int posicao = Integer.parseInt(escolha)-1;
				if(posicao< 0 || posicao>=posicao()){
					System.out.println("Opcao invalida. Tente outra.");
					cadastraSaltosDeAtletas();
				}
				else if(atletas[posicao].saltosCompletos()) {
					System.out.println("Saltos completos para este atleta. Tente outro.");
					cadastraSaltosDeAtletas();
				}
				else
					atletas[posicao].cadastraSaltos();
			}		
		}	
	}//---------------------------

	
	private static String teclado(String msg) {
		System.out.print(msg);
		return new Scanner(System.in).nextLine();
	}//---------------------------

	private static void mostraMenu() {
		String menu = "MENU";
		menu += "\n====================";
		menu += "\n1- Cadastra atletas";
		menu += "\n2- Cadastra saltos";
		menu += "\n3- Lista atletas e saltos";
		menu += "\n4- Relatorio dos resultados";
		menu += "\n0 ou ENTER - Sair";
		menu += "\n\n   Escolha uma opcao: ";
		
		System.out.println(menu);
		
		String escolhaString = teclado("");
		if(escolhaString.isEmpty())		return;
		switch(escolhaString.charAt(0)) {
		case '1': cadastraAtletas(); break;
		case '2': cadastraSaltosDeAtletas(); break;
		case '3': listaAtletasESaltos(); break;
		case '4': mostraRelatorio(); break;
		case '0': return;
		default: break;
		}
		
		mostraMenu();
		
	}//---------------------------

	private static void mostraRelatorio() {
		Atleta vencedor = atletas[0];
		for(int i = 0; i< atletas.length; i++)
			if(vencedor.media3SaltosValidos() < atletas[i].media3SaltosValidos())
				vencedor = atletas[i];
		System.out.println("\n *** Atleta vencedor: " + vencedor.getNome() );
	}//---------------------------

	private static void cadastraAtletas() {
		System.out.println("=== Cadastro de atletas ===");
		if(cadastroCompleto())
			System.out.println("Cadastro completo.");
		else {
			Atleta aux = new Atleta();
			aux.cadastraAtleta();
			if(!aux.getNome().isEmpty())
				atletas[posicao()]=aux;
				
			
		}
	}//---------------------------

	private static int posicao() {
		int posicao = 0;
		for(Atleta a:atletas)
			if(a == null)
				return posicao;
			else posicao++;
		return posicao;
	}

	private static boolean cadastroCompleto() {
		for(Atleta a:atletas)
			if(a == null)
				return false;
		return true;
	}

}//fim da classe
