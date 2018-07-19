
public class Aluno {
	private String matricula;
	private String nome;
	private char avaliacao1;
	private char avaliacao2;
	
	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}

	public void setNome(String nome) {
		this.nome = nome;
		
	}

	public String getMatricula() {
		return this.matricula;
	}
	
	public String getNome() {
		return this.nome;
	}

	public char getAvaliacao1() {
		return avaliacao1;
	}

	public void setAvaliacao1(char avaliacao1) {
		this.avaliacao1 = avaliacao1;
	}

	public char getAvaliacao2() {
		return avaliacao2;
	}

	public void setAvaliacao2(char avaliacao2) {
		this.avaliacao2 = avaliacao2;
	}

}
