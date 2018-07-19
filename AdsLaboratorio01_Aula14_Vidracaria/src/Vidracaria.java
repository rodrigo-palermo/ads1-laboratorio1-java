import java.util.Scanner;

import javax.print.DocFlavor.STRING;

public class Vidracaria {
	
	static Pedidos vPedidos[] = new Pedidos[20];

	public static void main(String[] args) {
		String menu = "\n";
        menu += "\nMENU";
        menu += "\n=========================";
        menu += "\n1- Cadastra Pedido";
        menu += "\n2- Relatório Geral";
        menu += "\n3- Localiza o Pedido";
        menu += "\n   Escolha: ";
        
        while(true){
            System.out.println(menu);
            switch(digita().charAt(0)){
            case '1': cadastraPedido();  break;
            case '2': listaPedidos()  ;  break;
            case '3': localizaPedido(); break;
            default: break;
            }
        }

	}//end of main

	private static void localizaPedido() {
		if(!cadastroVazio()) {
			System.out.println("Digite o nome do cliente para listar seu(s) pedido(s):");
			String nomeProcurado = digita();
			for(Pedidos p:vPedidos)
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

	private static void listaPedidos() {
		if(!cadastroVazio()) {
			int posicao = posicao();
			double valorTotal = 0.0;
			System.out.println(" -- Lista Pedidos --");
			System.out.print("   Total de Entregas: ");
			System.out.print(posicao);
			System.out.print("   Valor Total: ");
			for(Pedidos p:vPedidos)
				if(p != null)				
					valorTotal += p.getPreco();
			System.out.println(valorTotal);
			for(Pedidos p:vPedidos)
				if(p != null)				
					System.out.println(p);
			
			
		}
		else System.out.println(" -- Lista Vazia -- ");
		
	}//-----------------------------------

	private static void cadastraPedido() {
		if(!cadastroCompleto()) {
			int posicao = posicao();
			vPedidos[posicao] = new Pedidos();
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
			
		
		}
		else System.out.println(" -- Cadastro completo --");	
		
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
		for(Pedidos p:vPedidos)
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
		for(Pedidos p:vPedidos)
			if(p == null)
				return posicao;
			else posicao++;
		return posicao;
	}//-----------------------------------

	private static String digita() {
		return new Scanner(System.in).nextLine();
	}//-----------------------------------

}
