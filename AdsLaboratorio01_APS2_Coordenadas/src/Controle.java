import java.util.Scanner;

public class Controle {

	public static void main(String[] args) {
		
		Ponto ponto = new Ponto();

		manipulaPonto(ponto);
		

	}// final do main

	private static void manipulaPonto(Ponto ponto) {
		while(true) {// Desenvolva o restante deste código
			ponto.mostraPonto();
			System.out.println("\n=============");
			System.out.println("1- Incrementa 1 na Coordenada X");
			System.out.println("2- Decrementa 1 na Coordenada X");
			System.out.println("3- Incrementa 1 na Coordenada Y");
			System.out.println("4- Decrementa 1 na Coordenada Y");
			System.out.println("5- Digita valores para X e Y");
			System.out.print (" Escolha: ");
			char escolha = new Scanner(System.in).next().charAt(0);
			if (escolha == '1') {
				ponto.incrementaXY(1, 0);
			}else if (escolha == '2') {
				ponto.decrementaXY(1, 0);
			}else if (escolha == '3') {
				ponto.incrementaXY(0, 1);
			}else if (escolha == '4') {
				ponto.decrementaXY(0, 1);
			}else if (escolha == '5') {
				digitaValoresXY(ponto);
			}
		}//------------------- final do while
	}//----------------------- final do manipula ponto

	private static void digitaValoresXY(Ponto ponto) {
		ponto.setCoordenadaX(digitaValor("X"));
		ponto.setCoordenadaY(digitaValor("Y"));
		
	}

	private static int digitaValor(String coordenada) {
		System.out.println("Digite valor para "+coordenada+": ");
		int valor = new Scanner(System.in).nextInt();
		return valor;
	}


}// final da classe
