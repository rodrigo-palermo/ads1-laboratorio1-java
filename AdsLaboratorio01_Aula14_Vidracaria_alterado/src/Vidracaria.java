import java.util.Scanner;

import javax.print.DocFlavor.STRING;

public class Vidracaria {
	
	static Pedido vPedidos[] = new Pedido[20];
	static int larguraMenu = 40;

	public static void main(String[] args) {
		
		mostraControle();
		System.out.println("\nPrograma Finalizado");
		

	}//end of main

	private static void cadastraPedido() {
		if(!cadastroCompleto()) {
			int posicao = posicao();
			vPedidos[posicao] = new Pedido();
			if(vPedidos[posicao].getNomeCliente().isEmpty())
				vPedidos[posicao] = null;
			/*int posicao = posicao();
			vPedidos[posicao] = new Pedido();
			System.out.println(" -- Cadastro de Pedidos -- ");
			System.out.println("Pedido No: "+ (posicao+1));
			String dataPedido = "";
			while(dataPedido.length() != 10) {
				System.out.print("Data do pedido: ");
				dataPedido = digita();
			}
			vPedidos[posicao].setDataPedido(dataPedido);
			System.out.print("Nome do cliente: ");
			vPedidos[posicao].setNomeCliente(digita());
			System.out.print("Endereco do cliente: ");
			vPedidos[posicao].setEnderecoCliente(digita());
			System.out.print("Telefone do cliente: ");
			vPedidos[posicao].setTelefoneCliente(digita());
			String dataEntrega = "";
			while(dataEntrega.length() != 10) {
				System.out.print("Data de entrega: ");
				dataEntrega = digita();
			}
			vPedidos[posicao].setDataEntrega(dataEntrega);
			String corVidro = "";
			while(!(corVidro.equals("Branco") || corVidro.equals("Verde") || corVidro.equals("Escuro"))) {
				System.out.print("Cor do vidro (Branco, Verde ou Escuro): ");
				corVidro = digita();
			}
			vPedidos[posicao].setCorVidro(corVidro);
			
			vPedidos[posicao].setEspessura(atribuiEspessura());
			
			Double preco = 0.0;
			while(preco <=0.0) {
				System.out.print("Preco: ");
				preco = Double.parseDouble(digita());
			}
			vPedidos[posicao].setPreco(preco);
			*/
		
		}
		else System.out.println(" -- Cadastro completo --");	
		
	}//-----------------------------------
	
	private static void listaPedidos() {
		if(!cadastroVazio()) {
			int posicao = posicao();
			double valorTotal = 0.0;
			System.out.println(" -- Lista Pedidos --");
			System.out.print("   Total de Entregas: ");
			System.out.print(posicao);
			System.out.print("   Valor Total: ");
			for(Pedido p:vPedidos)
				if(p != null)				
					valorTotal += p.getPreco();
			System.out.println(valorTotal);
			for(Pedido p:vPedidos)
				if(p != null)				
					System.out.println(p);
			
			
		}
		else System.out.println(" -- Lista Vazia -- ");
		
	}//-----------------------------------
	
	private static void localizaPedido() {
		if(!cadastroVazio()) {
			System.out.println("Digite o nome do cliente para listar seu(s) pedido(s):");
			String nomeProcurado = digita();
			for(Pedido p:vPedidos)
				if(p != null && p.getNomeCliente().equals(nomeProcurado)) {
					String 
					menu = "\nCliente: ";
					menu+= p.getNomeCliente();
					menu+= "   Fone: ";
					menu+= p.getTelefoneCliente();
					menu+= "\nEndereco: ";
					menu+= p.getEnderecoCliente();
					menu+= "   Valor: ";
					menu+= p.getPreco();
					menu+= "\n      Data Entrega: ";
					menu+= p.getDataEntrega();
					System.out.println(menu);
					}
		
		}	
		else System.out.println(" -- Lista Vazia -- ");
	}//-----------------------------------

	private static double atribuiEspessura() {
		double espessura = 0.0;
		while(espessura != 3.0 && espessura != 4.0 && espessura != 6.0 && espessura != 8.0 && espessura != 10.0) {
			System.out.print("Espessura do vidro (3,4,6,8 ou 10mm): ");
			espessura = Double.parseDouble(digita());
		}
		return espessura;
		
	}

	private static boolean cadastroCompleto() {
		for(Pedido p:vPedidos)
			if(p == null)
				return false;
		return true;
	}//-----------------------------------

	private static boolean cadastroVazio() {
		if(posicao() == 0)
			return true;
		return false;
	}//-----------------------------------

	private static int posicao() {
		int posicao = 0;
		for(Pedido p:vPedidos)
			if(p == null)
				return posicao;
			else posicao++;
		return posicao;
	}//-----------------------------------

	private static String digita() {
		return new Scanner(System.in).nextLine();
		
		
	}//-----------------------------------
	
	private static void mostraControle() {
		String menu = formataEspacamento(divisorHorizontal("-"),"+");
		menu += formataEspacamento("MENU","|");
		menu += formataEspacamento(divisorHorizontal("-"),"+");
		menu += formataEspacamento("1- Cadastra Pedido","|");
		menu += formataEspacamento("2- Lista Pedidos","|");
		menu += formataEspacamento("3- Localiza Pedido","|");
		menu += formataEspacamento("0 ou ENTER - Sair do Programa","|");
		menu += formataEspacamento(divisorHorizontal("-"),"+");
		System.out.println(menu);
		
		String escolha = teclado("  Escolha uma opcao: ");
		if(escolha.isEmpty()) return;
		switch(escolha.charAt(0)) {
		case '0': return;
		case '1': cadastraPedido(); break;
		case '2': listaPedidos(); break;
		case '3': localizaPedido(); break;
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

}
