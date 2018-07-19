import java.util.Scanner;

public class Avaliacao {
	
	static Aluno vAluno[] = new Aluno[10];

	public static void main(String[] args) {
		
		while(true) {
			char escolha = mostraMenu();
			switch(escolha) {
			case '1': cadastraAluno(); break;
			case '2': listaAlunos(); break;
			case '3': cadastraAvaliacao(); break;
			case '4': listaNotasEReprovados(); break;
			default: break;
			}
		}		
		
	}// fim de main
	
	private static void listaNotasEReprovados() {
		if(posicao() == 0)
			System.out.println("!!! Lista vazia. Cadastre pelo menos um aluno !!!");
		else {
			System.out.println("== LISTAGEM ==");
			for(Aluno a:vAluno)
				if(a != null) {
					System.out.print("Matricula: "+a.getMatricula());
					System.out.print(" - Avaliacao 1: "+a.getAvaliacao1());
					System.out.print(" - Avaliacao 2: "+a.getAvaliacao2());
					if(a.getAvaliacao1() == 'D' && a.getAvaliacao2() == 'D')
						System.out.print(" - REPROVADO");
					System.out.println();
				}
			
		}	
		
	}//-------------------------------------

	private static void cadastraAvaliacao() {
		if(posicao() == 0)
			System.out.println("!!! Lista vazia. Cadastre pelo menos um aluno !!!");
		else {
			listaAlunos();
			System.out.println("Selecione um aluno conforme matricula:");
			String matAluno = teclado();
			int indice = posicaoAluno(matAluno);
			System.out.println("Digite o conceito da Avaliacao 1");
			vAluno[indice].setAvaliacao1(teclado().toUpperCase().charAt(0)); //TODO verificar se conceitos diferentes de A,B,C ou D
			System.out.println("Digite o conceito da Avaliacao 2");
			vAluno[indice].setAvaliacao2(teclado().toUpperCase().charAt(0));
		}	
		
	}//-------------------------------------

	private static int posicaoAluno(String matAluno) {
		int posicao = 0;
		for(Aluno a:vAluno)
			if(a.getMatricula().equals(matAluno))
				return posicao;
			else posicao++;
		return posicao;
	}//-------------------------------------

	private static void listaAlunos() {
		if(posicao() == 0)
			System.out.println("!!! Lista vazia !!!");
		else {
			System.out.println("== LISTAGEM ==");
			for(Aluno a:vAluno)
				if(a != null) {
					System.out.print("Matricula: "+a.getMatricula());
					System.out.println(" - Aluno: "+a.getNome());
				}
		}		
		
	}//-------------------------------------

	private static void cadastraAluno() {
		String menu;
		menu =   "MENU - Cadastro de Aluno";
		menu+= "\n=====================";
	    menu+= "\nPara retornar, digite [ENTER]";
		menu+= "\nDigite a matricula (maximo 9 digitos): ";
		System.out.print(menu);
		
		
		if(!cadastroCompleto()) {  //1o-Verificar se array de alunos está completo   !!!
			String matricula = teclado(); //2o-Verificar se [ENTER] foi pressionado para retornar !!!
			if(!matricula.isEmpty()) {
				while(matricula.length()>9) {
					System.out.println("A matricula deve ter no maximo 9 digitos. Digite novamente.");
					matricula = teclado();
				}
				matricula = String.format("%09d", Integer.parseInt(matricula));
				int posicao = posicao();  //3o-Verificar a posicao do cadastro ainda não preenchido - null
				vAluno[posicao] = new Aluno();				
				vAluno[posicao].setMatricula(matricula);
				menu = "\nDigite o nome do aluno: ";
				System.out.print(menu);
				vAluno[posicao].setNome(teclado());
			}
		}
		else System.out.println("!!! Cadastro completo !!!");
			
	}//-------------------------------------

    private static int posicao() {
		int posicao = 0;
		for(Aluno a:vAluno)
			if(a == null)
				return posicao;
			else posicao++;
		
		return posicao;
	}//-------------------------------------

	private static boolean cadastroCompleto() {
		for(int i=0;i<vAluno.length;i++)
			if(vAluno[i]==null)
				return false;
		return true;
	}//-------------------------------------

	public static char mostraMenu() {
		String menu;
		menu =   "MENU";
		menu+= "\n=====================";
		menu+= "\n    1- Cadastrar Alunos";
		menu+= "\n    2- Listagem de Alunos";
		menu+= "\n    3- Cadastrar Avaliacao";
		menu+= "\n    4- Listagem de Alunos Reprovados";
		menu+= "\n       Escolha: ";
		
		System.out.print(menu);
		return digitaEscolha();
	}//-------------------------------------

	private static char digitaEscolha() {
		return teclado().charAt(0);
	}//-------------------------------------
	
	private static String teclado() {
		return new Scanner(System.in).nextLine();
	}//-------------------------------------

}// fim da classe
