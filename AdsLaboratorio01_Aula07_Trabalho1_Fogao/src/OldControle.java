import java.util.Scanner;

public class OldControle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner e = new Scanner(System.in);
		int resposta, botao;
		
		OldFogao f1 = new OldFogao();
		
		while(true){
			System.out.println("1 - Altera posi��o do Bot�o");
			System.out.println("2 - Mostra Status do Fog�o");
			System.out.print("Escolha: ");
			resposta = e.nextInt();
			if(resposta == 1) {
				botao = f1.escolheBotao();
				f1.alteraStatusQueimador(botao);
			}
			else if(resposta ==2)
				f1.status();
			else
				System.out.println("opcao invalida");
			
		}
		

	}//fim do main

}//fim da classe



