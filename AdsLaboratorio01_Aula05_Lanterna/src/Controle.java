/*
 * Com base no exerc�cio anterior.
Crie uma classe 'Lanterna'.
Esta classe ter� os seguintes atributos:
-lampada (Lampada)
-botao   (boolean)
-corCapa (String )
-bateria (Integer)

-O atributo lampada ter� as mesmas caracter�siticas de funcionamento do 
 exercicios anterior.
-O atributo bot�o apenas refletir� a situa��o de lampada ligada(true) e
 lampada desligada (false).
-O atributo corCapa ser� sempre 'Branca'. Padr�o de f�brica.
-Instanciar bateria em 100, e reduzir em 1 ou 10% ap�s uso

No m�todo main do controle podes criar um menu com as op��es:
 1- liga/desliga a lanterna
 2- altera cor da capa da lanterna
 */
import java.util.Scanner;

public class Controle {

	public static void main(String[] args) {

		Lanterna lant1 = new Lanterna(); 
		
		lant1.status();
		
		while(true) {
			System.out.println("Digite: ");
			System.out.println("(1) para ligar/desligar a lanterna");
			System.out.println("(2) para alterar a cor da capa");
			char opcao = escolha().charAt(0);
		
			if(opcao == '1')	acendeLampada(lant1);
			if(opcao == '2')	mudaCorCapa(lant1);
			lant1.status();
		
		}

	}// end of main
	
	private static void acendeLampada(Lanterna lanterna) {
		System.out.println("Digite (0) para apertar o botao:");
		char opcao = escolha().charAt(0);
		
		if(opcao == '0') lanterna.mudaEstadoBotao();
	}////////////////////////////////////////////////
	
	private static void mudaCorCapa(Lanterna lanterna) {
		System.out.println("Escreva a nova cor da capa: ");
		lanterna.setCorCapa(new Scanner(System.in).nextLine());
	}/////////////////////////////////////////////////
	
	private static String escolha() {
		String opcao = new Scanner(System.in).nextLine(); 
		return opcao;
	}/////////////////////////////////////////////////


}// end of class
