package contas;

public class ContaSalario extends Conta{
       
	public ContaSalario(int numero, int agencia, String banco, double saldo, double sacar, double depositar) {
		super(numero, agencia, banco, saldo);
		
		
	}
	
	
	public double getSaldo() {
		return this.saldo - this.sacar;
	}
	
	public double getSacar() {
		for(double i = sacar; i < 3; i++) {	
		}
		 return this.sacar;
	}
	
	public double getDepositar() {
		return this.depositar;
	}
}
