import java.util.Scanner;

public class Saltos {
	
	static Atleta atletas[] = new Atleta[2];

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		mostraMenu();
		
		for(int i = 0; i< atletas.length; i++)
			System.out.println(atletas[i]);
		
		mostraVencedor();

	}// fim do main

	private static void mostraVencedor() {
		Atleta vencedor = atletas[0];
		for(int i = 0; i< atletas.length; i++)
			if(vencedor.media3SaltosValidos() < atletas[i].media3SaltosValidos())
				vencedor = atletas[i];
		System.out.println("\n *** Atleta vencedor: " + vencedor.getNome() );
	}//---------------------------

	private static void mostraMenu() {
		// TODO Auto-generated method stub
		System.out.println("=== Cadastro de atletas ===");
				
		for(int k = 0; k<atletas.length; k++) {
			System.out.print("\nDigite o nome do atleta ["+(k+1)+"]: ");
			String nome = new Scanner(System.in).nextLine();
			atletas[k] = new Atleta(nome);
			System.out.println("\n=== Saltos do Atleta. Insira os valores em metros ===");
			for(int i = 0; i<5; i++)
				atletas[k].setSalto(i,digitaSalto(i));
		}
	}//---------------------------

	private static double digitaSalto(int ordem) {
		System.out.print(" Salto "+(ordem+1)+": ");
		double salto;
		do {
			salto = new Scanner(System.in).nextDouble();
			if(salto < 0)
				System.out.println(" !!! Valor negativo invalido. Digite novo valor !!!");
		}while(salto < 0);
		return salto;
	}//---------------------------

}//fim da classe
