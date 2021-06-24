import java.util.Locale;
import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);	
		
		int n=0;
		
		
		System.out.println("Digite a quantidade de pares a ser calculado:");
		n = sc.nextInt();
		
		for(int i = 0; i < n; i++) {
			
				double a= 0;
				System.out.println("Digite o 1º numero:");
				a= sc.nextDouble();
				
				
				double b= 0;
				System.out.println("Digite o 2º numero:");
				b= sc.nextDouble();
				
				if (b == 0) {
					System.out.println("divisao impossivel");
				}
				else {
					
					double div = (double) a / b;
					
					System.out.printf("%n Seu numero %.1f%n", div);
				}
		}					sc.close();	
	}
	

}