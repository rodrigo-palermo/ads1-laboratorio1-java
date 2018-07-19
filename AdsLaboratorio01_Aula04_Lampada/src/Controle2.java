import java.util.Scanner;

public class Controle2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Lampada2 l1 = new Lampada2("Branca",110);
		Lampada2 l2 = new Lampada2("Amarela",220);
		
		while(true) {
			interruptor(escolha(l1,l2));
		}
		

	}
	
	public static void interruptor(Lampada2 lampada) {
		//lampada.status();
		System.out.print("Digite (1) para ligar e (2) para desligar a lampada: ");
		int entrada = new Scanner(System.in).nextInt();
		if(entrada == 1)
			lampada.ligar();
		else if (entrada == 2)
			lampada.desligar();
		else System.out.println("Opcao invalida.");
	}// end of main
	
	public static Lampada2 escolha(Lampada2 l1, Lampada2 l2) {
		System.out.println("Lampadas disponiveis: ");
		System.out.println("\n===Opcao [1]===");
		l1.status();
		System.out.println("\n===Opcao [2]===");
		l2.status();
		System.out.print("\nDigite a opcao [1] ou [2] conforme a lampada desejada: ");
		int escolha = new Scanner(System.in).nextInt();
		if(escolha == 1)
			return l1;
		return l2;
	}// end of controle

}// end of class
