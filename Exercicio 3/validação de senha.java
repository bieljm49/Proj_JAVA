import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int password = 0 ;
		String login = "jesus" ;
		
		/*while(login != "pai") {
			
			System.out.println("Digite o seu endereço de e-mail:");
			login = sc.next();
			if (login != 'pai) {
				System.out.println("Não existe este usuario!");
				}else 
					System.out.println("__________________");
			}
				*/while (password != 1502) { 
				System.out.println("Digite a sua senha: ");
				password = sc.nextInt();

				if (password != 1502) {
					System.out.println("Senha invalida!");
				}else 
						System.out.println("Acesso permitido!");
				
				};
					
			sc.close();	
		}
	

}
