import Model.Conta;
import Model.ContaEspecial;


public class AppContaBanco {
	public static void main(String args[]) {
		
		
		Conta c1, c2, c3, c4, c5;
		c1 = new Conta("Titular 1", "CPF1", 10011,1000);
		c2 = new ContaEspecial("TitularE 2", "CPF2", 10022, 1000, 1000);
		c3 = new Conta("Titular 3", "CPF3", 10033, 1300);
		c4 = new ContaEspecial("TitularE 4", "CPF4", 10044, 2000, 1000);
		c5 = new ContaEspecial("TitularE 5", "CPF5", 10055, 4000, 3000);
		
		System.out.println(c1);
		System.out.println(c2);
		System.out.println(c3);
		System.out.println(c4);
		System.out.println(c5);
		
	}
		
}
