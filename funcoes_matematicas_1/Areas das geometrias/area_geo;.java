import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US); // lib declarada antes de usar esse tipo de metodo para utilizar "." ao invés de// ",".
		Scanner sc = new Scanner(System.in);
		
		
		// Area de declaração de variaveis
		
		 
		double a, b ,c, resultado = 0;	
		
						
		// Interface entrada e saída de dados
		
		System.out.println("Digite o A: ");
		a = sc.nextDouble();

		System.out.println("Digite o B: ");
		b = sc.nextDouble();
		
		System.out.println("Digite o C: ");
		c = sc.nextDouble();
		
		// Area de metodos
		
		//Área do triângulo retângulo
		resultado = (a * c) / 2;
		System.out.printf("Área do triângulo retângulo é igual a: %.3f %n", resultado);
		
		// área do círculo 
		resultado = 0;
		double pi = 3.14159;
		resultado = pi * Math.pow(c, 2);
		System.out.printf("área do círculo é igual a: %.3f %n", resultado);
		
		// área do trapézio
		resultado = 0;
		resultado = (c * (a+b))/2; 
		System.out.printf("área do trapézio é igual a: %.3f %n", resultado);
		
		// Area do quadrado
		resultado =0;
		resultado = Math.pow(b, 2);
		System.out.printf("Area do quadrado é igual a: %.3f %n", resultado);
		
		// Area do retangulo
		resultado = 0;
		resultado = a * b ;
		System.out.printf("Area do retangulo é igual a: %.3f %n", resultado);
		
		sc.close();
					
	}
	
}
