

public class Main {

	public static void main(String[] args) {
		Cliente Vanderson = new Cliente();
		Vanderson.setNome("Vanderson");
		
		Conta cc = new ContaCorrente(Vanderson);
		Conta poupanca = new ContaPoupanca(Vanderson);

		cc.depositar(1000);
		cc.transferir(100, poupanca);
		
		cc.imprimirExtrato();
		poupanca.imprimirExtrato();
	}

}