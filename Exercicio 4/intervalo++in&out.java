import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);	
		int n=0;
		int x;
		int out = 0;
		int in= 0;
		
		System.out.println("Digite a quantidade de numeros que você quer inserir");
		n = sc.nextInt();
		
		for(int i = 0; i < n; i++) {
			System.out.println("Insira X:");
			x = sc.nextInt();	
			if (x < 10) {
				out++;
			}else if (x > 20) {
				out++;
			}else {
				in++;
			
		}
			
		}
		System.out.println(in + " in");
		System.out.println(out + " out");
						sc.close();	
	}
	

}