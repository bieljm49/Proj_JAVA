import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US); // lib declarada antes de usar esse tipo de metodo para utilizar "." ao invés de// ",".
		Scanner sc = new Scanner(System.in);
		
		
		// Area de declaração de variaveis
		
		 
		int horasTrab = 0;
		int numFun = 0;
		
		
		double valorHoras, salario, tempEmp = 0;
		
		String nome;
				
		// Interface entrada e saída de dados
		
		System.out.println("Digite o seu nome:");
		nome = sc.nextLine();

		System.out.println("Digite sua matricula:");
		numFun = sc.nextInt();
		
		System.out.println("Quanto tempo no cargo atual?");
		tempEmp = sc.nextDouble();


		System.out.println("Quantas horas você trabalhou este mês?");
		horasTrab = sc.nextInt();

		System.out.println("Qual é o valor da sua hora trabalhada?(Obs: Use '.' ");
		valorHoras = sc.nextDouble();

		salario = valorHoras * horasTrab;

		System.out.println(" Dados digitados: ");
		System.out.println("*******************");
		
		/* System.out.println("-" + nome);
		System.out.println("----------------");
		System.out.println("* " + numFun);
		System.out.println("----------------");
		System.out.println("* " + horasTrab);
		System.out.println("----------------");
		System.out.println("* " + valorHoras);
		System.out.println("----------------");*/
		
		System.out.println("O " + nome + " de matricula |" + numFun + "| terá o salario de:");
		System.out.println("----------------");
		System.out.printf("Salario= U$ %.2f %n", salario);
		System.out.println("----------------");
		System.out.println("----------------");
		
		// Area de metodos
		
		// Valida_Salario
		if (salario >= 4500 || tempEmp < 1) {
			System.out.println("Você não poderá ser promovido nesse momento!");
				} else
					System.out.println("Seja um bom funcionario para ser promovido!)");
		
		// Diferencia matricula (numFun)
		if (numFun <= 5 && salario >= 10000) {
			System.out.println("Você é da alta gestão da empresa");
		} else 			
			System.out.println("Verifique os dados inseridos, estão incompativeis com a sua matricula.");
							
		// melhorar o sistema para colocar um laço de loop com a pergunta abaixo:
		//System.out.println(" Deseja refazer a consulta?");
				
		
		sc.close();
					
	}
	
}
