package aplicação;
import java.util.Scanner;
public class Utilitario {
	
	public static void EscolhaServico(){
		Scanner sc = new Scanner(System.in);
		int x=0;
		while( x != 4) {
			System.out.printf("\n \t \t\t-----Escolha o serviço desejado -----%n%n");
			System.out.println("\t\t\t|1.Abertura de conta|"
								+ "\n\t\t\t|2.Entrar sem cartão|"
								+ "\n\t\t\t|3.Mais serviços    |"
								+ "\n\t\t\t|4.Sair da sessão   |\n");
			x= sc.nextInt();
			
		sc.close();
		}
	}
}