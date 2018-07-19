import java.util.Scanner;

public class Controle {

	static Lanterna lant = new Lanterna();
	
	public static void main(String[] args) {
		mostraStatusLanterna("Estado inicial da lanterna.");
		
		while(true){
			System.out.println("\nO que queres fazer com a lanterna?");
			System.out.println("1- acender/Apagar a lampada");
			System.out.println("2- mudar a cor da lanterna");
			System.out.print("Escolha: ");
			char op = escolha().charAt(0);
			
			if (op == '1')	acendeLampada();
			if (op == '2')	mudaCor();
			mostraStatusLanterna("Estado atual da lanterna.");
		}
	}////////////////////////////////////////////////////

	private static void mostraStatusLanterna(String string) {
		System.out.println("\n=====================================");
		System.out.println(string);
		System.out.println("...Cor da lanterna: "+lant.getCor()+
				"\n...Bateria: "+lant.getBateria()+
				"\n...lampada: "+lant.getLamp().estadoDaLampada()+
				"\n       cor da Lampada: "+lant.getLamp().getCor()+
				"\n       voltagem: "+lant.getLamp().getVoltagem());
	}////////////////////////////////////////////////////

	private static void mudaCor() {
		System.out.print("\n===== Trocando a Cor da Capa:"
				+ "\n.....Digite a nova cor da capa: ");
		lant.setCor(escolha());
	}////////////////////////////////////////////////////

	private static void acendeLampada() {
		System.out.print(".....Aperte o botao [0]: ");
		char botao = escolha().charAt(0);
		if (botao == '0'){
			
			lant.mudaEstadoBotao();
			//lant.setLamp(); 
		}
	}////////////////////////////////////////////////////

	private static String escolha() {
		Scanner e = new Scanner(System.in);
		return e.nextLine();
	}////////////////////////////////////////////////////
	

}// final classe
