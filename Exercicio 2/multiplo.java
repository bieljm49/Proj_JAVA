import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
			int x= 0;
			
		do {
			// A main de fato começa aqui.
			
			int a, b = 0 ;
					
			
			System.out.println("Insira o 1° número");
			a = sc.nextInt();
			System.out.println("Insira o 2° número");
			b = sc.nextInt();
						
			if (a % b == 0 || b % a ==0  ) {
				System.out.println("Seu numero MULTIPLO!");
			} else  
				System.out.println("Seu numero NÃO É MULTIPLO!");
				
			
			/// Area de repetição, usar para testes 
			System.out.printf("%n%nGostaria de tentar novamente?(1 ou 0)");
			x = sc.nextInt();
			}
		while (x==1); {
			System.out.println("ok, tenha um otimo dia!");
	
		sc.close();
		}
	}
}
