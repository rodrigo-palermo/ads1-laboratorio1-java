import java.util.Scanner;

public class ControleCadastro2 {

	static private Funcionario funcionarioMaiorSalario = new Funcionario();
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//NAO CRIAR OBJETO funcionario fora do loop. Explicacao no metodo maiorSalario()
		for(int k=0;k<3;k++) {
			Funcionario funcionario = new Funcionario();
			funcionario.setNome(lerNome("Digite o nome: "));
			funcionario.setSalario(lerSalario("Digite o salario: "));
			maiorSalario(funcionario);
		}
		
		//mostraMaiorSalario(); //FORMA 1
		//System.out.println(funcionarioMaiorSalario.mostraDados()); // FORMA 2
		System.out.println("=== MAIOR SALARIO ===");
		System.out.println(funcionarioMaiorSalario); //FORMA 3 - chama toString ao solicitar para imprimir um OBJETO
		

	}

	private static void mostraMaiorSalario() { //OBS.: Pode ser assim, mas como se trata de informacoes de OBJETO, fazer metodo dentro da CLASSE
		// TODO Auto-generated method stub
		System.out.println("=== MAIOR SALARIO ===");
		System.out.println("Funcionario: "+funcionarioMaiorSalario.getNome());
		System.out.println("Salario: "+funcionarioMaiorSalario.getSalario());
		
	}

	private static void maiorSalario(Funcionario funcionario) {
		// TODO Auto-generated method stub
		if(funcionario.getSalario() > funcionarioMaiorSalario.getSalario())
			funcionarioMaiorSalario = funcionario; 
		/*PONTEIRO: Um objeto IGAUL a outro. Somente aponta o endereco. 
		 *Nao atribui valores. Caso atribua usando SET, a instancia de objetos pode ficar fora do loop
		*/
	}

	private static double lerSalario(String string) {
		// TODO Auto-generated method stub
		System.out.print(string);
		double salario = new Scanner(System.in).nextDouble();
		return salario;
	}

	private static String lerNome(String string) {
		// TODO Auto-generated method stub
		System.out.print(string);
		String nome = new Scanner(System.in).next();
		return nome;
	}

}
