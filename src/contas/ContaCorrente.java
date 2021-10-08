package contas;

public class ContaCorrente extends Conta{
	private double chequeEspecial;
	
	public ContaCorrente(int numero, int agencia, String banco, double saldo, double chequeEspecial) {
		super(numero, agencia, banco, saldo);
		this.chequeEspecial = chequeEspecial;
	}
	
	@Override
	public String toString() {
		return "ContaCorrente{" + "chequeEspecial=" + chequeEspecial + '}';
	}
	
	public double getSaldo() {
		return this.chequeEspecial + this.saldo + this.depositar;
	}
	
	public double getSacar() {
		if(chequeEspecial <= 1000.00) {	 
		}
		return this.sacar + chequeEspecial;
	}
	
	public double getDepositar() {
		return this.depositar;
	}

}
