package Model;

public class ContaEspecial extends Conta {
	
	private float limite;

	public ContaEspecial(String nomeTitular, String cpf, int numConta, float saldo, float limite) {
		super(nomeTitular, cpf, numConta, saldo);
		this.limite = limite;
	}
	
	public boolean debitar(float valor) {
		if (valor <= super.saldo + this.limite) {
			super.saldo -= valor;
			return true;
		}
		return false;
	}
	
	public float getLimite() {
		return limite;
	}

	public void setLimite(float limite) {
		this.limite = limite;
	}

	public ContaEspecial(String nomeTitular, String cpf, int numeroConta, double saldo, float limite) {
		super(nomeTitular, cpf, numeroConta, saldo);
		this.limite = limite;
	}
	
	
	public String toString() {
		return "CONTA ESPECIAL: "+super.numeroConta+"  TITULAR:"+ super.nomeTitular + 
				 "("+super.cpf+")   SALDO R$ "+super.saldo+"   LIMITE R$ "+this.limite;
	}
	

}
