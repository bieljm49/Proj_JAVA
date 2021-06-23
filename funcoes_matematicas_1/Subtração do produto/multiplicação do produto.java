import java.util.Locale;
import java.util.Scanner;
//Correção: https://github.com/acenelio/nivelamento-java/blob/master/src/uri1007.java
public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US); // lib declarada antes de usar esse tipo de metodo para utilizar "." ao invés de ",".
		Scanner sc = new Scanner(System.in);
		
		int a , b , c , d , diferenca =0;
			
		a = sc.nextInt();
		b = sc.nextInt();
		c = sc.nextInt();
		d = sc.nextInt();
				
		diferenca = ((a * b) - (c * d));
		
		System.out.println("Entrada:");
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println(d);
		System.out.println("Saída:");
		System.out.printf("Diferença= %d", diferenca);
				
		
		sc.close();
	}

}
