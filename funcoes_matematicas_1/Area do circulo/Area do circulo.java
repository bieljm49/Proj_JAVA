import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US); // lib declarada antes de usar esse tipo de metodo para utilizar "." ao invés de ",".
		Scanner sc = new Scanner(System.in);
		
		double raio, pi, resultado= 0;
		pi = 3.14159;
		
		raio = sc.nextDouble();
				
		resultado = pi * Math.pow(raio, 2.0);
		
		System.out.println("Entrada:");
		System.out.println(raio);
		System.out.println("Saída:");
		System.out.printf("Resultado= %.4f", resultado);
				
		
		sc.close();
	}

}
