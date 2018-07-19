// Ver solucao de MENU do professor. Utiliza recursao para mostrar e executar menu. 
// Verifica se tem posicao nula. Retorna indice
// usar for each
//***************************** REFAZER para incrementar semana q vem (20180509) - 
// nesta data teve semana academica - sem aula

import java.util.Scanner;

public class Cadastro {
	
	static Estado estados[] = new Estado[5];
	static Cidade cidades[] = new Cidade[6];

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char escolha;
		
		do{
			//mostraMenuDeCadastro();  // ENTRADA INT
			//escolha = digitaEscolha();
			
			escolha = escolhaMenu();  //ENTRADA CHAR
			
			switch(escolha) {
			case '1': cadastraEstado(estados); break;
			case '2': listaEstados();          break;
			case '3': cadastraCidade(cidades); break;
			case '4': listaCidades();          break;
			default: break;
			}
			
		//}while(escolha != 0 && escolha < 5); //ENTRADA INT
		}while(escolha != '0');  //ENTRADA CHAR
		
		

	}// fim do main
	
	private static void listaCidades() {
		for(int i=0;i<cidades.length;i++)
			if(cidades[i] != null) {
				System.out.println("Item ["+(i+1)+"]");
				System.out.println("   Cidade: " + cidades[i].getNome());
				System.out.println("   Estado: " + cidades[i].getEstado().getNome() + ", " + cidades[i].getEstado().getSigla());
			}
	}//----------------------------------------

	private static void cadastraCidade(Cidade[] cidades) {
		if(temEspacoEmCidades())
			cidades[indCidades()] = objCidades();
	
	}//-------------------------------------

	private static Cidade objCidades() {
		System.out.println("Digite o nome da cidade");
		String nome = new Scanner(System.in).nextLine();
		System.out.println("Escolha um indice do estado ou digite [0] para cadastrar um novo estado.");
		System.out.println("Lista de Estados:");
		listaEstados();
		int escolha = digitaEscolha();
		if(escolha == 0) {
			cadastraEstado(estados);
			listaEstados();
			escolha = indEstados()-1;  //retorna o item (indice - 1) do estado cadastrado neste metodo
		}
		else escolha--; //retorna o item (indice = itemEscolhido -1)
		return new Cidade(nome,estados[escolha]);
		
	}// --------------------------------

	private static int indCidades() {
	    int indice = 0;
		for(int i=0;i<cidades.length;i++)
	    	if(cidades[i] == null) {
	    		indice = i;
	    		break;
	    	}
		return indice;
    }//----------------------------------------

	private static boolean temEspacoEmCidades() {
		boolean temEspaco = false;
		for(int i=0;i<cidades.length;i++)
	    	if(cidades[i] == null) {
	    		temEspaco = true;
	    		break;
	    	}
		return temEspaco;
    }//----------------------------------------

	private static void listaEstados() {
		for(int i=0;i<estados.length;i++)
			if(estados[i] != null) {
				System.out.println("Item ["+(i+1)+"]");
				System.out.println("   Estado: " + estados[i].getNome());
				System.out.println("   Sigla: " + estados[i].getSigla());
			}
		/*	else
				System.out.println("Lista vazia! Cadastre pelo menos um Estado.");*/
		
	}//-------------------------------------

	private static void cadastraEstado(Estado[] estados) {
		if(temEspacoEmEstados())
			estados[indEstados()] = objEstados();
	}//-------------------------------------

	private static Estado objEstados() {
        System.out.print("Digite o nome do estado: ");
        String nome = new Scanner(System.in).nextLine();
		System.out.print("Digite a silga do estado: ");
        String sigla = new Scanner(System.in).nextLine();
        return new Estado(nome,sigla);
	}//----------------------------------------

	private static int indEstados() {  
		int indice = 0;
		for(int i=0;i<estados.length-1;i++)
			if(estados[i] == null)
				return i;    // OU USAR BREAK AQUI e alterar o codigo. Ver gabarito
		return indice;
	}//-------------------------------------

	private static boolean temEspacoEmEstados() {
		for(int i=0;i<estados.length-1;i++)
			if(estados[i] == null)
				return true;
		return false;
	}//-------------------------------------

	private static int digitaEscolha() {
		int escolha = new Scanner(System.in).nextInt();
		if(escolha >= 0 && escolha < 5)
			return escolha;
		return digitaEscolha();
		
	}//-------------------------------------

	private static void mostraMenuDeCadastro() {
		System.out.println("=== MENU ===");
		System.out.println("1- Cadastrar Estados");
		System.out.println("2- Listar Estados");
		System.out.println("3- Cadastrar Cidades");
		System.out.println("4- Listar Cidades");
		System.out.println("0- Finaliza");
		System.out.println("\n Escolha: ");
	}//------------------------------------
	
	private static char escolhaMenu() {
		String menu = "=== MENU ===";
		menu += "\n1- Casatrar Estados";
		menu += "\n2- Listar Estados";
		menu += "\n3- Cadastrar Cidades";
		menu += "\n4- Listar Cidades";
		menu += "\n0- Finaliza";
		menu += "\n Escolha: ";
		
		return teclado(menu).charAt(0);
		
	}//----------------------------------------

	private static String teclado(String mensagem) {
		System.out.println(mensagem);
		String teclado = new Scanner(System.in).nextLine();
		return teclado;
	}

}//fim da classe
