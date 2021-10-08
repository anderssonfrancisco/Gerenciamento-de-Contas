package contas;

public abstract class Conta {
	private int numero;
	private int agencia;
	private String banco;
	protected double saldo;
	protected double sacar;
	protected double depositar;
	
	public void setNumero(int numero) {
		this.numero = numero;
	}
	
	public int getNumero() {
		return numero;
	}
	
	public void setAgencia(int agencia) {
		this.agencia = agencia;
	}
	
	public int getAgencia() {
		return agencia;
	}
	
	public void setBanco(String banco) {
		this.banco = banco;
	}
	
	public String getBanco() {
		return banco;
	}
	
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	
	public abstract double getSaldo();
	
	public void setSacar(double sacar) {
		this.sacar = sacar;
	}
	
	public abstract double getSacar();
	
	public void setDepositar(double depositar) {
		this.depositar = depositar;
	}
	
	public abstract double getDepositar();
	
	public Conta(int numero, int agencia, String banco, double saldo) {
		this.numero = numero;
		this.agencia = agencia;
		this.banco = banco;
		this.saldo = saldo;
	}
	
	@Override
	public String toString() {
		return "conta{" + "numero=" + numero + ", agencia=" + agencia +
				", banco=" + banco + '\'' + ", saldo=" + saldo + '}';
	}

}
