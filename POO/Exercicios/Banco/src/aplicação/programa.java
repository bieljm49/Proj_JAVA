package aplicação;

import java.util.Locale;
import java.util.Scanner;

import banco.Conta;


public class programa {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		Conta Conta;
		int repete;
		
		do {
		System.out.printf("\t\t-----------------| Olá! Bom dia! |-----------------");
		
		System.out.printf("\n\t--------------| Seja muito bem-vindo ao banco BielBank |-----------------\n");
		System.out.println();
		
		//Utilitario.EscolhaServico();
		
		System.out.println();
		System.out.print("Digite o numero da sua conta:");
		int numConta = sc.nextInt();
		System.out.println();
		System.out.print("Digite o seu nome completo: ");
		sc.nextLine();
		String nome = sc.nextLine();
		System.out.println();
		
		System.out.println("Deseja depositar algum valor(Y/N)?");
		char resposta = sc.next().charAt(0);
		
		if(resposta == 'Y' || resposta == 'y' ) {
			System.out.print("Digite o valor inicial: R$ ");
			double saldoInicial = sc.nextDouble();
			
			Conta = new Conta(numConta, nome, saldoInicial);
			
			}else {				
			Conta = new Conta(numConta, nome);
			
			System.out.println("Conta criada com sucesso!");
			System.out.println("Muito obrigado por escolher o BielBank!");
						
			}
		
		System.out.println(Conta);
		System.out.println("----------------------------------");
		
		System.out.print("Digite o seu deposito: R$ ");
		double valorDeposito= sc.nextDouble();
		Conta.deposito(valorDeposito);
		
		System.out.println(Conta);
		System.out.println("----------------------------------");
		
		System.out.print("Digite o saque desejado: R$ ");
		double valorSaque= sc.nextDouble();
		Conta.saque(valorSaque);
		
		System.out.println(Conta);
		System.out.println("----------------------------------");
		
		// Area de repetição para teste
		
		System.out.println("Deseja continuar?");
		repete = sc.nextInt();
		
		
		} while(repete != 3);
			
		sc.close();			
		}
		
}
