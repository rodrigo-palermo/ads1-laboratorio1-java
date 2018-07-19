import java.util.Scanner;

public class ControleCadastroArray {

	static private Funcionario funcionarioMaiorSalario = new Funcionario();
	static private Funcionario listaDeFuncionarios[] = new Funcionario[3];
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//NAO CRIAR OBJETO funcionario fora do loop. Explicacao no metodo maiorSalario()
		for(int k=0;k<listaDeFuncionarios.length;k++) {
			
			/*//Inicializacao - Alternativa 1: sem usar array. Inicializa um OBJ a cada loop e Somente array na atribuicao
			Funcionario funcionario = new Funcionario();
			funcionario.setNome(lerNome("Digite o nome: "));
			funcionario.setSalario(lerSalario("Digite o salario: "));
			
			listaDeFuncionarios[k] = funcionario;
			
			*/
			
			//Inicializacao - Alternativa 2: usar array
			listaDeFuncionarios[k] = new Funcionario();
			listaDeFuncionarios[k].setNome(lerNome("Digite o nome: "));
			listaDeFuncionarios[k].setSalario(lerSalario("Digite o salario: "));
						
			
		
			maiorSalario(listaDeFuncionarios[k]);
		}
		
		//mostraMaiorSalario(); //FORMA 1
		//System.out.println(funcionarioMaiorSalario.mostraDados()); // FORMA 2
		System.out.println("=== MAIOR SALARIO ===");
		System.out.println(funcionarioMaiorSalario); //FORMA 3 - chama toString ao solicitar para imprimir um OBJETO
		
		System.out.println("=== LISTA DE FUNCIONARIOS ===");
		mostraListaDeFuncionarios();

	}

	private static void mostraListaDeFuncionarios() {
		// TODO Auto-generated method stub
		for(int i=0;i<listaDeFuncionarios.length;i++)
			System.out.println(listaDeFuncionarios[i]);
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
		/*PONTEIRO: Um objeto IGUAL a outro. Somente aponta o endereco. 
		 *Nao atribui valores. Caso atribua usando SET, a instancia de objetos pode ficar fora do loop em main
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
