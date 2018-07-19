
public class Atleta {
	private String nome;
	private Double saltos[] = new Double[5];
	
	public Atleta(String nome) {
		this.nome = nome;
		for(int i = 0; i<this.saltos.length; i++)
			saltos[i] = 0.0;

	}//------------------------

	public String getNome() {
		return nome;
	}//------------------------

	public void setNome(String nome) {
		this.nome = nome;
	}//------------------------
	
	public void setSalto(int indice,double valor) {
		this.saltos[indice] = valor;
	}//------------------------
	
	private double piorSalto() {
		double pior = this.saltos[0];
		for(int i = 0; i<this.saltos.length; i++)
			if(this.saltos[i]<pior)
				pior = this.saltos[i];
		return pior;
	}//------------------------
	
	private double melhorSalto() {
		double melhor = this.saltos[0];
		for(int i = 0; i<this.saltos.length; i++)
			if(this.saltos[i]>melhor)
				melhor = this.saltos[i];
		return melhor;
	}//------------------------
	
	private double mediaSaltos() {
		double soma = 0;
		for(int i = 0; i<this.saltos.length; i++)
			soma += this.saltos[i];
		return soma/5;
	}//------------------------
	
	public double media3SaltosValidos() {
		double soma = 0;
		for(int i = 0; i<this.saltos.length; i++)
			soma += this.saltos[i];
		return (soma-this.piorSalto()-this.melhorSalto())/3;
	}//------------------------
	
	public String toString() {
		String relatorio = "\n=== Relatorio do Atleta ===";
		relatorio += "\n Nome: " + this.nome;
		//for(int i = 0; i<this.saltos.length; i++)
		//	relatorio += "\nSalto " + (i+1) + ": " + this.saltos[i];
		relatorio += "\n Pior salto: " + this.piorSalto();
		relatorio += "\n Melhor salto: " + this.melhorSalto();
		relatorio += "\n Media dos 5 saltos: " + this.mediaSaltos();
		relatorio += "\n Media dos 3 saltos validos: " + this.media3SaltosValidos();
		return relatorio;
	}//------------------------

	

}
