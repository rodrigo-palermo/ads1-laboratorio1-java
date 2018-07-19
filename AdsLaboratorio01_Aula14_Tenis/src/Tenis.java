import java.util.Scanner;



public class Tenis {
	private int    numero;
    private String cor   ;
    private double valor ;
	public int getNumero() {
		return numero;
	}
	
	String cores[]= {"Branca", "Preta", "Prata", "Azul", "Vermelha", "Verde"};
	
	public Tenis() {
		int numero = verificaNumero(teclado("Digite o numero do Tenis (22 a 45) ou [ENTER] para retornar: "));
		if(numero == -1)
			return;
		this.setNumero(numero);
		this.setValor(verificaValor(teclado("Digite o valor do Tenis: ")));
		this.setCor(escolheCor());
	}//-----------------------------------
	private String escolheCor() {
		System.out.println("Selecione a cor do Tenis\n    Cores disponiveis");
		for(int i = 0 ; i < cores.length ; i++)
			System.out.println("    "+(i+1)+": "+cores[i]);
		int numeroCor = verificaNumeroCor(teclado("Selecione o numero conforme a cor: "));
		return cores[numeroCor-1];
	}
	
	private int verificaNumeroCor(String corTxt) {
		try {
			int numero = Integer.parseInt(corTxt);
			if(numero < 1 || numero > cores.length)
				System.out.println("Numero inexistente");
			else return numero;				
		}catch(Exception e) {
			System.out.println("Formato invalido");
		}
		return verificaNumeroCor(teclado("Selecione o numero conforme a cor: "));
		
	}

	private double verificaValor(String valorTxt) {
		try {
			double valor = Double.parseDouble(valorTxt);
			if(valor > 0)
				return valor;
			else System.out.println("Valor negativo ou nulo invalido. ");
		}catch(Exception e) {
			System.out.println("Valor invalido");
		}
		return verificaValor(teclado("Digite o valor do Tenis: "));
	}

	private int verificaNumero(String numeroTxt) {
		if(numeroTxt.isEmpty())
			return -1;
		try {
			int numero = Integer.parseInt(numeroTxt);
			if(numero >= 22 && numero <= 45)
				return numero;				
		}catch(Exception e) {
			System.out.println("Formato invalido");
		}
		System.out.println("Intervalo invalido. ");
		return verificaNumero(teclado("Digite o numero do Tenis (22 a 45) ou [ENTER] para retornar: "));
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}
	public String getCor() {
		return cor;
	}
	public void setCor(String cor) {
		this.cor = cor;
	}
	public double getValor() {
		return valor;
	}
	public void setValor(double valor) {
		this.valor = valor;
	}
	
	public String toString() {
		String saida = "    Numero: " + this.getNumero();
		saida += "  Cor: " + this.getCor();
		saida += "  Valor: " + this.getValor();
		saida += "\n";
		
		return saida;
	}
	
	private static String teclado(String msg) {
		System.out.print(msg);
		return new Scanner(System.in).nextLine();
	}//-----------------------------------

}
