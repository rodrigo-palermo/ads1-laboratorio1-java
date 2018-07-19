import java.util.Scanner;

public class SaltosSemArrayDeAtletas {
	
	static Atleta atleta = new Atleta("Rodrigo");

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		mostraMenu();
		System.out.println(atleta);

	}// fim do main

	private static void mostraMenu() {
		// TODO Auto-generated method stub
		System.out.println("=== Saltos do Atleta. Insira os valores em metros ===");
		for(int i = 0; i<5; i++)
			atleta.setSalto(i,digitaSalto(i));
		
	}//---------------------------

	private static double digitaSalto(int ordem) {
		System.out.print("Salto "+(ordem+1)+":");
		double salto;
		do {
			salto = new Scanner(System.in).nextDouble();
			if(salto < 0)
				System.out.println("Valor negativo invalido. Digite novo valor.");
		}while(salto < 0);
		return salto;
	}//---------------------------

}//fim da classe
