import java.util.Scanner;

public class Pedido {
	private String dataPedido     ;
    private String nomeCliente    ;
    private String enderecoCliente;
    private String telefoneCliente;
    private String dataEntrega    ;
    private String corVidro       ;
    private double espessura      ;
    private double preco         ;
    
    public Pedido() {
    	this.setNomeCliente(teclado("Digite o nome do cliente ou [ENTER] para retornar: "));
    	if(this.getNomeCliente().isEmpty())
    		return;
    	this.setDataPedido(verificaData(teclado("Digite a data do pedido [DD/MM/AAAA]: ")));
    	this.setCorVidro(escolheCorDoVidro());
    }
    
	private String escolheCorDoVidro() {
		String cor[] = {"Verde", "Branco", "Escuro"};
		System.out.println("Cores disponíveis");
		for(int i = 0 ; i < cor.length ; i++)
			System.out.println(i+1+": "+cor[i]);
		int numeroCor = verificaNumeroCor(teclado("Selecione o numero conforme a cor: "));
		if(numeroCor < 1 || numeroCor > cor.length)
			escolheCorDoVidro();
		return cor[numeroCor-1];
	}

	private int verificaNumeroCor(String teclado) {
		// TODO Auto-generated method stub
		return 1;
		
	}

	/*private void verificaRetornaMenu() {
		String voltar = teclado("Confirma retornar ao menu anterior? \n [S]-SIM ou [N]-NAO");
		if(voltar.toUpperCase() == )
		
	}*/

	private String verificaData(String data) {
		if(data.length()==10 && dia(data) && mes(data) && ano(data) && separador(data) )
			return data;
		else 
			System.out.println("Data invalida");
		return verificaData(teclado("Digite a data novamente [DD/MM/AAAA]: "));
	}

	private boolean separador(String data) {
		String separadores = data.substring(2,3) + data.substring(5,6);
		//System.out.println(separadores);
		if( separadores.equals("//"))
				return true;
		System.out.println("Separadores de data invalidos. Use '/'");
		return false;
	}

	private boolean dia(String data) {
		String diaTexto = data.substring(0, 2);
		//System.out.println(diaTexto);
		try {
			int dia = Integer.parseInt(diaTexto);
			if( dia > 0 && dia <= 31)
				return true;
		}catch(Exception e){
			System.out.println("Formato invalido para DIA");
		}
		return false;
	}
	
	private boolean mes(String data) {
		String mesTexto = data.substring(3, 5);
		//System.out.println(mesTexto);
		try {
			int mes = Integer.parseInt(mesTexto);
			if( mes > 0 && mes <= 12)
				return true;
		}catch(Exception e){
			System.out.println("Formato invalido para MES");
		}
		return false;
	}
	
	private boolean ano(String data) {
		String anoTexto = data.substring(6, 10);
		//System.out.println(anoTexto);
		try {
			int ano = Integer.parseInt(anoTexto);
			if( ano > 0 && ano <= 2018)
				return true;
		}catch(Exception e){
			System.out.println("Formato invalido para ANO");
		}
		return false;
	}

	public String getDataPedido() {
		return dataPedido;
	}
	public void setDataPedido(String dataPedido) {
		this.dataPedido = dataPedido;
	}
	public String getNomeCliente() {
		return nomeCliente;
	}
	public void setNomeCliente(String nomeCliente) {
		this.nomeCliente = nomeCliente;
	}
	public String getEnderecoCliente() {
		return enderecoCliente;
	}
	public void setEnderecoCliente(String enderecoCliente) {
		this.enderecoCliente = enderecoCliente;
	}
	public String getTelefoneCliente() {
		return telefoneCliente;
	}
	public void setTelefoneCliente(String telefoneCliente) {
		this.telefoneCliente = telefoneCliente;
	}
	public String getDataEntrega() {
		return dataEntrega;
	}
	public void setDataEntrega(String dataEntrega) {
		this.dataEntrega = dataEntrega;
	}
	public String getCorVidro() {
		return corVidro;
	}
	public void setCorVidro(String corVidro) {
		this.corVidro = corVidro;
	}
	public double getEspessura() {
		return espessura;
	}
	public void setEspessura(double espessura) {
		this.espessura = espessura;
	}
	public double getPreco() {
		return preco;
	}
	public void setPreco(double preco) {
		this.preco = preco;
	}
	
	public String toString() {
		String menu = "\n      Data Entrega: ";
		menu+= this.getDataEntrega();
		menu+= "\n         Cliente: ";
		menu+= this.getNomeCliente();
		menu+= "   Fone: ";
		menu+= this.getTelefoneCliente();
		menu+= "\n         Endereco: ";
		menu+= this.getEnderecoCliente();
		menu+= "   Valor: ";
		menu+= this.getPreco();
		
		return menu;
	}
	
	private static String teclado(String msg) {
		System.out.print(msg);
		return new Scanner(System.in).nextLine();
	}//-----------------------------------

}
