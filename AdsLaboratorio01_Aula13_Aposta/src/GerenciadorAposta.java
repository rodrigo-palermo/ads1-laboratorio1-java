import java.util.Scanner;

public class GerenciadorAposta {
	
	static Aposta arrayAposta[] = new Aposta[10];
	static Aposta apostasVencedoras[] = new Aposta [arrayAposta.length];
	static Aposta resultadoFinal;
	static String timeEscolhido = "Gremio";
	static double premio = 10000.0;

	public static void main(String[] args) {
		
		char escolha = '0';
		
		while(escolha != '4') {
			mostraMenu();
			escolha = teclado("").charAt(0);
			switch(escolha) {
			case '1': cadastraApostas(); break;
			case '2': listaApostas(); break;
			case '3': relatorioVencedores(); break;
			case '4': System.out.println("\nPrograma finalizado");break;
			//case '9': cadastroTeste(); break;
			default: break;
			}
		}
	}//end of main

	private static void relatorioVencedores() {
		if(posicao() == 0)
			System.out.println("== Lista Vazia. Cadastre as Apostas. ==");
		else {
			System.out.println(" == Relatorio de Vencedores == ");
			adicionaResultadoFinal();
			mostraApostasVencedoras();
			
		}
		
	}//------------------------------------

	private static void mostraApostasVencedoras() {
		int qtApostasVencedoras = apostasVencedoras();
		if (qtApostasVencedoras == 0)
			System.out.println("\n --- Não houve apostas vencedoras! --- ");
		else {
			System.out.println("\n -- Apostas Vencedoras: ");
			for(Aposta v:apostasVencedoras)
				if(v != null) {
					System.out.println(v.stringApostas2());
				}
			String resultado = "\n Total de apostas vencedoras: " + qtApostasVencedoras +
					"\n O premio de R$ " + premio;
			if( qtApostasVencedoras > 0)
				resultado+= " sera dividido, ficando R$ " + (premio/qtApostasVencedoras) + " para cada aposta vencedora.";
			else resultado+= " sera pago para a única aposta vencedora.";
			System.out.println(resultado);
			
		}
		
	}//------------------------------------

	
	
	private static int apostasVencedoras() {
		int i = 0;
		for(Aposta a:arrayAposta)
			if(a != null)
				if(apostaCorreta(a))
					apostasVencedoras[i++] = a;
		
		return i; //qtd de escacos utilizados - numero de apostas vencedoras
	}//------------------------------------



	private static boolean apostaCorreta(Aposta a) {
		if( a.getTimeAdversario().equals(resultadoFinal.getTimeAdversario()) && 
		    a.getQtGolsTimeEscolhido() == resultadoFinal.getQtGolsTimeEscolhido() && 
		    a.getQtGolsTimeAdversario() == resultadoFinal.getQtGolsTimeAdversario()	)
			return true;
		return false;
	}//------------------------------------



	private static void adicionaResultadoFinal() {
		System.out.println(" Entre com o resultado final");
		resultadoFinal = new Aposta();
		resultadoFinal.setNomeDoApostador("Resultado Final");
		resultadoFinal.setQtGolsTimeEscolhido(Integer.parseInt(teclado("Digite qtde de gols do Gremio: ")));
		resultadoFinal.setTimeAdversario(teclado("Digite o time adversario: "));
		resultadoFinal.setQtGolsTimeAdversario(Integer.parseInt(teclado("Digite qtde de gols do time adversario: ")));
	}//------------------------------------

	private static void listaApostas() {
		if(posicao() == 0)
			System.out.println("== Lista Vazia ==");
		else
		{
			int contador = 1;
			System.out.println("== Lista de Apostadores ==");
			for(Aposta a:arrayAposta)
				if(a != null){
                    System.out.println("Aposta No: "+contador++);
					//System.out.println(a+"\n");
                    System.out.println(a.stringApostas2());
				}
				
		}
		System.out.println();		
	}//------------------------------------

	private static void cadastraApostas() {
		System.out.println("=== Cadastro de Apostas ===");
		
		if(!cadastroCompleto()) {
			Aposta aux = new Aposta();
			aux.cadastraAposta();
			if(aux.getNomeDoApostador().isEmpty())
				return;
			int posicao = posicao();
			arrayAposta[posicao] = aux;			
							
		}
		else System.out.println("Impossivel cadastrar novo. Cadastro Completo");		
	}//------------------------------------

	private static int posicao() {
		int posicao = 0;
		for(Aposta a:arrayAposta)
			if(a == null)
				return posicao;
			else posicao++;
		return posicao;
	}//------------------------------------

	private static boolean cadastroCompleto() {
		for(Aposta a:arrayAposta)
			if(a == null)
				return false;
		return true;
	}//------------------------------------

	private static String teclado(String msg) {
		System.out.print(msg);
		return new Scanner(System.in).nextLine();
	}//------------------------------------

	private static void mostraMenu() {
        String menu ="";

        menu+= "\nMenu";

        menu+= "\n----------------------------";

        menu+= "\n1- Cadastro de Apostas";

        menu+= "\n2- Lista de Apostadores";

        menu+= "\n3- Relatório de Vencedores";

        menu+= "\n4- Finaliza";

        menu+= "\n   Escolha: ";
        
        System.out.println(menu);
		
	}//------------------------------------
	
	/** /	private static void cadastroTeste() {
	int posicao = posicao();
	arrayAposta[posicao] = new Aposta();
	arrayAposta[posicao].setNomeDoApostador("Teste 1");
	arrayAposta[posicao].setTimeEscolhido(timeEscolhido);
	arrayAposta[posicao].setTimeAdversario("Inter");
	arrayAposta[posicao].setQtGolsTimeEscolhido(0);
	arrayAposta[posicao++].setQtGolsTimeAdversario(2);
	
	arrayAposta[posicao] = new Aposta();
	arrayAposta[posicao].setNomeDoApostador("Teste 2");
	arrayAposta[posicao].setTimeEscolhido(timeEscolhido);
	arrayAposta[posicao].setTimeAdversario("Inter");
	arrayAposta[posicao].setQtGolsTimeEscolhido(0);
	arrayAposta[posicao++].setQtGolsTimeAdversario(2);
	
	arrayAposta[posicao] = new Aposta();
	arrayAposta[posicao].setNomeDoApostador("Teste 3");
	arrayAposta[posicao].setTimeEscolhido(timeEscolhido);
	arrayAposta[posicao].setTimeAdversario("Inter");
	arrayAposta[posicao].setQtGolsTimeEscolhido(0);
	arrayAposta[posicao].setQtGolsTimeAdversario(3);
	
	}//------------------------------------
	/**/

}//end of class

/** /codigo escrito anteriormente para metodo cadastraApostas(). Depois, passou-se para a classe Aposta
String nome = teclado("Digite o nome do Apostador ou [ENTER] para retornar: ");
if(!nome.isEmpty()) {
	int posicao = posicao();
	arrayAposta[posicao] = new Aposta();
	arrayAposta[posicao].setNomeDoApostador(nome);
	arrayAposta[posicao].setTimeEscolhido(timeEscolhido);
	arrayAposta[posicao].setTimeAdversario(teclado("Digite o time adversario: "));
	arrayAposta[posicao].setQtGolsTimeEscolhido(Integer.parseInt(teclado("Digite qtde de gols do Gremio: ")));
	arrayAposta[posicao].setQtGolsTimeAdversario(Integer.parseInt(teclado("Digite qtde de gols do time adversario: ")));
    
}
/**/


