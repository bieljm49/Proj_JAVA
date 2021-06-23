import java.util.Scanner;
// Correção: https://github.com/acenelio/nivelamento-java/blob/master/src/uri1003.java
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int x = 0 , y = 0 , soma = 0;
				
		x = sc.nextInt();
		y = sc.nextInt();
				
		soma = x + y;
		
		System.out.println("Entrada:");
		System.out.println(x);
		System.out.println(y);
		System.out.println("Saída:");
		System.out.println("Soma= " + soma);
				
		
		sc.close();
	}

}
