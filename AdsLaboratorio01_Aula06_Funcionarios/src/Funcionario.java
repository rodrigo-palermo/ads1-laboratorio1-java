
public class Funcionario {
	private String nome;
	private double salario;
	
	public Funcionario() {
		this.nome = "";
		this.salario = 0;
	}
	
	public Funcionario(String nome, int salario) {
		this.nome = nome;
		this.salario = salario;
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public double getSalario() {
		return salario;
	}
	public void setSalario(double salario) {
		this.salario = salario;
	}
	
	public String mostraDados() {
		return "Funcionario: "+this.getNome()+"\nSalario: "+this.getSalario();
	}
	
	//IMPORTANTE: se usar o metodo toString() como nome do metodo para a CLASSE, pode-se imprimir os dados diretamente
	public String toString() {
		return "Funcionario: "+this.getNome()+", Salario: "+this.getSalario();
	}
	

}
