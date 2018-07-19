import java.util.Scanner;

public class Controle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Lampada l1 = new Lampada();
		
		//Pode-se criar outros objetos e alterar manualmente no metodo interruptor.
		//Pode-se alterar o contrutor e adicionar passagem de parametros para modificar os atributos
		
		defineLampada(l1);
		
		while(true) {
			l1.status();
			interruptor(l1);
		}
		
		
		
	}// end of main
	
	public static void interruptor(Lampada lampada) {
		System.out.print("INTERRUPTOR [-]: Digite a tecla [1] para ligar e [2] para desligar!");
		int ex = new Scanner(System.in).nextInt();
		
		if(ex==1)
			lampada.ligar();			
		else if(ex==2)
			lampada.desligar();
		else
			System.out.print("ERRO: Digite a tecla [1] para ligar e [2] para desligar!");
	}// end of method
	
	public static void defineLampada(Lampada lampada) {
		int voltagem = 0;
		String cor = "";
		
		while(voltagem != 110 && voltagem != 220) {
		System.out.println("Defina a voltagem da lampada (110 ou 220): ");
		voltagem = new Scanner(System.in).nextInt();
		}
		lampada.setVoltagem(voltagem);
	
		while(!(cor.equals("B") || cor.equals("A"))) {
		//while(!cor.equals("B") && !cor.equals("A")) {
		//while(cor.equalsIgnoreCase("B") || cor.equalsIgnoreCase("A")) {
		System.out.println("Defina a cor da lampada (B)ranca ou (A)marela: ");
		cor = new Scanner(System.in).next();
		}
		if(cor.equals("B"))
			lampada.setCor("Branca");
		else
			lampada.setCor("Amarela");
			
			
		
		
		
	}// end of method
	

}// end of Class Controle
