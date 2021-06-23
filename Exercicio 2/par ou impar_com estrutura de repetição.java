import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
			int x= 0;
			
		do {
			// A main de fato começa aqui.
			
			double a= 0 ;
			double resto, div;
						
			System.out.println("Insira um número");
			a = sc.nextInt();
			
						
			if (a % 2 == 0) {
				System.out.println("Seu numero é PAR!");
			} else  
				System.out.println("Seu numero é IMPAR!");
				
			
			
			
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
