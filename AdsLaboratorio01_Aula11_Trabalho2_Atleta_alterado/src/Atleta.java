import java.util.Scanner;

public class  Atleta{
	private String nome;
	private Double saltos[] = new Double[5];
	
	/*public Atleta(String nome) {
		this.nome = nome;
		for(int i = 0; i<this.saltos.length; i++)
			saltos[i] = 0.0;

	}//------------------------
	*/
	
	// TODO Auto-generated method stub
	
	
	public void cadastraAtleta() {
		String nome = teclado("\nDigite o nome do atleta [ENTER para retornar]: ");
		
		if(nome.isEmpty())
			return;
		else {
			this.setNome(nome);
			
		}
	}//------------------------
	
	

	public void cadastraSaltos() {
		String salto = "0";
		while(!saltosCompletos() && !salto.isEmpty()) {
			int posicao = posicaoSalto();
			salto = verificaSalto(posicao);
			if(!salto.isEmpty())
				this.setSalto(posicao, Double.parseDouble(salto));
			}
		if(saltosCompletos())
			System.out.println("Todos os saltos deste atleta ja foram cadastrados!");
	}//------------------------

	public boolean saltosCompletos() {
		for(int i=0; i<saltos.length; i++)
			if(this.saltos[i]==null)
				return false;
		return true;
	}//------------------------

	private int posicaoSalto() {
		int posicao = 0;
		for(int i=0; i<saltos.length; i++) {
			posicao++;
			if(this.saltos[i]==null)
				return i;
		}
			
		return posicao;
	}//------------------------

	private static String verificaSalto(int posicao) {
		// não usar recursao dentro do cath. Usar a recursao somente na saida final do metodo
		//usando String para pegar o ENTER
		try {
			String salto = teclado("Informe o salto "+(posicao+1)+" ou [ENTER] para retornar: ");
			if(salto.isEmpty()) return salto;
			if(Double.parseDouble(salto) < 0)
				System.out.println("Valor negativo invalido");
			else return salto;
		}catch(Exception e){
			System.out.println("Formato invalido");
		}
		return verificaSalto(posicao);
		//versao do metodo sem usar o try catch
		/*String salto;
		do {
			salto = teclado("Informe o salto "+(posicao+1)+" ou [ENTER] para retornar: ");
			if(salto.isEmpty())
				return salto;
			if(Double.parseDouble(salto) < 0)
				System.out.println(" !!! Valor negativo invalido. Digite novo valor !!!");
			posicao++;
		}while(Double.parseDouble(salto) < 0);
		return salto;
		*/
	}//---------------------------

	private static String teclado(String msg) {
		System.out.print(msg);
		return new Scanner(System.in).nextLine();
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
	
	public String mediaSaltosTexto() {
		double soma = 0, media;
		int totalSaltos = this.posicaoSalto();
		if(totalSaltos == 0)
			return "(nenhum salto cadastrado)";
		for(int i = 0; i<totalSaltos; i++)
			soma += this.saltos[i];
		media = soma/totalSaltos;
		if(totalSaltos == saltos.length)
			return media + " (media final)";
		return media + " (media parcial)";
	}
	
	public double media3SaltosValidos() {
		double soma = 0;
		for(int i = 0; i<this.saltos.length; i++)
			soma += this.saltos[i];
		return (soma-this.piorSalto()-this.melhorSalto())/3;
	}//------------------------
	
	public String toString() {
		String relatorio = "";
		relatorio += "\n Nome: " + this.nome;
		relatorio += "\n" + getSaltos();
		relatorio += "\n Media dos saltos: " + this.mediaSaltosTexto();
		//relatorio += "\n Pior salto: " + this.piorSalto();
		//relatorio += "\n Melhor salto: " + this.melhorSalto();
		//relatorio += "\n Media dos 5 saltos: " + this.mediaSaltos();
		//relatorio += "\n Media dos 3 saltos validos: " + this.media3SaltosValidos();
		return relatorio;
	}//------------------------

	private String getSaltos() {
		String saltos = "";
		for(int i = 0; i<this.saltos.length; i++)
			if(this.saltos[i] == null)
				saltos += "\nSalto " + (i+1) + ": Nao Cadastrado";
			else saltos += "\nSalto " + (i+1) + ": " + this.saltos[i];
		return saltos;
		
	}//------------------------

	

}//end of class
