import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int x= 1, y = 1 ;
		
		while(x != 0 && y != 0) {
			
		
			System.out.println("Escreva a coordenada X");
			x = sc.nextInt();
					
			System.out.println("Escreva a coordenada Y");
			y = sc.nextInt();
	
				
			if (x == 0.0 && y == 0.0) {
				System.out.println("Origem, o programa irá fechar");
			}
			else if (x == 0.0) {
				System.out.println("Eixo Y, o programa irá fechar");
			}
			else if (y == 0.0) {
				System.out.println("Eixo X, o programa irá fechar");
			}
			else if (x > 0.0 && y > 0.0) {
				System.out.println("Q1- Primeiro");
			}
			else if (x < 0.0 && y > 0.0) {
				System.out.println("Q2- Segundo");
			}
			else if (x < 0.0 && y < 0.0) {
				System.out.println("Q3- Terceiro");
			} else {
				System.out.println("Q4- Quarto");
			}
			System.out.println(x);
			System.out.println(y);
			
		}	
			sc.close();	
	}
	

}
