import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);	
		int x=0;
		int i=0;
		
		System.out.println("Digite valor inteiro X (1 <= X <= 1000)");
		x = sc.nextInt();
		if(x > 1000) {
			System.out.println("Seu numero é maior que 1000, seu valor será reduzido para 1000.");
			x=1000;
		} else {
				System.out.println("Seu numero é |" + x +"|");
		}
			for( i=1; i <= x; i = i + 2) {
				System.out.println("Seu numero é " + i);
				 
			}
						sc.close();	
	}
	

}