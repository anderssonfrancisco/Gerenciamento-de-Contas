package contas;

public class TestarConta {
	public static void main(String[] args) {
//      Conta c1 = new Conta(1, 1,"Banco AA", 10.00);
//		System.out.println(c1);
		
		ContaCorrente cc1 = new ContaCorrente(22, 1, "Banco AA", 100.00, 1000.00);
		System.out.println(cc1);
		
		System.out.println("O saldo da Conta Corrente é R$"+cc1.getSaldo());
		
		ContaPoupanca cp = new ContaPoupanca(33, 3, "Banco CC", 10, 15, 0.05);
		System.out.println("O saldo da Conta Poupança é R$"+cp.getSaldo());
		
		ContaSalario cs = new ContaSalario(44, 4, "Banco SS", 500, 100, 300);
	    System.out.println("O saldo da sua Conta Salario é R$"+cs.getSaldo());
		
	}

}
