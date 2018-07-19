
public class ControleCadastro {
	
	static Funcionario funcionarioMaiorSalario = new Funcionario();

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Funcionario f1 = new Funcionario("Abner",1000);
		Funcionario f2 = new Funcionario("Bianca",300);
		Funcionario f3 = new Funcionario("Cassio",5000);
		Funcionario f4 = new Funcionario("Daniela",2500);
		Funcionario f5 = new Funcionario("Edgar",3600);
		Funcionario f6 = new Funcionario("Francisca",2700);
		Funcionario f7 = new Funcionario("Gabriel",5850);
		Funcionario f8 = new Funcionario("Hellen",4500);
		Funcionario f9 = new Funcionario("Igor",3800);
		Funcionario f10 = new Funcionario("Janete",1100);

		maiorSalario(f1);
		maiorSalario(f2);
		maiorSalario(f3);
		maiorSalario(f4);
		maiorSalario(f5);
		maiorSalario(f6);
		maiorSalario(f7);
		maiorSalario(f8);
		maiorSalario(f9);
		maiorSalario(f10);
		
		System.out.println("Funcionario de maior salario: "+funcionarioMaiorSalario.getNome());
		System.out.println("Salario: "+funcionarioMaiorSalario.getSalario());
		

	}
	
	private static void maiorSalario(Funcionario funcionario) {
		
		if(funcionario.getSalario()>funcionarioMaiorSalario.getSalario())
			funcionarioMaiorSalario = funcionario;
	}

}
