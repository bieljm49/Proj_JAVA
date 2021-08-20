package banco;

public class Conta {
	private int numeroConta;
	private String nomeTitular;
	private double saldo;
	
	// construtor
		
	public Conta(int numConta, String nome, double saldoInicial) {
		this.numeroConta = numConta;
		this.nomeTitular = nome;
		deposito(saldoInicial);
	}
	public Conta(int numConta, String nome ) {
		this.numeroConta = numConta;
		this.nomeTitular = nome;
		
	}
	
	
	// Get / set
	public String getNomeTitular() {
		return nomeTitular;
		}
	
	public void setNomeTitular(String nome) {
		this.nomeTitular = nome;
		}
	//-----------------------------------------
	public int getNumeroConta() {
		return numeroConta;
	}
	
		 
	 // O numero da conta não poderá ser alterado, sendo assim não terá metodo set para essa operação
	

	//-----------------------------------------
	
	public double getSaldo() {
		return saldo;
	}


		// Metodos
	
	public void deposito(double quantidade) {
		saldo += quantidade;
	}
			
	public void saque(double quantidade) {
		saldo -= quantidade + 5.0;
	}
	
	
		
	// TO STRING
	public String toString() {
		return "Segue os dados da sua conta"
		+ "\n-----------------------------"
		+ String.format("\nNumero de conta:" + getNumeroConta() )
		+ String.format("\nNome do titular:" + getNomeTitular())
		+ String.format("\nSaldo atual: R$%.2f", getSaldo());
	}
	
}
