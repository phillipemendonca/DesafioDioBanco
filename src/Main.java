
public class Main {

	public static void main(String[] args) {
		Cliente phillipe = new Cliente();
		venilton.setNome("Phillipe");
		
		Conta cc = new ContaCorrente(phillipe);
		Conta poupanca = new ContaPoupanca(phillipe);

		cc.depositar(100);
		cc.transferir(100, poupanca);
		
		cc.imprimirExtrato();
		poupanca.imprimirExtrato();
	}

}
