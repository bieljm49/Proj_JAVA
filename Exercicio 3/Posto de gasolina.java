import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int x =0;
		int A=0;
		int G=0;
		int D =0;
		
		while(x != 4) {
			System.out.printf("\t-----Escolha o combustivel de sua preferencia-----%n%n");
			System.out.println("\t\t1.Álcool 2.Gasolina 3.Diesel 4.Fim");
			x= sc.nextInt();
			
			switch(x) {
				case 1:
					A++;
					break;
				case 2:
					G++;
					break;
				case 3:
					D++;
					break;
				case 4:
					System.out.println("Muito obrigado!");
					System.out.println("---------------");
					System.out.println("Segue a prefêrencia do público:");
					System.out.println("Alcool: " + A);
					System.out.println("Gasolina:" + G);
					System.out.println("Diesel:" + D);
					break;
					default:
						System.out.println("Digite um dado valido!");
											
			}
			 
					
		}	
			sc.close();	
	}
	

}
