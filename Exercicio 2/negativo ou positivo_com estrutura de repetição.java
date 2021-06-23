import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
			int x= 0;
		// Começo da estrutura de loop condicional, enquanto for 1 repita o prog	
		do {
			int a;
			
			System.out.println("Insira um número");
			a = sc.nextInt();
			
			if (a < 0) {
				System.out.println("|"+ a + "| Seu número é negativo!");
			} else if (a == 0) {
				System.out.println("|"+ a + "| Seu numero é zero!");
				} else { 
					System.out.println("|"+ a + "| Seu numero é Positivo! ");
				}
			
			
			
			/// Area de repetição, usar para testes 
			System.out.printf("%n%nGostaria de tentar novamente?(1 ou 0)");
			x = sc.nextInt();
			
					
		} 
        // condição da estrutura, se for 0 pare, se for 1 repita a main
		while (x==1); {
			System.out.println("ok, tenha um otimo dia!");
		}
		
		sc.close();
	}

}
