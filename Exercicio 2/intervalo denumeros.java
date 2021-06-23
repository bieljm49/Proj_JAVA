import java.util.Locale;
import java.util.Scanner;


public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US); 
		Scanner sc = new Scanner(System.in);
		
		int x =0; 
		
		// A main de fato começa aqui.
		do {
			
			Double i = 0.0;
			
			System.out.println("Descubra o intervalo: ([0,25], [25,50], [50,75], [75,100]");
			System.out.println("Digite um numero:");
			i = sc.nextDouble();
			
			if(i <= 0.0) {
				System.out.println("Seu numero está fora do intervalo devido!");
			}else if(i <= 25.0) {
				System.out.println("O seu intervalo está entre [0,25]");
				
			}else if(i <= 50.0) {
				System.out.println("O seu intervalo está entre [25,50]]");
				
			}else if(i <= 75.0) {
				System.out.println("O seu intervalo está entre [50,75]");
				
			}else if(i <= 100.0) { 
				System.out.println("O seu intervalo está entre [75,100]");
			}else  
				System.out.println("O seu numero está fora do intervalo!");
			
			
			System.out.printf("%n%nGostaria de tentar novamente?(1 ou 0)");
			x = sc.nextInt();
			
			}
		
			while (x==1); 
			System.out.println("ok, tenha um otimo dia!");
		
			
	sc.close();
		
	}
}
