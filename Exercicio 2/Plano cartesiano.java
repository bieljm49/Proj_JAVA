import java.util.Locale;
import java.util.Scanner;


public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US); 
		Scanner sc = new Scanner(System.in);
		
		int l =0; 
		
		// A main de fato começa aqui.
		do {
			
			Double x, y = 0.0;
			
			System.out.println("|Plano cartesiano|");
			
			System.out.println("Digite o primeiro numero(X):");
			x = sc.nextDouble();
			
			System.out.println("Digite o Segundo numero(Y):");
			y = sc.nextDouble();
			
			if (x == 0.0 && y == 0.0) {
				System.out.println("Origem");
			}
			else if (x == 0.0) {
				System.out.println("Eixo Y");
			}
			else if (y == 0.0) {
				System.out.println("Eixo X");
			}
			else if (x > 0.0 && y > 0.0) {
				System.out.println("Q1");
			}
			else if (x < 0.0 && y > 0.0) {
				System.out.println("Q2");
			}
			else if (x < 0.0 && y < 0.0) {
				System.out.println("Q3");
			}
			else {
				System.out.println("Q4");
			}
			
			
			System.out.printf("%n%nGostaria de tentar novamente?(1 ou 0)");
			l = sc.nextInt();
			
			}
		
			while (l==1); 
			//senão
			System.out.println("ok, tenha um otimo dia!");
		
			
	sc.close();
		
	}
}
