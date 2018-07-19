
public class Funcionario {
	private String nome;
	private double salario;
	
	public Funcionario(String nome) {
		this.setNome(nome);
	}//------------------------------
	
	public String getNome() {
		return this.nome;
	}//------------------------------
	
	public void setNome(String nome) {
		this.nome = nome;
	}//------------------------------
	
	public double getSalario() {
		return this.salario;
	}//------------------------------
	
	public void setSalario(double salario) {
		this.salario = salario;
	}//------------------------------
	
	public String toString() {
		String dados = " === Dados do Funcionario ===";
		dados += "\nNome: " + this.getNome();
		dados += "\nSalario: " + this.getSalario();
		return dados; 
	}//------------------------------
	
	public double salario12Meses() {
		return 12*this.getSalario();
	}//------------------------------
	
	public void aumento(float indice) {
		this.setSalario(this.getSalario()+indice*this.getSalario()/100); // this.salario+=this.salario*indice/100;
	}//------------------------------

}
