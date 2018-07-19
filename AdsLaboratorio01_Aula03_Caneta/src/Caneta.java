
public class Caneta {
	private String marca;
	private String cor;
	private int carga;
	private boolean tampada;  // true -> tampada     false -> destampada
	
	public Caneta() { // METODO CONSTRUTOR - NOME DA CLASSE E NAO TEM TIPO ASSOCIADO
		carga = 100;
	}
	
	public void status() {
		System.out.println("\n=== ESTADO DA CANETA ===");
		System.out.println("Marca: "+this.getMarca());
		System.out.println("Cor: "+this.getCor()); 
		System.out.println("Carga: "+this.getCarga()+"%");
		System.out.println("Tampada: "+this.isTampada());
	}
	
	public void rabiscar() {
		if(isTampada())
			System.out.println("Impossivel rabiscar.");
		else if(getCarga() > 0) {
			System.out.println("Rabiscando...");
			this.carga--; // CORRETO FAZER METODO PARA ISSO, QUE SERIA PRIVADO
		}
		
		else
			System.out.println("Caneta sem carga");
	}
	
	public void tampar() {
		//this.tampada = true; // caso nao exista um METODO
		this.setTampada(true); // existe o METODO
	}
	
	public void destampar() {
		this.setTampada(false);
	}
	
	// METODOS SETTER
	
	/*public void setMarca(String m) { // se nome do atributo for diferente do argumento, nao precisa usar THIS
		marca = m;
	}*/
	
	public void setMarca(String marca) {
		this.marca = marca;
	}
	
	public void setCor(String cor) { // THIS torna-se necessario se nome de ATRIBUTO e ARGUMENTO forem IGUAIS 
		this.cor = cor;
	}


	public void setCarga(int carga) {
		this.carga = carga;
	}
	
	public void setTampada(boolean tampada) {
		this.tampada = tampada;
	}
	
	// METODOS GETTER
	
	public String getMarca() {
		return this.marca;
	}
	
	public String getCor() {
		return this.cor;
	}
	
	private boolean isTampada() {
		return this.tampada;
	}

	public int getCarga() {
		return this.carga;
	}
	


} // End of Class
