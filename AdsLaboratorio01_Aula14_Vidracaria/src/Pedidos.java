
public class Pedidos {
	private String dataPedido     ;
    private String nomeCliente    ;
    private String enderecoCliente;
    private String telefoneCliente;
    private String dataEntrega    ;
    private String corVidro       ;
    private double espessura      ;
    private double preco         ;
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

}
