
public class APS3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Funcionario f1 = new Funcionario("Pedro");
		f1.setSalario(2500.50);
		System.out.println(f1);
		
		System.out.print("\nSalario anual: " + f1.salario12Meses());
		
		System.out.println("\nAumento salarial de 15%");
		f1.aumento(15);
		
		System.out.println(f1);
		
		
		

	}

}
