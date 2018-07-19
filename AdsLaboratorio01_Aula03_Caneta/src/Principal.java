
public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Instanciando um objeto
		Caneta c0 = new Caneta();
		Caneta c1 = new Caneta();
		Caneta c2 = new Caneta();
		Caneta c3 = new Caneta();
		
		// c1.status();  // Retorna valores padrao (0, null, etc) se não forem definidos no METODO CONSTRUTOR da classe
		
	/*	c1.marca = "BIC";
		c1.cor = "Preta";
		c1.carga = 80;
		c1.tampada = true;*/
		
		c0.setMarca("BIC");
		c0.setCor("Preta");
		c0.setCarga(80);
		c0.setTampada(false);
		
		c1.setMarca("Pilot");
		c1.setCor("Verde");
		c1.setCarga(70);
		c1.setTampada(false);
		
		c2.setMarca("BIC");
		c2.setCor("Vermelha");
		c2.setCarga(45);
		c2.setTampada(false);
		
		c0.status();
		System.out.print("- TENTATIVA DE RABISCAR: ");
		c0.rabiscar();
		
		c1.status();
		System.out.print("- TENTATIVA DE RABISCAR: ");
		c1.rabiscar();
		c1.status();
		
		c2.status();
		System.out.print("- TENTATIVA DE RABISCAR: ");
		c2.rabiscar();
		
		c3.setCarga(0);
		c3.status();
		System.out.print("*** TENTATIVA DE RABISCAR: ");
		c3.rabiscar();

	}// End of Method main

}// End of Class
