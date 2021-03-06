package contas;

public class ContaPoupanca extends Conta {
	private int diaAniversario;
	private double taxaDeJuros;
	
	public ContaPoupanca(int numero, int agencia, String banco, double saldo, int diaAniversario, double taxaDeJuros) {
		super(numero, agencia, banco, saldo);
		this.diaAniversario = diaAniversario;
		this.taxaDeJuros = taxaDeJuros;
	}
	
	public double getSaldo() {
		return this.saldo + this.taxaDeJuros * this.saldo;
	}
	
	public double getSacar() {
		return this.sacar + this.taxaDeJuros * this.sacar;
	}
	
	public double getDepositar() {
		return this.depositar;
	}

}
