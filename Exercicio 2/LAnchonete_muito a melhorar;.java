import java.util.Locale;
import java.util.Scanner;


public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US); 
		int x =0;  
		// teste gitHub 
		// A main de fato começa aqui.
			
			int codigo, quantidade, c;
			String cardapio;
			double total =0;
			
			
			do {
				System.out.println("____________________");	
				System.out.println("|1- Cachorro quente|");
				System.out.println("|2- X- Salada	   |");
				System.out.println("|3- X- Bacon	   |");
				System.out.println("|4- Torrada simples|");
				System.out.println("|5- Refrigerante   |");
				System.out.println("--------------------");		 						        								
			System.out.println("Diga o seu produto é a quantidade:");
			 codigo = sc.nextInt();
			 quantidade = sc.nextInt();
			 
			 switch (codigo) {
				case 1:
					total = quantidade * 4.0;
					break;
				case 2:
					total = quantidade * 4.5;
					break;
				case 3:
					total = quantidade * 5.0;
					break;
				case 4:
					total = quantidade * 2.0;
					break;
				case 5:
					total = quantidade * 1.5;
					break;
				default:
					System.out.println("Refaça o seu pedido!");
					break;
				}
			 
			 						 
					
			
			System.out.printf("Total: R$ %.2f%n", total);
			
		
		
			System.out.printf("%n%nGostaria de tentar novamente?(1 ou 0)");
			x = sc.nextInt();
			
					
		}
		while (x==1); 
		System.out.println("ok, tenha um otimo dia!");
	
			sc.close();
		
	}
}
